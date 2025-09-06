package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final class k implements Runnable {
    public final l a;
    public final Timer b;

    public k(l l0, Timer timer0) {
        this.a = l0;
        this.b = timer0;
    }

    @Override
    public final void run() {
        this.a.f(this.b);
    }
}

