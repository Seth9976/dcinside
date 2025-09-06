package com.unity3d.services.ads.gmascar.managers;

public final class b implements Runnable {
    public final BiddingBaseManager a;

    public b(BiddingBaseManager biddingBaseManager0) {
        this.a = biddingBaseManager0;
    }

    @Override
    public final void run() {
        this.a.lambda$fetchSignals$1();
    }
}

