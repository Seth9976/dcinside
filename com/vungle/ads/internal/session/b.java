package com.vungle.ads.internal.session;

public final class b implements Runnable {
    public final d a;

    public b(d d0) {
        this.a = d0;
    }

    @Override
    public final void run() {
        d.retrieveUnclosedAd$lambda-1(this.a);
    }
}

