package com.google.firebase.perf.metrics;

import com.google.firebase.perf.v1.x.b;

public final class g implements Runnable {
    public final AppStartTrace a;
    public final b b;

    public g(AppStartTrace appStartTrace0, b x$b0) {
        this.a = appStartTrace0;
        this.b = x$b0;
    }

    @Override
    public final void run() {
        this.a.w(this.b);
    }
}

