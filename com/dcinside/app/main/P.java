package com.dcinside.app.main;

import com.google.firebase.perf.metrics.Trace;
import rx.functions.b;

public final class p implements b {
    public final Trace a;
    public final Q b;

    public p(Trace trace0, Q q0) {
        this.a = trace0;
        this.b = q0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Q.Y1(this.a, this.b, ((Throwable)object0));
    }
}

