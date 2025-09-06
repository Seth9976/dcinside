package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.g;

public final class e implements Runnable {
    public final GaugeManager a;
    public final String b;
    public final g c;

    public e(GaugeManager gaugeManager0, String s, g g0) {
        this.a = gaugeManager0;
        this.b = s;
        this.c = g0;
    }

    @Override
    public final void run() {
        this.a.lambda$startCollectingGauges$2(this.b, this.c);
    }
}

