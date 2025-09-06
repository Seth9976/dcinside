package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.IInitializationNotificationCenter;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;

public class LoadModuleDecoratorInitializationBuffer extends LoadModuleDecorator implements IInitializationListener {
    private ConcurrentHashMap _queuedLoadEvents;
    private static final String errorMsgInitializationFailed = "[UnityAds] SDK Initialization Failed";
    private static final String errorMsgInitializationFailure = "[UnityAds] SDK Initialization Failure";

    public LoadModuleDecoratorInitializationBuffer(ILoadModule iLoadModule0, IInitializationNotificationCenter iInitializationNotificationCenter0) {
        super(iLoadModule0);
        iInitializationNotificationCenter0.addListener(this);
        this._queuedLoadEvents = new ConcurrentHashMap();
    }

    @Override  // com.unity3d.services.ads.operation.load.LoadModuleDecorator
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, LoadOperationState loadOperationState0) {
        if(loadOperationState0 == null) {
            return;
        }
        switch(SdkProperties.getCurrentInitializationState()) {
            case 1: {
                super.executeAdOperation(iWebViewBridgeInvoker0, loadOperationState0);
                return;
            }
            case 2: {
                this.sendOnUnityAdsFailedToLoad(loadOperationState0, UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failed");
                return;
            }
            default: {
                this._queuedLoadEvents.put(loadOperationState0, iWebViewBridgeInvoker0);
            }
        }
    }

    @Override  // com.unity3d.services.ads.operation.load.LoadModuleDecorator
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((LoadOperationState)object0));
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitializationFailed(String s, ErrorState errorState0, int v) {
        synchronized(this) {
            for(Object object0: this._queuedLoadEvents.keySet()) {
                this.sendOnUnityAdsFailedToLoad(((LoadOperationState)object0), UnityAdsLoadError.INITIALIZE_FAILED, "[UnityAds] SDK Initialization Failure");
            }
            this._queuedLoadEvents.clear();
        }
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitialized() {
        synchronized(this) {
            for(Object object0: this._queuedLoadEvents.entrySet()) {
                super.executeAdOperation(((IWebViewBridgeInvoker)((Map.Entry)object0).getValue()), ((LoadOperationState)((Map.Entry)object0).getKey()));
            }
            this._queuedLoadEvents.clear();
        }
    }

    private void sendOnUnityAdsFailedToLoad(LoadOperationState loadOperationState0, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s) {
        if(loadOperationState0 != null && loadOperationState0.listener != null) {
            this.getMetricSender().sendMetricWithInitState(AdOperationMetric.newAdLoadFailure(unityAds$UnityAdsLoadError0, loadOperationState0.duration(), false, loadOperationState0.isHeaderBidding()));
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    loadOperationState0.listener.onUnityAdsFailedToLoad(loadOperationState0.placementId, unityAds$UnityAdsLoadError0, s);
                }
            });
        }
    }
}

