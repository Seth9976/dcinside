package com.unity3d.services.ads.operation.show;

public final class b implements Runnable {
    public final ShowOperationState a;

    public b(ShowOperationState showOperationState0) {
        this.a = showOperationState0;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsShowClick$1();
    }
}

