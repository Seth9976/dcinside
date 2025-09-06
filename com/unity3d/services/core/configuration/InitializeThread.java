package com.unity3d.services.core.configuration;

import android.annotation.TargetApi;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.api.DownloadLatestWebViewStatus;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.connectivity.IConnectivityListener;
import com.unity3d.services.core.device.reader.DeviceInfoDataFactory;
import com.unity3d.services.core.device.reader.IDeviceInfoDataContainer;
import com.unity3d.services.core.lifecycle.CachedLifecycle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties.InitializationState;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class InitializeThread extends Thread {
    static abstract class InitializeState {
        private InitializeState() {
        }

        InitializeState(com.unity3d.services.core.configuration.InitializeThread.1 initializeThread$10) {
        }

        public abstract InitializeState execute();
    }

    public static class InitializeStateCheckForCachedWebViewUpdate extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCheckForCachedWebViewUpdate(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            try {
                byte[] arr_b = InitializeThread.loadCachedFileToByteArray(new File(""));
                if(Utilities.Sha256(arr_b).equals(this._configuration.getWebViewHash())) {
                    String s = new String(arr_b, "UTF-8");
                    return new InitializeStateUpdateCache(this._configuration, s);
                }
            }
            catch(Exception unused_ex) {
            }
            return new InitializeStateDownloadWebView(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateCheckForUpdatedWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localWebViewConfiguration;
        private byte[] _localWebViewData;

        public InitializeStateCheckForUpdatedWebView(Configuration configuration0, byte[] arr_b, Configuration configuration1) {
            super(null);
            this._configuration = configuration0;
            this._localWebViewData = arr_b;
            this._localWebViewConfiguration = configuration1;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            try {
                String s = Utilities.Sha256(this._localWebViewData);
                if(!s.equals(this._configuration.getWebViewHash())) {
                    SdkProperties.setLatestConfiguration(this._configuration);
                }
                if(!TextUtils.isEmpty(s)) {
                    if(this._localWebViewConfiguration != null && (this._localWebViewConfiguration.getWebViewHash() != null && this._localWebViewConfiguration.getWebViewHash().equals(s) && false)) {
                        String s1 = new String(this._localWebViewData, "UTF-8");
                        return new InitializeStateCreate(this._localWebViewConfiguration, s1);
                    }
                    if(this._configuration != null && this._configuration.getWebViewHash().equals(s)) {
                        String s2 = new String(this._localWebViewData, "UTF-8");
                        return new InitializeStateCreate(this._configuration, s2);
                    }
                }
            }
            catch(Exception unused_ex) {
            }
            InitializeStateLoadWeb initializeThread$InitializeStateLoadWeb0 = new InitializeStateLoadWeb(this._configuration);
            return new InitializeStateCleanCache(this._configuration, initializeThread$InitializeStateLoadWeb0);
        }
    }

    public static class InitializeStateCleanCache extends InitializeState {
        private Configuration _configuration;
        private InitializeState _nextState;

        public InitializeStateCleanCache(Configuration configuration0, InitializeState initializeThread$InitializeState0) {
            super(null);
            this._configuration = configuration0;
            this._nextState = initializeThread$InitializeState0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            try {
                File file0 = new File("");
                File file1 = new File("");
                file0.delete();
                file1.delete();
            }
            catch(Exception exception0) {
                DeviceLog.error(("Failure trying to clean cache: " + exception0.getMessage()));
            }
            return this._nextState;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateCleanCacheIgnoreError extends InitializeStateCleanCache {
        public InitializeStateCleanCacheIgnoreError(Configuration configuration0, InitializeState initializeThread$InitializeState0) {
            super(configuration0, initializeThread$InitializeState0);
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeStateCleanCache
        public InitializeState execute() {
            try {
                InitializeState initializeThread$InitializeState0 = super.execute();
                if(!(initializeThread$InitializeState0 instanceof InitializeStateError)) {
                    return initializeThread$InitializeState0;
                }
            }
            catch(Exception unused_ex) {
            }
            return null;
        }
    }

    public static class InitializeStateComplete extends InitializeState {
        private Configuration _configuration;

        public InitializeStateComplete(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            Class[] arr_class = this._configuration.getModuleConfigurationList();
            for(int v = 0; v < arr_class.length; ++v) {
                IModuleConfiguration iModuleConfiguration0 = this._configuration.getModuleConfiguration(arr_class[v]);
                if(iModuleConfiguration0 != null) {
                    iModuleConfiguration0.initCompleteState(this._configuration);
                }
            }
            return null;
        }
    }

    public static class InitializeStateConfig extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;
        private int _maxRetries;
        private InitializeState _nextState;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateConfig(Configuration configuration0) {
            super(null);
            this._configuration = new Configuration("https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json", configuration0.getExperimentsReader());
            this._retries = 0;
            this._retryDelay = configuration0.getRetryDelay();
            this._maxRetries = configuration0.getMaxRetries();
            this._scalingFactor = configuration0.getRetryScalingFactor();
            this._localConfig = configuration0;
            this._nextState = null;
        }

        // 去混淆评级： 低(20)
        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            DeviceLog.info("Unity Ads init: load configuration from https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json");
            return this.executeWithLoader();
        }

        public InitializeState executeLegacy(Configuration configuration0) {
            try {
                configuration0.makeRequest();
            }
            catch(Exception exception0) {
                if(this._retries < this._maxRetries) {
                    this._retryDelay = (long)(((double)this._retryDelay) * this._scalingFactor);
                    ++this._retries;
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    return new InitializeStateRetry(this, this._retryDelay);
                }
                return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, exception0, this, this._localConfig);
            }
            return configuration0.getDelayWebViewUpdate() ? new InitializeStateLoadCacheConfigAndWebView(configuration0, this._localConfig) : new InitializeStateLoadCache(configuration0);
        }

        public InitializeState executeWithLoader() {
            SDKMetricsSender sDKMetricsSender0 = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
            HttpClient httpClient0 = (HttpClient)Utilities.getService(HttpClient.class);
            PrivacyConfigStorage privacyConfigStorage0 = PrivacyConfigStorage.getInstance();
            DeviceInfoDataFactory deviceInfoDataFactory0 = new DeviceInfoDataFactory(sDKMetricsSender0);
            IDeviceInfoDataContainer iDeviceInfoDataContainer0 = deviceInfoDataFactory0.getDeviceInfoData(InitRequestType.TOKEN);
            ConfigurationLoader configurationLoader0 = new ConfigurationLoader(new ConfigurationRequestFactory(this._configuration, iDeviceInfoDataContainer0), sDKMetricsSender0, httpClient0);
            IDeviceInfoDataContainer iDeviceInfoDataContainer1 = deviceInfoDataFactory0.getDeviceInfoData(InitRequestType.PRIVACY);
            PrivacyConfigurationLoader privacyConfigurationLoader0 = new PrivacyConfigurationLoader(configurationLoader0, new ConfigurationRequestFactory(this._configuration, iDeviceInfoDataContainer1), privacyConfigStorage0, httpClient0);
            Configuration configuration0 = new Configuration("https://configv2.unityads.unity3d.com/webview/4.14.1/release/config.json");
            try {
                privacyConfigurationLoader0.loadConfiguration(new IConfigurationLoaderListener() {
                    @Override  // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onError(String s) {
                        Metric metric0 = TSIMetric.newEmergencySwitchOff();
                        sDKMetricsSender0.sendMetric(metric0);
                        InitializeState initializeThread$InitializeState0 = InitializeStateConfig.this.executeLegacy(configuration0);
                        InitializeStateConfig.this._nextState = initializeThread$InitializeState0;
                    }

                    @Override  // com.unity3d.services.core.configuration.IConfigurationLoaderListener
                    public void onSuccess(Configuration configuration0) {
                        InitializeStateConfig.this._configuration = configuration0;
                        InitializeStateConfig.this._configuration.saveToDisk();
                        if(InitializeStateConfig.this._configuration.getDelayWebViewUpdate()) {
                            InitializeStateLoadCacheConfigAndWebView initializeThread$InitializeStateLoadCacheConfigAndWebView0 = new InitializeStateLoadCacheConfigAndWebView(InitializeStateConfig.this._configuration, InitializeStateConfig.this._localConfig);
                            InitializeStateConfig.this._nextState = initializeThread$InitializeStateLoadCacheConfigAndWebView0;
                        }
                        ((TokenStorage)Utilities.getService(TokenStorage.class)).setInitToken(InitializeStateConfig.this._configuration.getUnifiedAuctionToken());
                        InitializeStateLoadCache initializeThread$InitializeStateLoadCache0 = new InitializeStateLoadCache(InitializeStateConfig.this._configuration);
                        InitializeStateConfig.this._nextState = initializeThread$InitializeStateLoadCache0;
                    }
                });
                return this._nextState;
            }
            catch(Exception exception0) {
                int v = this._retries;
                if(v < this._maxRetries) {
                    this._retryDelay = (long)(((double)this._retryDelay) * this._scalingFactor);
                    this._retries = v + 1;
                    InitializeEventsMetricSender.getInstance().onRetryConfig();
                    return new InitializeStateRetry(this, this._retryDelay);
                }
                return new InitializeStateNetworkError(ErrorState.NetworkConfigRequest, exception0, this, this._configuration);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateCreate extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateCreate(Configuration configuration0, String s) {
            super(null);
            this._configuration = configuration0;
            this._webViewData = s;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            ErrorState errorState0;
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration configuration0 = this._configuration;
            configuration0.setWebViewData(this._webViewData);
            try {
                errorState0 = WebViewApp.create(configuration0, false);
            }
            catch(IllegalThreadStateException illegalThreadStateException0) {
                DeviceLog.exception("Illegal Thread", illegalThreadStateException0);
                return new InitializeStateError(ErrorState.CreateWebApp, illegalThreadStateException0, this._configuration);
            }
            if(errorState0 == null) {
                return new InitializeStateComplete(this._configuration);
            }
            String s = WebViewApp.getCurrentApp().getWebAppFailureMessage() == null ? "Unity Ads WebApp creation failed" : WebViewApp.getCurrentApp().getWebAppFailureMessage();
            DeviceLog.error(s);
            return new InitializeStateError(errorState0, new Exception(s), this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }

        public String getWebData() {
            return this._webViewData;
        }
    }

    public static class InitializeStateCreateWithRemote extends InitializeState {
        private Configuration _configuration;

        public InitializeStateCreateWithRemote(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            ErrorState errorState0;
            DeviceLog.debug("Unity Ads init: creating webapp");
            try {
                errorState0 = WebViewApp.create(this._configuration, true);
            }
            catch(IllegalThreadStateException illegalThreadStateException0) {
                DeviceLog.exception("Illegal Thread", illegalThreadStateException0);
                return new InitializeStateError(ErrorState.CreateWebApp, illegalThreadStateException0, this._configuration);
            }
            if(errorState0 == null) {
                return new InitializeStateComplete(this._configuration);
            }
            String s = WebViewApp.getCurrentApp().getWebAppFailureMessage() == null ? "Unity Ads WebApp creation failed" : WebViewApp.getCurrentApp().getWebAppFailureMessage();
            DeviceLog.error(s);
            return new InitializeStateError(errorState0, new Exception(s), this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateDownloadWebView extends InitializeState {
        private Configuration _configuration;
        private HttpClient _httpClient;
        private int _retries;
        private long _retryDelay;

        public InitializeStateDownloadWebView(Configuration configuration0) {
            super(null);
            this._httpClient = (HttpClient)Utilities.getService(HttpClient.class);
            this._configuration = configuration0;
            this._retries = 0;
            this._retryDelay = configuration0.getRetryDelay();
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            String s;
            HttpRequest httpRequest0;
            DeviceLog.info(("Unity Ads init: downloading webapp from " + this._configuration.getWebViewUrl()));
            try {
                httpRequest0 = new HttpRequest(this._configuration.getWebViewUrl());
            }
            catch(Exception exception0) {
                DeviceLog.exception("Malformed URL", exception0);
                return null;
            }
            try {
                s = this._httpClient.executeBlocking(httpRequest0).getBody().toString();
            }
            catch(Exception unused_ex) {
                if(this._retries < this._configuration.getMaxRetries()) {
                    long v = (long)(((double)this._retryDelay) * this._configuration.getRetryScalingFactor());
                    this._retryDelay = v;
                    ++this._retries;
                    return new InitializeStateRetry(this, v);
                }
                return null;
            }
            String s1 = this._configuration.getWebViewHash();
            return s != null && s1 != null && Utilities.Sha256(s).equals(s1) ? new InitializeStateUpdateCache(this._configuration, s) : null;
        }
    }

    public static class InitializeStateError extends InitializeState {
        protected Configuration _configuration;
        ErrorState _errorState;
        Exception _exception;

        public InitializeStateError(ErrorState errorState0, Exception exception0, Configuration configuration0) {
            super(null);
            this._errorState = errorState0;
            this._exception = exception0;
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            DeviceLog.error(("Unity Ads init: halting init in " + this._errorState.getMetricName() + ": " + this._exception.getMessage()));
            Class[] arr_class = this._configuration.getModuleConfigurationList();
            for(int v = 0; v < arr_class.length; ++v) {
                IModuleConfiguration iModuleConfiguration0 = this._configuration.getModuleConfiguration(arr_class[v]);
                if(iModuleConfiguration0 != null) {
                    iModuleConfiguration0.initErrorState(this._configuration, this._errorState, this._exception.getMessage());
                }
            }
            return null;
        }
    }

    public static class InitializeStateForceReset extends InitializeStateReset {
        public InitializeStateForceReset() {
            super(new Configuration());
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeStateReset
        public InitializeState execute() {
            SdkProperties.setInitializeState(InitializationState.NOT_INITIALIZED);
            super.execute();
            return null;
        }
    }

    public static class InitializeStateInitModules extends InitializeState {
        private Configuration _configuration;

        public InitializeStateInitModules(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            return new InitializeStateConfig(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateLoadCache extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadCache(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            String s1;
            byte[] arr_b;
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            try {
                arr_b = Utilities.readFileBytes(new File(""));
            }
            catch(Exception exception0) {
                DeviceLog.debug(("Unity Ads init: webapp not found in local cache: " + exception0.getMessage()));
                return new InitializeStateLoadWeb(this._configuration);
            }
            String s = Utilities.Sha256(arr_b);
            if(s != null && s.equals(this._configuration.getWebViewHash())) {
                try {
                    s1 = new String(arr_b, "UTF-8");
                }
                catch(Exception exception1) {
                    return new InitializeStateError(ErrorState.LoadCache, exception1, this._configuration);
                }
                DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                return new InitializeStateCreate(this._configuration, s1);
            }
            return new InitializeStateLoadWeb(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateLoadCacheConfigAndWebView extends InitializeState {
        private Configuration _configuration;
        private Configuration _localConfig;

        public InitializeStateLoadCacheConfigAndWebView(Configuration configuration0, Configuration configuration1) {
            super(null);
            this._configuration = configuration0;
            this._localConfig = configuration1;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            try {
                byte[] arr_b = InitializeThread.loadCachedFileToByteArray(new File(""));
                return new InitializeStateCheckForUpdatedWebView(this._configuration, arr_b, this._localConfig);
            }
            catch(Exception unused_ex) {
                InitializeStateLoadWeb initializeThread$InitializeStateLoadWeb0 = new InitializeStateLoadWeb(this._configuration);
                return new InitializeStateCleanCache(this._configuration, initializeThread$InitializeStateLoadWeb0);
            }
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateLoadConfigFile extends InitializeState {
        private Configuration _configuration;

        public InitializeStateLoadConfigFile(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            DeviceLog.debug("Unity Ads init: Loading Config File Parameters");
            File file0 = new File("");
            if(!file0.exists()) {
                return new InitializeStateReset(this._configuration);
            }
            try {
                this._configuration = new Configuration(new JSONObject(new String(Utilities.readFileBytes(file0))));
                return new InitializeStateReset(this._configuration);
            }
            catch(Exception unused_ex) {
                DeviceLog.debug("Unity Ads init: Using default configuration parameters");
                return new InitializeStateReset(this._configuration);
            }
        }
    }

    public static class InitializeStateLoadWeb extends InitializeState {
        private Configuration _configuration;
        private HttpClient _httpClient;
        private int _maxRetries;
        private int _retries;
        private long _retryDelay;
        private double _scalingFactor;

        public InitializeStateLoadWeb(Configuration configuration0) {
            super(null);
            this._httpClient = (HttpClient)Utilities.getService(HttpClient.class);
            this._configuration = configuration0;
            this._retries = 0;
            this._retryDelay = configuration0.getRetryDelay();
            this._maxRetries = configuration0.getMaxRetries();
            this._scalingFactor = configuration0.getRetryScalingFactor();
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            String s;
            HttpRequest httpRequest0;
            DeviceLog.info(("Unity Ads init: loading webapp from " + this._configuration.getWebViewUrl()));
            try {
                httpRequest0 = new HttpRequest(this._configuration.getWebViewUrl());
            }
            catch(Exception exception0) {
                DeviceLog.exception("Malformed URL", exception0);
                return new InitializeStateError(ErrorState.MalformedWebviewRequest, exception0, this._configuration);
            }
            try {
                s = this._httpClient.executeBlocking(httpRequest0).getBody().toString();
            }
            catch(Exception exception1) {
                int v = this._retries;
                if(v < this._maxRetries) {
                    this._retryDelay = (long)(((double)this._retryDelay) * this._scalingFactor);
                    this._retries = v + 1;
                    InitializeEventsMetricSender.getInstance().onRetryWebview();
                    return new InitializeStateRetry(this, this._retryDelay);
                }
                return new InitializeStateNetworkError(ErrorState.NetworkWebviewRequest, exception1, this, this._configuration);
            }
            String s1 = this._configuration.getWebViewHash();
            if(s1 != null && !Utilities.Sha256(s).equals(s1)) {
                Exception exception2 = new Exception("Invalid webViewHash");
                return new InitializeStateError(ErrorState.InvalidHash, exception2, this._configuration);
            }
            if(s1 != null) {
                Utilities.writeFile(new File(""), s);
            }
            return new InitializeStateCreate(this._configuration, s);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    public static class InitializeStateNetworkError extends InitializeStateError implements IConnectivityListener {
        private ConditionVariable _conditionVariable;
        private int _connectedEventThreshold;
        private InitializeState _erroredState;
        private static long _lastConnectedEventTimeMs;
        private int _maximumConnectedEvents;
        private long _networkErrorTimeout;
        private static int _receivedConnectedEvents;
        private ErrorState _state;

        public InitializeStateNetworkError(ErrorState errorState0, Exception exception0, InitializeState initializeThread$InitializeState0, Configuration configuration0) {
            super(errorState0, exception0, configuration0);
            this._state = errorState0;
            InitializeStateNetworkError._receivedConnectedEvents = 0;
            InitializeStateNetworkError._lastConnectedEventTimeMs = 0L;
            this._erroredState = initializeThread$InitializeState0;
            this._networkErrorTimeout = configuration0.getNetworkErrorTimeout();
            this._maximumConnectedEvents = configuration0.getMaximumConnectedEvents();
            this._connectedEventThreshold = configuration0.getConnectedEventThreshold();
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeStateError
        public InitializeState execute() {
            DeviceLog.error("Unity Ads init: network error, waiting for connection events");
            this._conditionVariable = new ConditionVariable();
            ConnectivityMonitor.addListener(this);
            if(this._conditionVariable.block(this._networkErrorTimeout)) {
                ConnectivityMonitor.removeListener(this);
                return this._erroredState;
            }
            ConnectivityMonitor.removeListener(this);
            return new InitializeStateError(this._state, new Exception("No connected events within the timeout!"), this._configuration);
        }

        @Override  // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onConnected() {
            ++InitializeStateNetworkError._receivedConnectedEvents;
            DeviceLog.debug("Unity Ads init got connected event");
            if(this.shouldHandleConnectedEvent()) {
                this._conditionVariable.open();
            }
            if(InitializeStateNetworkError._receivedConnectedEvents > this._maximumConnectedEvents) {
                ConnectivityMonitor.removeListener(this);
            }
            InitializeStateNetworkError._lastConnectedEventTimeMs = System.currentTimeMillis();
        }

        @Override  // com.unity3d.services.core.connectivity.IConnectivityListener
        public void onDisconnected() {
            DeviceLog.debug("Unity Ads init got disconnected event");
        }

        private boolean shouldHandleConnectedEvent() {
            return System.currentTimeMillis() - InitializeStateNetworkError._lastConnectedEventTimeMs >= ((long)this._connectedEventThreshold) && InitializeStateNetworkError._receivedConnectedEvents <= this._maximumConnectedEvents;
        }
    }

    public static class InitializeStateReset extends InitializeState {
        private Configuration _configuration;
        private int _resetWebAppTimeout;

        public InitializeStateReset(Configuration configuration0) {
            super(null);
            this._configuration = configuration0;
            this._resetWebAppTimeout = configuration0.getResetWebappTimeout();
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            boolean z;
            DeviceLog.debug("Unity Ads init: starting init");
            ConditionVariable conditionVariable0 = new ConditionVariable();
            WebViewApp webViewApp0 = WebViewApp.getCurrentApp();
            if(webViewApp0 != null) {
                webViewApp0.resetWebViewAppInitialization();
                if(webViewApp0.getWebView() == null) {
                    z = true;
                }
                else {
                    Utilities.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            WebView webView0 = webViewApp0.getWebView();
                            if(webView0 != null) {
                                webView0.destroy();
                                webViewApp0.setWebView(null);
                            }
                            conditionVariable0.open();
                        }
                    });
                    z = conditionVariable0.block(((long)this._resetWebAppTimeout));
                }
                if(!z) {
                    Exception exception0 = new Exception("Reset failed on opening ConditionVariable");
                    return new InitializeStateError(ErrorState.ResetWebApp, exception0, this._configuration);
                }
            }
            this.unregisterLifecycleCallbacks();
            SdkProperties.setCacheDirectory(null);
            if(SdkProperties.getCacheDirectory() == null) {
                Exception exception1 = new Exception("Cache directory is NULL");
                return new InitializeStateError(ErrorState.ResetWebApp, exception1, this._configuration);
            }
            SdkProperties.setWebViewCacheDirectory(null);
            if(SdkProperties.getWebViewCacheDirectory() == null) {
                Exception exception2 = new Exception("WebView cache directory is NULL");
                return new InitializeStateError(ErrorState.ResetWebApp, exception2, this._configuration);
            }
            SdkProperties.setInitialized(false);
            Class[] arr_class = this._configuration.getModuleConfigurationList();
            for(int v = 0; v < arr_class.length; ++v) {
                IModuleConfiguration iModuleConfiguration0 = this._configuration.getModuleConfiguration(arr_class[v]);
                if(iModuleConfiguration0 != null) {
                    iModuleConfiguration0.resetState(this._configuration);
                }
            }
            return new InitializeStateInitModules(this._configuration);
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }

        @TargetApi(14)
        private void unregisterLifecycleCallbacks() {
            if(Lifecycle.getLifecycleListener() != null) {
                if(ClientProperties.getApplication() != null) {
                    ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(Lifecycle.getLifecycleListener());
                }
                Lifecycle.setLifecycleListener(null);
            }
        }
    }

    public static class InitializeStateRetry extends InitializeState {
        long _delay;
        InitializeState _state;

        public InitializeStateRetry(InitializeState initializeThread$InitializeState0, long v) {
            super(null);
            this._state = initializeThread$InitializeState0;
            this._delay = v;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            DeviceLog.debug(("Unity Ads init: retrying in " + this._delay + " milliseconds"));
            try {
                Thread.sleep(this._delay);
            }
            catch(Exception exception0) {
                DeviceLog.exception("Init retry interrupted", exception0);
                Thread.currentThread().interrupt();
            }
            return this._state;
        }
    }

    public static class InitializeStateUpdateCache extends InitializeState {
        private Configuration _configuration;
        private String _webViewData;

        public InitializeStateUpdateCache(Configuration configuration0, String s) {
            super(null);
            this._configuration = configuration0;
            this._webViewData = s;
        }

        @Override  // com.unity3d.services.core.configuration.InitializeThread$InitializeState
        public InitializeState execute() {
            if(this._configuration != null && this._webViewData != null) {
                try {
                    Utilities.writeFile(new File(""), this._webViewData);
                    Utilities.writeFile(new File(""), this._configuration.getFilteredJsonString());
                    return null;
                }
                catch(Exception unused_ex) {
                    return new InitializeStateCleanCacheIgnoreError(this._configuration, null);
                }
            }
            return null;
        }

        public Configuration getConfiguration() {
            return this._configuration;
        }
    }

    private boolean _didRetry;
    private final SDKMetricsSender _sdkMetricsSender;
    private InitializeState _state;
    private String _stateName;
    private long _stateStartTimestamp;
    private boolean _stopThread;
    private static InitializeThread _thread;

    private InitializeThread(InitializeState initializeThread$InitializeState0) {
        this._stopThread = false;
        this._didRetry = false;
        this._sdkMetricsSender = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
        this._state = initializeThread$InitializeState0;
    }

    public static DownloadLatestWebViewStatus downloadLatestWebView() {
        synchronized(InitializeThread.class) {
            if(InitializeThread._thread != null) {
                return DownloadLatestWebViewStatus.INIT_QUEUE_NOT_EMPTY;
            }
            if(SdkProperties.getLatestConfiguration() == null) {
                return DownloadLatestWebViewStatus.MISSING_LATEST_CONFIG;
            }
            InitializeThread initializeThread0 = new InitializeThread(new InitializeStateCheckForCachedWebViewUpdate(SdkProperties.getLatestConfiguration()));
            InitializeThread._thread = initializeThread0;
            initializeThread0.setName("UnityAdsDownloadThread");
            InitializeThread._thread.start();
            return DownloadLatestWebViewStatus.BACKGROUND_DOWNLOAD_STARTED;
        }
    }

    private String getMetricNameForState(InitializeState initializeThread$InitializeState0) {
        if(initializeThread$InitializeState0 == null) {
            return null;
        }
        String s = initializeThread$InitializeState0.getClass().getSimpleName();
        return s.length() == 0 ? null : "native_" + s.substring(15).toLowerCase() + "_state";
    }

    private Map getMetricTagsForState() {
        return InitializeEventsMetricSender.getInstance().getRetryTags();
    }

    private int getStatePrefixLength() [...] // Inlined contents

    private void handleStateEndMetrics(InitializeState initializeThread$InitializeState0) {
        if(this._stateName != null && !this.isRetryState(initializeThread$InitializeState0) && !this._stateName.equals("native_retry_state")) {
            long v = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._stateStartTimestamp);
            Metric metric0 = new Metric(this._stateName, v, this.getMetricTagsForState());
            this._sdkMetricsSender.sendMetric(metric0);
        }
    }

    private void handleStateStartMetrics(InitializeState initializeThread$InitializeState0) {
        if(this.isRetryState(initializeThread$InitializeState0)) {
            this._didRetry = true;
        }
        else {
            if(!this._didRetry) {
                this._stateStartTimestamp = System.nanoTime();
            }
            this._didRetry = false;
        }
        this._stateName = this.getMetricNameForState(initializeThread$InitializeState0);
    }

    public static void initialize(Configuration configuration0) {
        synchronized(InitializeThread.class) {
            if(InitializeThread._thread == null) {
                InitializeEventsMetricSender.getInstance().didInitStart();
                CachedLifecycle.register();
                InitializeThread initializeThread0 = new InitializeThread(new InitializeStateLoadConfigFile(configuration0));
                InitializeThread._thread = initializeThread0;
                initializeThread0.setName("UnityAdsInitializeThread");
                InitializeThread._thread.start();
            }
        }
    }

    private boolean isRetryState(InitializeState initializeThread$InitializeState0) {
        return initializeThread$InitializeState0 instanceof InitializeStateRetry;
    }

    private static byte[] loadCachedFileToByteArray(File file0) throws IOException {
        if(file0 != null && file0.exists()) {
            try {
                return Utilities.readFileBytes(file0);
            }
            catch(IOException unused_ex) {
                throw new IOException("could not read from file");
            }
        }
        throw new IOException("file not found");
    }

    public void quit() {
        this._stopThread = true;
    }

    public static void reset() {
        synchronized(InitializeThread.class) {
            if(InitializeThread._thread == null) {
                InitializeThread initializeThread0 = new InitializeThread(new InitializeStateForceReset());
                InitializeThread._thread = initializeThread0;
                initializeThread0.setName("UnityAdsResetThread");
                InitializeThread._thread.start();
            }
        }
    }

    @Override
    public void run() {
        while(true) {
            InitializeState initializeThread$InitializeState0 = this._state;
            if(initializeThread$InitializeState0 == null || this._stopThread) {
                break;
            }
            try {
                this.handleStateStartMetrics(initializeThread$InitializeState0);
                InitializeState initializeThread$InitializeState1 = this._state.execute();
                this._state = initializeThread$InitializeState1;
                this.handleStateEndMetrics(initializeThread$InitializeState1);
                continue;
            }
            catch(Exception exception0) {
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                goto label_13;
            }
            try {
                DeviceLog.exception("Unity Ads SDK encountered an error during initialization, cancel initialization", exception0);
                Utilities.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        SdkProperties.notifyInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK encountered an error during initialization, cancel initialization");
                    }
                });
                this._state = new InitializeStateForceReset();
                continue;
            label_13:
                DeviceLog.exception("Unity Ads SDK failed to initialize due to application doesn\'t have enough memory to initialize Unity Ads SDK", new Exception(outOfMemoryError0));
                Utilities.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        SdkProperties.notifyInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to application doesn\'t have enough memory to initialize Unity Ads SDK");
                    }
                });
                this._state = new InitializeStateForceReset();
                continue;
            }
            catch(OutOfMemoryError unused_ex) {
            }
            break;
        }
        InitializeThread._thread = null;
    }
}

