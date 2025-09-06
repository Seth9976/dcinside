package com.google.android.datatransport.runtime.scheduling.jobscheduling;

public final class u implements Runnable {
    public final w a;

    public u(w w0) {
        this.a = w0;
    }

    @Override
    public final void run() {
        this.a.e();
    }
}

