package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;

public final class c implements Runnable {
    public final LoadOperationState a;
    public final UnityAdsLoadError b;
    public final String c;

    public c(LoadOperationState loadOperationState0, UnityAdsLoadError unityAds$UnityAdsLoadError0, String s) {
        this.a = loadOperationState0;
        this.b = unityAds$UnityAdsLoadError0;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsFailedToLoad$0(this.b, this.c);
    }
}

