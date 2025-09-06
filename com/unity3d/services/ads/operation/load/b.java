package com.unity3d.services.ads.operation.load;

public final class b implements Runnable {
    public final LoadOperationState a;

    public b(LoadOperationState loadOperationState0) {
        this.a = loadOperationState0;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsAdLoaded$1();
    }
}

