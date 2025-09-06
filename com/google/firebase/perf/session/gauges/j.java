package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final class j implements Runnable {
    public final l a;
    public final Timer b;

    public j(l l0, Timer timer0) {
        this.a = l0;
        this.b = timer0;
    }

    @Override
    public final void run() {
        this.a.g(this.b);
    }
}

