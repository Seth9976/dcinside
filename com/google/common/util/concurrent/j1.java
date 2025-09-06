package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import com.google.common.base.U;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@N
abstract class j1 implements ExecutorService {
    private final ExecutorService a;

    protected j1(ExecutorService executorService0) {
        this.a = (ExecutorService)H.E(executorService0);
    }

    @Override
    public final boolean awaitTermination(long v, TimeUnit timeUnit0) throws InterruptedException {
        return this.a.awaitTermination(v, timeUnit0);
    }

    // 检测为 Lambda 实现
    private static void b(Callable callable0) [...]

    protected Runnable c(Runnable runnable0) {
        return () -> try {
            this.d(Executors.callable(runnable0, null)).call();
        }
        catch(Exception exception0) {
            H0.b(exception0);
            U.w(exception0);
            throw new RuntimeException(exception0);
        };
    }

    protected abstract Callable d(Callable arg1);

    private O2 e(Collection collection0) {
        a o2$a0 = O2.n();
        for(Object object0: collection0) {
            o2$a0.j(this.d(((Callable)object0)));
        }
        return o2$a0.n();
    }

    @Override
    public final void execute(Runnable runnable0) {
        Runnable runnable1 = this.c(runnable0);
        this.a.execute(runnable1);
    }

    @Override
    public final List invokeAll(Collection collection0) throws InterruptedException {
        O2 o20 = this.e(collection0);
        return this.a.invokeAll(o20);
    }

    @Override
    public final List invokeAll(Collection collection0, long v, TimeUnit timeUnit0) throws InterruptedException {
        O2 o20 = this.e(collection0);
        return this.a.invokeAll(o20, v, timeUnit0);
    }

    @Override
    public final Object invokeAny(Collection collection0) throws InterruptedException, ExecutionException {
        O2 o20 = this.e(collection0);
        return this.a.invokeAny(o20);
    }

    @Override
    public final Object invokeAny(Collection collection0, long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        O2 o20 = this.e(collection0);
        return this.a.invokeAny(o20, v, timeUnit0);
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override
    @O1.a
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable0) {
        Runnable runnable1 = this.c(runnable0);
        return this.a.submit(runnable1);
    }

    @Override
    public final Future submit(Runnable runnable0, @F0 Object object0) {
        Runnable runnable1 = this.c(runnable0);
        return this.a.submit(runnable1, object0);
    }

    @Override
    public final Future submit(Callable callable0) {
        Callable callable1 = this.d(((Callable)H.E(callable0)));
        return this.a.submit(callable1);
    }
}

