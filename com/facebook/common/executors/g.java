package com.facebook.common.executors;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class g implements RunnableFuture, ScheduledFuture {
    private final Handler a;
    private final FutureTask b;

    public g(Handler handler0, Runnable runnable0, @h Object object0) {
        this.a = handler0;
        this.b = new FutureTask(runnable0, object0);
    }

    public g(Handler handler0, Callable callable0) {
        this.a = handler0;
        this.b = new FutureTask(callable0);
    }

    public int a(Delayed delayed0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean cancel(boolean z) {
        return this.b.cancel(z);
    }

    @Override
    public int compareTo(Object object0) {
        return this.a(((Delayed)object0));
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        return this.b.get();
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.b.get(v, timeUnit0);
    }

    @Override
    public long getDelay(TimeUnit timeUnit0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override
    public boolean isDone() {
        return this.b.isDone();
    }

    @Override
    public void run() {
        this.b.run();
    }
}

