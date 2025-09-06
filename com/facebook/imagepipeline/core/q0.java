package com.facebook.imagepipeline.core;

public final class q0 implements Runnable {
    public final r0 a;
    public final Runnable b;

    public q0(r0 r00, Runnable runnable0) {
        this.a = r00;
        this.b = runnable0;
    }

    @Override
    public final void run() {
        r0.b(this.a, this.b);
    }
}

