package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

public final class a implements Runnable {
    public final c a;
    public final Timer b;

    public a(c c0, Timer timer0) {
        this.a = c0;
        this.b = timer0;
    }

    @Override
    public final void run() {
        this.a.h(this.b);
    }
}

