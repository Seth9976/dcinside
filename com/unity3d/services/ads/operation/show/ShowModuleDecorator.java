package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;

public class ShowModuleDecorator implements IShowModule {
    private final IShowModule _showModule;

    public ShowModuleDecorator(IShowModule iShowModule0) {
        this._showModule = iShowModule0;
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, ShowOperationState showOperationState0) {
        this._showModule.executeAdOperation(iWebViewBridgeInvoker0, showOperationState0);
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker0, Object object0) {
        this.executeAdOperation(iWebViewBridgeInvoker0, ((ShowOperationState)object0));
    }

    public IShowOperation get(String s) {
        return (IShowOperation)this._showModule.get(s);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public IWebViewSharedObject get(String s) {
        return this.get(s);
    }

    @Override  // com.unity3d.services.ads.operation.IAdModule
    public SDKMetricsSender getMetricSender() {
        return this._showModule.getMetricSender();
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowClick(String s) {
        this._showModule.onUnityAdsShowClick(s);
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
        this._showModule.onUnityAdsShowComplete(s, unityAds$UnityAdsShowCompletionState0);
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowConsent(String s) {
        this._showModule.onUnityAdsShowConsent(s);
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
        this._showModule.onUnityAdsShowFailure(s, unityAds$UnityAdsShowError0, s1);
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowModule
    public void onUnityAdsShowStart(String s) {
        this._showModule.onUnityAdsShowStart(s);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void remove(String s) {
        this._showModule.remove(s);
    }

    public void set(IShowOperation iShowOperation0) {
        this._showModule.set(iShowOperation0);
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewBridgeSharedObjectStore
    public void set(IWebViewSharedObject iWebViewSharedObject0) {
        this.set(((IShowOperation)iWebViewSharedObject0));
    }
}

