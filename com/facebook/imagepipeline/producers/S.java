package com.facebook.imagepipeline.producers;

public final class s implements Runnable {
    public final t a;
    public final n b;
    public final j0 c;

    public s(t t0, n n0, j0 j00) {
        this.a = t0;
        this.b = n0;
        this.c = j00;
    }

    @Override
    public final void run() {
        t.d(this.a, this.b, this.c);
    }
}

