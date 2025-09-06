package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

public final class f implements Runnable {
    public final g a;
    public final int b;
    public final int c;

    public f(g g0, int v, int v1) {
        this.a = g0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        g.m(this.a, this.b, this.c);
    }
}

