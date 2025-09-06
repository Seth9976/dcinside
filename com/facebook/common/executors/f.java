package com.facebook.common.executors;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class f extends AbstractExecutorService implements e {
    private final Handler a;

    public f(Handler handler0) {
        this.a = handler0;
    }

    protected g a(Runnable runnable0, @h Object object0) {
        return new g(this.a, runnable0, object0);
    }

    @Override
    public boolean awaitTermination(long v, TimeUnit timeUnit0) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    protected g b(Callable callable0) {
        return new g(this.a, callable0);
    }

    public ScheduledFuture c(Runnable runnable0) {
        return this.d(runnable0, null);
    }

    public ScheduledFuture d(Runnable runnable0, @h Object object0) {
        runnable0.getClass();
        ScheduledFuture scheduledFuture0 = this.a(runnable0, object0);
        this.execute(((Runnable)scheduledFuture0));
        return scheduledFuture0;
    }

    public ScheduledFuture e(Callable callable0) {
        callable0.getClass();
        ScheduledFuture scheduledFuture0 = this.b(callable0);
        this.execute(((Runnable)scheduledFuture0));
        return scheduledFuture0;
    }

    @Override
    public void execute(Runnable runnable0) {
        this.a.post(runnable0);
    }

    @Override  // com.facebook.common.executors.e
    public void i3() {
        this.a.getLooper().quit();
    }

    @Override
    public boolean isShutdown() {
        return false;
    }

    @Override
    public boolean isTerminated() {
        return false;
    }

    @Override
    protected RunnableFuture newTaskFor(Runnable runnable0, @h Object object0) {
        return this.a(runnable0, object0);
    }

    @Override
    protected RunnableFuture newTaskFor(Callable callable0) {
        return this.b(callable0);
    }

    @Override  // com.facebook.common.executors.e
    public boolean r3() {
        return Thread.currentThread() == this.a.getLooper().getThread();
    }

    @Override
    public ScheduledFuture schedule(Runnable runnable0, long v, TimeUnit timeUnit0) {
        ScheduledFuture scheduledFuture0 = this.a(runnable0, null);
        long v1 = timeUnit0.toMillis(v);
        this.a.postDelayed(((Runnable)scheduledFuture0), v1);
        return scheduledFuture0;
    }

    @Override
    public ScheduledFuture schedule(Callable callable0, long v, TimeUnit timeUnit0) {
        ScheduledFuture scheduledFuture0 = this.b(callable0);
        long v1 = timeUnit0.toMillis(v);
        this.a.postDelayed(((Runnable)scheduledFuture0), v1);
        return scheduledFuture0;
    }

    @Override
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Future submit(Runnable runnable0) {
        return this.c(runnable0);
    }

    @Override
    public Future submit(Runnable runnable0, @h Object object0) {
        return this.d(runnable0, object0);
    }

    @Override
    public Future submit(Callable callable0) {
        return this.e(callable0);
    }
}

