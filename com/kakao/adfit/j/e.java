package com.kakao.adfit.j;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.L;

public final class e extends ThreadPoolExecutor {
    static final class a implements Future {
        @Override
        public boolean cancel(boolean z) {
            return true;
        }

        @Override
        public Object get() {
            throw new CancellationException();
        }

        @Override
        public Object get(long v, TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            throw new CancellationException();
        }

        @Override
        public boolean isCancelled() {
            return true;
        }

        @Override
        public boolean isDone() {
            return true;
        }
    }

    private final int a;
    private final AtomicInteger b;

    public e(int v, int v1, long v2, TimeUnit timeUnit0, ThreadFactory threadFactory0, RejectedExecutionHandler rejectedExecutionHandler0) {
        L.p(timeUnit0, "unit");
        L.p(threadFactory0, "threadFactory");
        L.p(rejectedExecutionHandler0, "handler");
        super(v, v, v2, timeUnit0, new LinkedBlockingQueue(), threadFactory0, rejectedExecutionHandler0);
        this.a = v1;
        this.b = new AtomicInteger();
    }

    private final boolean a() {
        return this.getQueue().size() + this.b.get() < this.a;
    }

    @Override
    protected void afterExecute(Runnable runnable0, Throwable throwable0) {
        L.p(runnable0, "r");
        try {
            super.afterExecute(runnable0, throwable0);
        }
        finally {
            this.b.decrementAndGet();
        }
    }

    @Override
    protected void beforeExecute(Thread thread0, Runnable runnable0) {
        L.p(thread0, "t");
        L.p(runnable0, "r");
        try {
            super.beforeExecute(thread0, runnable0);
        }
        finally {
            this.b.incrementAndGet();
        }
    }

    @Override
    public Future submit(Runnable runnable0) {
        L.p(runnable0, "task");
        if(this.a()) {
            Future future0 = super.submit(runnable0);
            L.o(future0, "super.submit(task)");
            return future0;
        }
        return new a();
    }
}

