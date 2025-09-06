package com.unity3d.services.ads.gmascar.managers;

public final class c implements Runnable {
    public final BiddingBaseManager a;
    public final String b;

    public c(BiddingBaseManager biddingBaseManager0, String s) {
        this.a = biddingBaseManager0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.lambda$onUnityAdsTokenReady$0(this.b);
    }
}

