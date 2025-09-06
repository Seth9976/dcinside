package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.g;
import com.google.firebase.perf.v1.q;

public final class i implements Runnable {
    public final k a;
    public final q b;
    public final g c;

    public i(k k0, q q0, g g0) {
        this.a = k0;
        this.b = q0;
        this.c = g0;
    }

    @Override
    public final void run() {
        this.a.A(this.b, this.c);
    }
}

