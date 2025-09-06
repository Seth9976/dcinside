package com.google.common.util.concurrent;

public final class r implements Runnable {
    public final t a;
    public final t0 b;
    public final int c;

    public r(t t0, t0 t00, int v) {
        this.a = t0;
        this.b = t00;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.V(this.b, this.c);
    }
}

