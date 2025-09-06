package com.google.firebase.crashlytics.internal.common;

public final class v implements Runnable {
    public final C a;
    public final Throwable b;

    public v(C c0, Throwable throwable0) {
        this.a = c0;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        this.a.D(this.b);
    }
}

