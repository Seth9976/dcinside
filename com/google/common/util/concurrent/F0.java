package com.google.common.util.concurrent;

import com.google.common.collect.O2;

public final class f0 implements Runnable {
    public final e a;
    public final O2 b;
    public final int c;

    public f0(e h0$e0, O2 o20, int v) {
        this.a = h0$e0;
        this.b = o20;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.f(this.b, this.c);
    }
}

