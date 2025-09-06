package com.google.firebase.perf.metrics;

public final class f implements Runnable {
    public final AppStartTrace a;

    public f(AppStartTrace appStartTrace0) {
        this.a = appStartTrace0;
    }

    @Override
    public final void run() {
        this.a.x();
    }
}

