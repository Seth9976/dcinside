package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.r;

public final class k implements Runnable {
    public final s a;
    public final r b;
    public final int c;
    public final Runnable d;

    public k(s s0, r r0, int v, Runnable runnable0) {
        this.a = s0;
        this.b = r0;
        this.c = v;
        this.d = runnable0;
    }

    @Override
    public final void run() {
        this.a.t(this.b, this.c, this.d);
    }
}

