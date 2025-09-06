package com.google.firebase.perf.metrics;

public final class d implements Runnable {
    public final AppStartTrace a;

    public d(AppStartTrace appStartTrace0) {
        this.a = appStartTrace0;
    }

    @Override
    public final void run() {
        this.a.A();
    }
}

