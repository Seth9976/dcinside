package com.google.firebase.concurrent;

public final class i implements Runnable {
    public final Runnable a;
    public final b b;

    public i(Runnable runnable0, b p$b0) {
        this.a = runnable0;
        this.b = p$b0;
    }

    @Override
    public final void run() {
        o.m(this.a, this.b);
    }
}

