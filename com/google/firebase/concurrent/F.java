package com.google.firebase.concurrent;

public final class f implements Runnable {
    public final o a;
    public final Runnable b;
    public final b c;

    public f(o o0, Runnable runnable0, b p$b0) {
        this.a = o0;
        this.b = runnable0;
        this.c = p$b0;
    }

    @Override
    public final void run() {
        this.a.t(this.b, this.c);
    }
}

