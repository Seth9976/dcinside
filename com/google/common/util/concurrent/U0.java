package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import O1.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@N
public class u0 extends FutureTask implements t0 {
    private final P a;

    u0(Runnable runnable0, @F0 Object object0) {
        super(runnable0, object0);
        this.a = new P();
    }

    u0(Callable callable0) {
        super(callable0);
        this.a = new P();
    }

    public static u0 a(Runnable runnable0, @F0 Object object0) {
        return new u0(runnable0, object0);
    }

    @Override  // com.google.common.util.concurrent.t0
    public void addListener(Runnable runnable0, Executor executor0) {
        this.a.a(runnable0, executor0);
    }

    public static u0 b(Callable callable0) {
        return new u0(callable0);
    }

    @Override
    protected void done() {
        this.a.b();
    }

    @Override
    @a
    @F0
    public Object get(long v, TimeUnit timeUnit0) throws TimeoutException, InterruptedException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        return v1 > 0x1DCD64FFFFFFFFFFL ? super.get(Math.min(v1, 0x1DCD64FFFFFFFFFFL), TimeUnit.NANOSECONDS) : super.get(v, timeUnit0);
    }
}

