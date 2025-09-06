package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds.UnityAdsShowError;

public final class e implements Runnable {
    public final ShowOperationState a;
    public final UnityAdsShowError b;
    public final String c;

    public e(ShowOperationState showOperationState0, UnityAdsShowError unityAds$UnityAdsShowError0, String s) {
        this.a = showOperationState0;
        this.b = unityAds$UnityAdsShowError0;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsShowFailure$0(this.b, this.c);
    }
}

