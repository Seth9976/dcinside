package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;

public class LoadModuleDecorator implements ILoadModule {
    private final ILoadModule _loadModule;

    public LoadModuleDecorator(ILoadModule iLoadModule0) {
        this._loadModule = iLoadModule0;
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, LoadOperationState loadOperationState0) {
        this._loadModule.executeAdOperation(iWebViewBridgeInvoker0, loadOperationState0);
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((LoadOperationState)object0));
    }

    public ILoadOperation get(String s) {
        return (ILoadOperation)this._loadModule.get(s);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public IWebViewSharedObject get(String s) {
        return this.get(s);
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public SDKMetricsSender getMetricSender() {
        return this._loadModule.getMetricSender();
    }

    @Override  // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsAdLoaded(String s) {
        this._loadModule.onUnityAdsAdLoaded(s);
    }

    @Override  // com.unity3d.services.ads.operation.load.ILoadModule
    public void onUnityAdsFailedToLoad(String s, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s1) {
        this._loadModule.onUnityAdsFailedToLoad(s, unityAds$UnityAdsLoadError0, s1);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(String s) {
        this._loadModule.remove(s);
    }

    public void set(ILoadOperation iLoadOperation0) {
        this._loadModule.set(iLoadOperation0);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(IWebViewSharedObject iWebViewSharedObject0) {
        this.set(((ILoadOperation)iWebViewSharedObject0));
    }
}

