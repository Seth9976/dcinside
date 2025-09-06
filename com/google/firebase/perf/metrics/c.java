package com.google.firebase.perf.metrics;

public final class c implements Runnable {
    public final AppStartTrace a;

    public c(AppStartTrace appStartTrace0) {
        this.a = appStartTrace0;
    }

    @Override
    public final void run() {
        this.a.z();
    }
}

