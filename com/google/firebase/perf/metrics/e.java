package com.google.firebase.perf.metrics;

public final class e implements Runnable {
    public final AppStartTrace a;

    public e(AppStartTrace appStartTrace0) {
        this.a = appStartTrace0;
    }

    @Override
    public final void run() {
        this.a.B();
    }
}

