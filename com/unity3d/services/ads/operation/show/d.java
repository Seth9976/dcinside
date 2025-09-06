package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds.UnityAdsShowCompletionState;

public final class d implements Runnable {
    public final ShowOperationState a;
    public final UnityAdsShowCompletionState b;

    public d(ShowOperationState showOperationState0, UnityAdsShowCompletionState unityAds$UnityAdsShowCompletionState0) {
        this.a = showOperationState0;
        this.b = unityAds$UnityAdsShowCompletionState0;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsShowComplete$3(this.b);
    }
}

