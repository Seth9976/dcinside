package com.google.firebase.concurrent;

public final class e implements Runnable {
    public final o a;
    public final Runnable b;
    public final b c;

    public e(o o0, Runnable runnable0, b p$b0) {
        this.a = o0;
        this.b = runnable0;
        this.c = p$b0;
    }

    @Override
    public final void run() {
        this.a.v(this.b, this.c);
    }
}

