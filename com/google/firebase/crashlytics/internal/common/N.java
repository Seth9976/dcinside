package com.google.firebase.crashlytics.internal.common;

public final class n implements Runnable {
    public final p a;
    public final String b;

    public n(p p0, String s) {
        this.a = p0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.M(this.b);
    }
}

