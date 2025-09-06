package com.google.firebase.crashlytics.internal.common;

public final class t implements Runnable {
    public final C a;
    public final Throwable b;

    public t(C c0, Throwable throwable0) {
        this.a = c0;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        this.a.C(this.b);
    }
}

