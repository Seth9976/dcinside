package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.m;

public final class f implements Runnable {
    public final k a;
    public final m b;
    public final g c;

    public f(k k0, m m0, g g0) {
        this.a = k0;
        this.b = m0;
        this.c = g0;
    }

    @Override
    public final void run() {
        this.a.B(this.b, this.c);
    }
}

