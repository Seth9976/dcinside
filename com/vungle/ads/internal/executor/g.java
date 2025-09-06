package com.vungle.ads.internal.executor;

public final class g implements Runnable {
    public final i a;

    public g(i i0) {
        this.a = i0;
    }

    @Override
    public final void run() {
        i.submit$lambda-1(this.a);
    }
}

