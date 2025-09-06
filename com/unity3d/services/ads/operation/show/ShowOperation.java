package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

public class ShowOperation extends AdOperation implements IShowOperation {
    private ShowOperationState showOperationState;

    public ShowOperation(ShowOperationState showOperationState0, IWebViewBridgeInvocation iWebViewBridgeInvocation0) {
        super(iWebViewBridgeInvocation0, "show");
        this.showOperationState = showOperationState0;
    }

    @Override  // com.unity3d.services.core.webview.bridge.IWebViewSharedObject
    public String getId() {
        return this.showOperationState.id;
    }

    @Override  // com.unity3d.services.ads.operation.show.IShowOperation
    public ShowOperationState getShowOperationState() {
        return this.showOperationState;
    }

    @Override  // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowClick(String s) {
        if(this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowClick();
                }
            }
        });
    }

    @Override  // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowComplete(String s, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
        if(this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowComplete(unityAds$UnityAdsShowCompletionState0);
                }
            }
        });
    }

    @Override  // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowFailure(String s, UnityAdsShowError unityAds$UnityAdsShowError0, String s1) {
        if(this.showOperationState != null && this.showOperationState.listener != null) {
            Utilities.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(ShowOperation.this.showOperationState != null) {
                        ShowOperation.this.showOperationState.onUnityAdsShowFailure(unityAds$UnityAdsShowError0, s1);
                    }
                }
            });
        }
    }

    @Override  // com.unity3d.ads.IUnityAdsShowListener
    public void onUnityAdsShowStart(String s) {
        if(this.showOperationState == null) {
            return;
        }
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if(ShowOperation.this.showOperationState != null) {
                    ShowOperation.this.showOperationState.onUnityAdsShowStart(s);
                }
            }
        });
    }
}

