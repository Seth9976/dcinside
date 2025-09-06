package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import O1.a;
import O1.f;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@f("Use FakeTimeLimiter")
@N
public interface b1 {
    void a(Runnable arg1, long arg2, TimeUnit arg3) throws TimeoutException;

    @a
    @F0
    Object b(Callable arg1, long arg2, TimeUnit arg3) throws TimeoutException, ExecutionException;

    @a
    @F0
    Object c(Callable arg1, long arg2, TimeUnit arg3) throws TimeoutException, InterruptedException, ExecutionException;

    void d(Runnable arg1, long arg2, TimeUnit arg3) throws TimeoutException, InterruptedException;

    Object e(Object arg1, Class arg2, long arg3, TimeUnit arg4);
}

