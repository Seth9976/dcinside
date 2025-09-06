package com.google.firebase.crashlytics.internal.common;

public final class x implements Runnable {
    public final C a;
    public final String b;
    public final String c;

    public x(C c0, String s, String s1) {
        this.a = c0;
        this.b = s;
        this.c = s1;
    }

    @Override
    public final void run() {
        this.a.E(this.b, this.c);
    }
}

