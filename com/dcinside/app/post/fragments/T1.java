package com.dcinside.app.post.fragments;

public final class t1 implements Runnable {
    public final r1 a;
    public final int b;

    public t1(r1 r10, int v) {
        this.a = r10;
        this.b = v;
    }

    @Override
    public final void run() {
        a.f(this.a, this.b);
    }
}

