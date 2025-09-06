package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class z0 {
    public static ScheduledFuture a(A0 a00, Runnable runnable0, long v, TimeUnit timeUnit0) {
        return a00.schedule(runnable0, v, timeUnit0);
    }

    public static ScheduledFuture b(A0 a00, Callable callable0, long v, TimeUnit timeUnit0) {
        return a00.schedule(callable0, v, timeUnit0);
    }

    public static ScheduledFuture c(A0 a00, Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return a00.scheduleAtFixedRate(runnable0, v, v1, timeUnit0);
    }

    public static ScheduledFuture d(A0 a00, Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        return a00.scheduleWithFixedDelay(runnable0, v, v1, timeUnit0);
    }
}

