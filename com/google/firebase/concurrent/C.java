package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class c implements com.google.firebase.concurrent.p.c {
    public final o a;
    public final Runnable b;
    public final long c;
    public final TimeUnit d;

    public c(o o0, Runnable runnable0, long v, TimeUnit timeUnit0) {
        this.a = o0;
        this.b = runnable0;
        this.c = v;
        this.d = timeUnit0;
    }

    @Override  // com.google.firebase.concurrent.p$c
    public final ScheduledFuture a(b p$b0) {
        return this.a.o(this.b, this.c, this.d, p$b0);
    }
}

