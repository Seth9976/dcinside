package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.x;

public final class g implements Runnable {
    public final k a;
    public final x b;
    public final com.google.firebase.perf.v1.g c;

    public g(k k0, x x0, com.google.firebase.perf.v1.g g0) {
        this.a = k0;
        this.b = x0;
        this.c = g0;
    }

    @Override
    public final void run() {
        this.a.z(this.b, this.c);
    }
}

