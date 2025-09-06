package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@c
@d
@N
abstract class k1 extends j1 implements ScheduledExecutorService {
    final ScheduledExecutorService b;

    protected k1(ScheduledExecutorService scheduledExecutorService0) {
        super(scheduledExecutorService0);
        this.b = scheduledExecutorService0;
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        Runnable runnable1 = this.c(runnable0);
        return this.b.schedule(runnable1, v, timeUnit0);
    }

    @Override
    public final ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        Callable callable1 = this.d(callable0);
        return this.b.schedule(callable1, v, timeUnit0);
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Runnable runnable1 = this.c(runnable0);
        return this.b.scheduleAtFixedRate(runnable1, v, v1, timeUnit0);
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Runnable runnable1 = this.c(runnable0);
        return this.b.scheduleWithFixedDelay(runnable1, v, v1, timeUnit0);
    }
}

