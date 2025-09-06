package com.vungle.ads.internal;

public final class b implements Runnable {
    public final h a;

    public b(h h0) {
        this.a = h0;
    }

    @Override
    public final void run() {
        a.onAdClick$lambda-3(this.a);
    }
}

