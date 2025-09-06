package com.dcinside.app.main;

import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.metrics.Trace;
import rx.functions.b;

public final class v implements b {
    public final Trace a;
    public final FragmentActivity b;
    public final Q c;

    public v(Trace trace0, FragmentActivity fragmentActivity0, Q q0) {
        this.a = trace0;
        this.b = fragmentActivity0;
        this.c = q0;
    }

    @Override  // rx.functions.b
    public final void b(Object object0) {
        Q.y1(this.a, this.b, this.c, ((Throwable)object0));
    }
}

