package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;

public final class a implements Runnable {
    public final BiddingBaseManager a;
    public final BiddingSignals b;

    public a(BiddingBaseManager biddingBaseManager0, BiddingSignals biddingSignals0) {
        this.a = biddingBaseManager0;
        this.b = biddingSignals0;
    }

    @Override
    public final void run() {
        this.a.lambda$uploadSignals$2(this.b);
    }
}

