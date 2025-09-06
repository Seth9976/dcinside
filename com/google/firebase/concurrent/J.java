package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class j implements c {
    public final o a;
    public final Runnable b;
    public final long c;
    public final long d;
    public final TimeUnit e;

    public j(o o0, Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        this.a = o0;
        this.b = runnable0;
        this.c = v;
        this.d = v1;
        this.e = timeUnit0;
    }

    @Override  // com.google.firebase.concurrent.p$c
    public final ScheduledFuture a(b p$b0) {
        return this.a.w(this.b, this.c, this.d, this.e, p$b0);
    }
}

