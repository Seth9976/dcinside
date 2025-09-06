package com.google.firebase.concurrent;

public final class n implements Runnable {
    public final Runnable a;
    public final b b;

    public n(Runnable runnable0, b p$b0) {
        this.a = runnable0;
        this.b = p$b0;
    }

    @Override
    public final void run() {
        o.s(this.a, this.b);
    }
}

