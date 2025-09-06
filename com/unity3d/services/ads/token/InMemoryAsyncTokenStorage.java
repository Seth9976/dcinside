package com.unity3d.services.ads.token;

import android.os.Handler;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.managers.IBiddingManager;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.TokenType;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilderWithExtras;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties.InitializationState;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InMemoryAsyncTokenStorage implements AsyncTokenStorage {
    class TokenListenerState {
        public IBiddingManager biddingManager;
        public boolean invoked;
        public Runnable runnable;
        public TokenType tokenType;

    }

    private Configuration _configuration;
    private boolean _configurationWasSet;
    private DeviceInfoReaderBuilderWithExtras _deviceInfoReaderBuilderWithExtras;
    private final Handler _handler;
    private final InitializationStatusReader _initStatusReader;
    private INativeTokenGenerator _nativeTokenGenerator;
    private final SDKMetricsSender _sdkMetrics;
    private boolean _tokenAvailable;
    private final List _tokenListeners;
    private TokenStorage _tokenStorage;

    public InMemoryAsyncTokenStorage(INativeTokenGenerator iNativeTokenGenerator0, Handler handler0, SDKMetricsSender sDKMetricsSender0, TokenStorage tokenStorage0) {
        this._tokenListeners = new LinkedList();
        this._tokenAvailable = false;
        this._configurationWasSet = false;
        this._configuration = new Configuration();
        this._initStatusReader = new InitializationStatusReader();
        this._handler = handler0;
        this._nativeTokenGenerator = iNativeTokenGenerator0;
        this._sdkMetrics = sDKMetricsSender0;
        this._tokenStorage = tokenStorage0;
    }

    private TokenListenerState addTimeoutHandler(IBiddingManager iBiddingManager0) {
        synchronized(this) {
            TokenListenerState inMemoryAsyncTokenStorage$TokenListenerState0 = new TokenListenerState(this);
            inMemoryAsyncTokenStorage$TokenListenerState0.biddingManager = iBiddingManager0;
            inMemoryAsyncTokenStorage$TokenListenerState0.tokenType = TokenType.TOKEN_REMOTE;
            inMemoryAsyncTokenStorage$TokenListenerState0.runnable = () -> synchronized(InMemoryAsyncTokenStorage.this) {
                if(InMemoryAsyncTokenStorage.this._tokenListeners.remove(this.val$state)) {
                    String s1 = this.val$state.tokenType == TokenType.TOKEN_REMOTE ? this.val$state.biddingManager.getFormattedToken(null) : null;
                    this.val$state.biddingManager.onUnityAdsTokenReady(s1);
                    try {
                        InMemoryAsyncTokenStorage.this._handler.removeCallbacks(this.val$state.runnable);
                    }
                    catch(Exception exception0) {
                        DeviceLog.exception("Failed to remove callback from a handler", exception0);
                    }
                }
                InMemoryAsyncTokenStorage.this.sendTokenMetrics(null, this.val$state.tokenType);
            };
            this._tokenListeners.add(inMemoryAsyncTokenStorage$TokenListenerState0);
            this._handler.postDelayed(inMemoryAsyncTokenStorage$TokenListenerState0.runnable, ((long)this._configuration.getTokenTimeout()));
            return inMemoryAsyncTokenStorage$TokenListenerState0;
        }

        class com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.1 implements Runnable {
            com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.1(TokenListenerState inMemoryAsyncTokenStorage$TokenListenerState0) {
            }

            @Override
            public void run() {
                InMemoryAsyncTokenStorage.this.notifyTokenReady(this.val$state, null);
            }
        }

    }

    private Map getMetricTags() {
        Map map0 = new HashMap();
        InitializationState sdkProperties$InitializationState0 = SdkProperties.getCurrentInitializationState();
        map0.put("state", this._initStatusReader.getInitializationStateString(sdkProperties$InitializationState0));
        return map0;
    }

    @Override  // com.unity3d.services.ads.token.AsyncTokenStorage
    public void getToken(IBiddingManager iBiddingManager0) {
        synchronized(this) {
            if(SdkProperties.getCurrentInitializationState() == InitializationState.INITIALIZED_FAILED) {
                iBiddingManager0.onUnityAdsTokenReady(null);
                this.sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
                return;
            }
            if(SdkProperties.getCurrentInitializationState() == InitializationState.NOT_INITIALIZED) {
                iBiddingManager0.onUnityAdsTokenReady(null);
                this.sendTokenMetrics(null, TokenType.TOKEN_REMOTE);
                return;
            }
            TokenListenerState inMemoryAsyncTokenStorage$TokenListenerState0 = this.addTimeoutHandler(iBiddingManager0);
            if(!this._configurationWasSet) {
                return;
            }
            this.handleTokenInvocation(inMemoryAsyncTokenStorage$TokenListenerState0);
        }
    }

    private void handleTokenInvocation(TokenListenerState inMemoryAsyncTokenStorage$TokenListenerState0) {
        if(inMemoryAsyncTokenStorage$TokenListenerState0.invoked) {
            return;
        }
        inMemoryAsyncTokenStorage$TokenListenerState0.invoked = true;
        if(!this._tokenAvailable) {
            inMemoryAsyncTokenStorage$TokenListenerState0.tokenType = TokenType.TOKEN_NATIVE;
            if(GMA.getInstance().hasSCARBiddingSupport() && this._deviceInfoReaderBuilderWithExtras != null) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("tid", inMemoryAsyncTokenStorage$TokenListenerState0.biddingManager.getTokenIdentifier());
                this._deviceInfoReaderBuilderWithExtras.setExtras(hashMap0);
            }
            this._nativeTokenGenerator.generateToken(new INativeTokenGeneratorListener() {
                @Override  // com.unity3d.services.ads.token.INativeTokenGeneratorListener
                public void onReady(String s) {
                    InMemoryAsyncTokenStorage.this._handler.post(new Runnable() {
                        @Override
                        public void run() {
                            InMemoryAsyncTokenStorage.this.notifyTokenReady(com.unity3d.services.ads.token.InMemoryAsyncTokenStorage.2.this.val$state, s);
                        }
                    });
                }
            });
            return;
        }
        inMemoryAsyncTokenStorage$TokenListenerState0.tokenType = TokenType.TOKEN_REMOTE;
        String s = this._tokenStorage.getToken();
        if(s != null && !s.isEmpty()) {
            this.notifyTokenReady(inMemoryAsyncTokenStorage$TokenListenerState0, s);
        }
    }

    private boolean isValidConfig(Configuration configuration0) {
        return configuration0 != null;
    }

    private void notifyListenersTokenReady() {
        synchronized(this) {
            while(!this._tokenListeners.isEmpty()) {
                String s = this._tokenStorage.getToken();
                if(s == null) {
                    break;
                }
                this.notifyTokenReady(((TokenListenerState)this._tokenListeners.get(0)), s);
            }
        }
    }

    // 检测为 Lambda 实现
    private void notifyTokenReady(TokenListenerState inMemoryAsyncTokenStorage$TokenListenerState0, String s) [...]

    @Override  // com.unity3d.services.ads.token.AsyncTokenStorage
    public void onTokenAvailable() {
        synchronized(this) {
            this._tokenAvailable = true;
            if(!this._configurationWasSet) {
                return;
            }
            this.notifyListenersTokenReady();
        }
    }

    private void sendNativeTokenMetrics(String s) {
        SDKMetricsSender sDKMetricsSender0 = this._sdkMetrics;
        if(sDKMetricsSender0 == null) {
            return;
        }
        if(s == null) {
            sDKMetricsSender0.sendMetric(TSIMetric.newNativeGeneratedTokenNull(this.getMetricTags()));
            return;
        }
        sDKMetricsSender0.sendMetric(TSIMetric.newNativeGeneratedTokenAvailable(this.getMetricTags()));
    }

    private void sendRemoteTokenMetrics(String s) {
        if(this._sdkMetrics == null) {
            return;
        }
        if(s != null && !s.isEmpty()) {
            Metric metric0 = TSIMetric.newAsyncTokenAvailable(this.getMetricTags());
            this._sdkMetrics.sendMetric(metric0);
            return;
        }
        Metric metric1 = TSIMetric.newAsyncTokenNull(this.getMetricTags());
        this._sdkMetrics.sendMetric(metric1);
    }

    private void sendTokenMetrics(String s, TokenType tokenType0) {
        switch(tokenType0) {
            case 1: {
                this.sendNativeTokenMetrics(s);
                return;
            }
            case 2: {
                this.sendRemoteTokenMetrics(s);
                return;
            }
            default: {
                DeviceLog.error("Unknown token type passed to sendTokenMetrics");
            }
        }
    }

    @Override  // com.unity3d.services.ads.token.AsyncTokenStorage
    public void setConfiguration(Configuration configuration0) {
        synchronized(this) {
            this._configuration = configuration0;
            boolean z = this.isValidConfig(configuration0);
            this._configurationWasSet = z;
            if(!z) {
                return;
            }
            if(this._nativeTokenGenerator == null) {
                this._deviceInfoReaderBuilderWithExtras = new DeviceInfoReaderBuilderWithExtras(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance());
                ExecutorService executorService0 = Executors.newSingleThreadExecutor();
                this._nativeTokenGenerator = new NativeTokenGenerator(executorService0, this._deviceInfoReaderBuilderWithExtras);
                if(configuration0.getExperiments().shouldNativeTokenAwaitPrivacy()) {
                    this._nativeTokenGenerator = new NativeTokenGeneratorWithPrivacyAwait(executorService0, this._nativeTokenGenerator, configuration0.getPrivacyRequestWaitTimeout());
                }
            }
            for(Object object0: new ArrayList(this._tokenListeners)) {
                this.handleTokenInvocation(((TokenListenerState)object0));
            }
        }
    }
}

