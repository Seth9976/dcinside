package com.vungle.ads.internal;

public final class d implements Runnable {
    public final h a;

    public d(h h0) {
        this.a = h0;
    }

    @Override
    public final void run() {
        a.onAdEnd$lambda-2(this.a);
    }
}

