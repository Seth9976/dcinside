package com.google.firebase.crashlytics.internal.common;

public final class w implements Runnable {
    public final C a;
    public final String b;

    public w(C c0, String s) {
        this.a = c0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.H(this.b);
    }
}

