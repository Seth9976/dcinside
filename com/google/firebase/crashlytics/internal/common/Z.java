package com.google.firebase.crashlytics.internal.common;

public final class z implements Runnable {
    public final C a;
    public final long b;
    public final String c;

    public z(C c0, long v, String s) {
        this.a = c0;
        this.b = v;
        this.c = s;
    }

    @Override
    public final void run() {
        this.a.A(this.b, this.c);
    }
}

