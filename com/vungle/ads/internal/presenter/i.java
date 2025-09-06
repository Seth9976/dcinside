package com.vungle.ads.internal.presenter;

public final class i implements Runnable {
    public final k a;
    public final long b;

    public i(k k0, long v) {
        this.a = k0;
        this.b = v;
    }

    @Override
    public final void run() {
        k.processCommand$lambda-14(this.a, this.b);
    }
}

