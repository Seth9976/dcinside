package com.vungle.ads.internal.load;

public final class g implements Runnable {
    public final i a;
    public final Throwable b;

    public g(i i0, Throwable throwable0) {
        this.a = i0;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        a.onFailure$lambda-1(this.a, this.b);
    }
}

