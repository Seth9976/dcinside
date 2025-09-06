package com.vungle.ads.internal.executor;

public final class e implements Runnable {
    public final i a;

    public e(i i0) {
        this.a = i0;
    }

    @Override
    public final void run() {
        i.submit$lambda-2(this.a);
    }
}

