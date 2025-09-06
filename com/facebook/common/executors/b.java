package com.facebook.common.executors;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k1.n.a;
import k1.n;

@n(a.a)
public class b extends AbstractExecutorService {
    class com.facebook.common.executors.b.a implements Runnable {
        final b a;

        private com.facebook.common.executors.b.a() {
        }

        com.facebook.common.executors.b.a(c c0) {
        }

        @Override
        public void run() {
            try {
                Runnable runnable0 = (Runnable)b.this.d.poll();
                if(runnable0 == null) {
                    x0.a.V(b.h, "%s: Worker has nothing to run", b.this.a);
                }
                else {
                    runnable0.run();
                }
                goto label_13;
            }
            catch(Throwable throwable0) {
            }
            int v = b.this.f.decrementAndGet();
            if(b.this.d.isEmpty()) {
                x0.a.W(b.h, "%s: worker finished; %d workers left", b.this.a, v);
            }
            else {
                b.this.h();
            }
            throw throwable0;
        label_13:
            int v1 = b.this.f.decrementAndGet();
            if(!b.this.d.isEmpty()) {
                b.this.h();
                return;
            }
            x0.a.W(b.h, "%s: worker finished; %d workers left", b.this.a, v1);
        }
    }

    private final String a;
    private final Executor b;
    private volatile int c;
    private final BlockingQueue d;
    private final com.facebook.common.executors.b.a e;
    private final AtomicInteger f;
    private final AtomicInteger g;
    private static final Class h;

    static {
        b.h = b.class;
    }

    public b(String s, int v, Executor executor0, BlockingQueue blockingQueue0) {
        if(v <= 0) {
            throw new IllegalArgumentException("max concurrency must be > 0");
        }
        this.a = s;
        this.b = executor0;
        this.c = v;
        this.d = blockingQueue0;
        this.e = new com.facebook.common.executors.b.a(this, null);
        this.f = new AtomicInteger(0);
        this.g = new AtomicInteger(0);
    }

    @Override
    public boolean awaitTermination(long v, TimeUnit timeUnit0) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void execute(Runnable runnable0) {
        if(runnable0 == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if(!this.d.offer(runnable0)) {
            throw new RejectedExecutionException(this.a + " queue is full, size=" + this.d.size());
        }
        int v = this.d.size();
        int v1 = this.g.get();
        if(v > v1 && this.g.compareAndSet(v1, v)) {
            x0.a.W(b.h, "%s: max pending work in queue = %d", this.a, v);
        }
        this.h();
    }

    public boolean f() {
        return this.d.isEmpty() && this.f.get() == 0;
    }

    public static b g(String s, int v, int v1, Executor executor0) {
        return new b(s, v, executor0, new LinkedBlockingQueue(v1));
    }

    private void h() {
        for(int v = this.f.get(); v < this.c; v = this.f.get()) {
            if(this.f.compareAndSet(v, v + 1)) {
                x0.a.X(b.h, "%s: starting worker %d of %d", this.a, ((int)(v + 1)), this.c);
                this.b.execute(this.e);
                return;
            }
            x0.a.V(b.h, "%s: race in startWorkerIfNeeded; retrying", this.a);
        }
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
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}

