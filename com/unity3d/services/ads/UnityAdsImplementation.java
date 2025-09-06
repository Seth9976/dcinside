package com.unity3d.services.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.gmascar.managers.BiddingBaseManager;
import com.unity3d.services.ads.gmascar.managers.BiddingManagerFactory;
import com.unity3d.services.ads.operation.load.ILoadModule;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.token.AsyncTokenStorage;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import y4.l;

public final class UnityAdsImplementation implements IUnityAds {
    private static Configuration configuration;
    private static IUnityAds instance;
    private static final WebViewBridgeInvoker webViewBridgeInvoker;

    static {
        UnityAdsImplementation.webViewBridgeInvoker = new WebViewBridgeInvoker();
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.ads.IUnityAds
    public boolean getDebugMode() {
        return false;
    }

    public static IUnityAds getInstance() {
        if(UnityAdsImplementation.instance == null) {
            UnityAdsImplementation.instance = new UnityAdsImplementation();
        }
        return UnityAdsImplementation.instance;
    }

    @Override  // com.unity3d.services.ads.IUnityAds
    @Nullable
    public String getToken() {
        if(this.hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            return null;
        }
        if(((AlternativeFlowReader)Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            return new UnityAdsSDK().getToken();
        }
        String s = ((TokenStorage)Utilities.getService(TokenStorage.class)).getToken();
        if(s != null && !s.isEmpty()) {
            Configuration configuration0 = UnityAdsImplementation.configuration == null ? new ConfigurationReader().getCurrentConfiguration() : UnityAdsImplementation.configuration;
            BiddingBaseManager biddingBaseManager0 = BiddingManagerFactory.getInstance().createManager(null, configuration0.getExperiments());
            biddingBaseManager0.start();
            return biddingBaseManager0.getFormattedToken(s);
        }
        return null;
    }

    @Override  // com.unity3d.services.ads.IUnityAds
    public void getToken(@Nullable IUnityAdsTokenListener iUnityAdsTokenListener0) {
        if(this.hasInvalidContext()) {
            DeviceLog.error("No valid Context for getting token");
            if(iUnityAdsTokenListener0 != null) {
                iUnityAdsTokenListener0.onUnityAdsTokenReady(null);
            }
            return;
        }
        if(((AlternativeFlowReader)Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().getToken(iUnityAdsTokenListener0);
            return;
        }
        if(iUnityAdsTokenListener0 == null) {
            DeviceLog.info("Please provide non-null listener to UnityAds.GetToken method");
            return;
        }
        if(ClientProperties.getApplicationContext() == null) {
            Utilities.wrapCustomerListener(() -> iUnityAdsTokenListener0.onUnityAdsTokenReady(null));
            return;
        }
        AsyncTokenStorage asyncTokenStorage0 = (AsyncTokenStorage)Utilities.getService(AsyncTokenStorage.class);
        Configuration configuration0 = UnityAdsImplementation.configuration == null ? new ConfigurationReader().getCurrentConfiguration() : UnityAdsImplementation.configuration;
        BiddingBaseManager biddingBaseManager0 = BiddingManagerFactory.getInstance().createManager(iUnityAdsTokenListener0, configuration0.getExperiments());
        biddingBaseManager0.start();
        asyncTokenStorage0.getToken(biddingBaseManager0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.ads.IUnityAds
    public String getVersion() {
        return "4.14.1";
    }

    private void handleShowError(IUnityAdsShowListener iUnityAdsShowListener0, String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
        ((SDKMetricsSender)Utilities.getService(SDKMetricsSender.class)).sendMetricWithInitState(AdOperationMetric.newAdShowFailure(unityAds$UnityAdsShowError0, 0L));
        if(iUnityAdsShowListener0 == null) {
            return;
        }
        iUnityAdsShowListener0.onUnityAdsShowFailure(s, unityAds$UnityAdsShowError0, s1);
    }

    private boolean hasInvalidContext() {
        return this.hasInvalidContext(null);
    }

    private boolean hasInvalidContext(Context context0) {
        if(ClientProperties.getApplicationContext() != null) {
            return false;
        }
        if(context0 == null) {
            return true;
        }
        if(context0 instanceof Application) {
            ClientProperties.setApplicationContext(context0);
            ClientProperties.setApplication(((Application)context0));
            return false;
        }
        if(context0 instanceof Activity && ((Activity)context0).getApplication() != null && ((Activity)context0).getApplicationContext() != null) {
            ClientProperties.setApplicationContext(context0.getApplicationContext());
            ClientProperties.setApplication(((Activity)context0).getApplication());
            return false;
        }
        return true;
    }

    @Override  // com.unity3d.services.ads.IUnityAds
    public void initialize(Context context0, String s, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener0) {
        DeviceLog.entered();
        if(this.hasInvalidContext(context0)) {
            DeviceLog.error("Error while initializing Unity Services: null context, halting Unity Ads init");
            if(iUnityAdsInitializationListener0 != null) {
                Utilities.wrapCustomerListener(() -> iUnityAdsInitializationListener0.onInitializationFailed(UnityAdsInitializationError.INVALID_ARGUMENT, "Unity Ads SDK failed to initialize due to invalid context"));
            }
            return;
        }
        UnityServices.initialize(context0, s, z, iUnityAdsInitializationListener0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.ads.IUnityAds
    public boolean isInitialized() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.ads.IUnityAds
    public boolean isSupported() [...] // 潜在的解密器

    // 检测为 Lambda 实现
    private static void lambda$getToken$2(IUnityAdsTokenListener iUnityAdsTokenListener0) [...]

    // 检测为 Lambda 实现
    private static void lambda$initialize$0(IUnityAdsInitializationListener iUnityAdsInitializationListener0) [...]

    // 检测为 Lambda 实现
    private static void lambda$load$1(IUnityAdsLoadListener iUnityAdsLoadListener0, String s) [...]

    @Override  // com.unity3d.services.ads.IUnityAds
    public void load(@Nullable String s, @NonNull UnityAdsLoadOptions unityAdsLoadOptions0, @Nullable IUnityAdsLoadListener iUnityAdsLoadListener0) {
        if(this.hasInvalidContext()) {
            DeviceLog.error("No valid Context for loading ads");
            if(iUnityAdsLoadListener0 != null) {
                Utilities.wrapCustomerListener(() -> iUnityAdsLoadListener0.onUnityAdsFailedToLoad(s, UnityAdsLoadError.INVALID_ARGUMENT, "Unity Ads SDK failed to load due to invalid context"));
            }
            return;
        }
        if(((AlternativeFlowReader)Utilities.getService(AlternativeFlowReader.class)).invoke()) {
            new UnityAdsSDK().load(s, unityAdsLoadOptions0, iUnityAdsLoadListener0, null);
            return;
        }
        Configuration configuration0 = UnityAdsImplementation.configuration == null ? new Configuration() : UnityAdsImplementation.configuration;
        ILoadModule iLoadModule0 = LoadModule.getInstance();
        LoadOperationState loadOperationState0 = new LoadOperationState(s, iUnityAdsLoadListener0, unityAdsLoadOptions0, configuration0);
        iLoadModule0.executeAdOperation(UnityAdsImplementation.webViewBridgeInvoker, loadOperationState0);
    }

    public static void setConfiguration(Configuration configuration0) {
        UnityAdsImplementation.configuration = configuration0;
    }

    @Override  // com.unity3d.services.ads.IUnityAds
    public void setDebugMode(boolean z) {
        UnityServices.setDebugMode(z);
    }

    public void show(Activity activity0, String s) {
        this.show(activity0, s, new UnityAdsShowOptions(), null);
    }

    public void show(Activity activity0, String s, IUnityAdsShowListener iUnityAdsShowListener0) {
        this.show(activity0, s, new UnityAdsShowOptions(), iUnityAdsShowListener0);
    }

    @Override  // com.unity3d.services.ads.IUnityAds
    public void show(@Nullable Activity activity0, @Nullable String s, @Nullable UnityAdsShowOptions unityAdsShowOptions0, @Nullable IUnityAdsShowListener iUnityAdsShowListener0) {
        if(activity0 != null && !this.hasInvalidContext(activity0)) {
            ClientProperties.setActivity(activity0);
            if(((AlternativeFlowReader)Utilities.getService(AlternativeFlowReader.class)).invoke()) {
                new UnityAdsSDK().show(activity0, s, unityAdsShowOptions0, new Listeners() {
                    @Override  // com.unity3d.ads.core.data.model.Listeners
                    public void onClick(@l String s) {
                        IUnityAdsShowListener iUnityAdsShowListener0 = iUnityAdsShowListener0;
                        if(iUnityAdsShowListener0 != null) {
                            iUnityAdsShowListener0.onUnityAdsShowClick(s);
                        }
                    }

                    @Override  // com.unity3d.ads.core.data.model.Listeners
                    public void onComplete(@l String s, @l UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
                        IUnityAdsShowListener iUnityAdsShowListener0 = iUnityAdsShowListener0;
                        if(iUnityAdsShowListener0 != null) {
                            iUnityAdsShowListener0.onUnityAdsShowComplete(s, unityAds$UnityAdsShowCompletionState0);
                        }
                    }

                    @Override  // com.unity3d.ads.core.data.model.Listeners
                    public void onError(@l String s, @l UnityAdsShowError unityAds$UnityAdsShowError0, @l String s1) {
                        IUnityAdsShowListener iUnityAdsShowListener0 = iUnityAdsShowListener0;
                        if(iUnityAdsShowListener0 != null) {
                            iUnityAdsShowListener0.onUnityAdsShowFailure(s, unityAds$UnityAdsShowError0, s1);
                        }
                    }

                    @Override  // com.unity3d.ads.core.data.model.Listeners
                    public void onLeftApplication(@l String s) {
                    }

                    @Override  // com.unity3d.ads.core.data.model.Listeners
                    public void onStart(@l String s) {
                        IUnityAdsShowListener iUnityAdsShowListener0 = iUnityAdsShowListener0;
                        if(iUnityAdsShowListener0 != null) {
                            iUnityAdsShowListener0.onUnityAdsShowStart(s);
                        }
                    }
                });
                return;
            }
            this.handleShowError(iUnityAdsShowListener0, s, UnityAdsShowError.NOT_INITIALIZED, "[UnityAds] SDK not initialized");
            return;
        }
        this.handleShowError(iUnityAdsShowListener0, s, UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
    }
}

