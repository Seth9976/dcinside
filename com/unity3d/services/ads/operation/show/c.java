package com.unity3d.services.ads.operation.show;

public final class c implements Runnable {
    public final ShowOperationState a;
    public final String b;

    public c(ShowOperationState showOperationState0, String s) {
        this.a = showOperationState0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsShowStart$2(this.b);
    }
}

