package com.google.firebase.concurrent;

public final class d implements Runnable {
    public final Runnable a;
    public final b b;

    public d(Runnable runnable0, b p$b0) {
        this.a = runnable0;
        this.b = p$b0;
    }

    @Override
    public final void run() {
        o.x(this.a, this.b);
    }
}

