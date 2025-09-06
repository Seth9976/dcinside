package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

public class LoadOperation extends AdOperation implements ILoadOperation {
    private LoadOperationState _loadOperationState;

    public LoadOperation(LoadOperationState loadOperationState0, IWebViewBridgeInvocation iWebViewBridgeInvocation0) {
        super(iWebViewBridgeInvocation0, "load");
        this._loadOperationState = loadOperationState0;
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this._loadOperationState.id;
    }

    @Override  // com.unity3d.services.ads.operation.load.ILoadOperation
    public LoadOperationState getLoadOperationState() {
        return this._loadOperationState;
    }

    @Override  // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsAdLoaded(String s) {
        if(this._loadOperationState != null && this._loadOperationState.listener != null && s != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(LoadOperation.this._loadOperationState != null) {
                        LoadOperation.this._loadOperationState.onUnityAdsAdLoaded();
                    }
                }
            });
        }
    }

    @Override  // com.unity3d.ads.IUnityAdsLoadListener
    public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
        if(this._loadOperationState != null && this._loadOperationState.listener != null && s != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(LoadOperation.this._loadOperationState != null) {
                        LoadOperation.this._loadOperationState.onUnityAdsFailedToLoad(unityAds$UnityAdsLoadError0, s1);
                    }
                }
            });
        }
    }
}

