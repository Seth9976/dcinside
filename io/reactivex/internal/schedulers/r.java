package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.d;
import d3.f;
import io.reactivex.J.c;
import io.reactivex.J;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class r extends J {
    static final class a extends c {
        final ScheduledExecutorService a;
        final b b;
        volatile boolean c;

        a(ScheduledExecutorService scheduledExecutorService0) {
            this.a = scheduledExecutorService0;
            this.b = new b();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c;
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
            if(this.c) {
                return e.a;
            }
            io.reactivex.disposables.c c0 = new n(io.reactivex.plugins.a.b0(runnable0), this.b);
            this.b.d(c0);
            try {
                Future future0 = v <= 0L ? this.a.submit(((Callable)c0)) : this.a.schedule(((Callable)c0), v, timeUnit0);
                ((n)c0).b(future0);
                return c0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
            }
            this.dispose();
            io.reactivex.plugins.a.Y(rejectedExecutionException0);
            return e.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(!this.c) {
                this.c = true;
                this.b.dispose();
            }
        }
    }

    final ThreadFactory b;
    final AtomicReference c;
    private static final String d = "rx2.single-priority";
    private static final String e = "RxSingleScheduler";
    static final k f;
    static final ScheduledExecutorService g;

    static {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(0);
        r.g = scheduledExecutorService0;
        scheduledExecutorService0.shutdown();
        r.f = new k("RxSingleScheduler", 5, true);
    }

    public r() {
        this(r.f);
    }

    public r(ThreadFactory threadFactory0) {
        AtomicReference atomicReference0 = new AtomicReference();
        this.c = atomicReference0;
        this.b = threadFactory0;
        atomicReference0.lazySet(r.l(threadFactory0));
    }

    @Override  // io.reactivex.J
    @f
    public c d() {
        return new a(((ScheduledExecutorService)this.c.get()));
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c g(@f Runnable runnable0, long v, TimeUnit timeUnit0) {
        io.reactivex.disposables.c c0 = new m(io.reactivex.plugins.a.b0(runnable0));
        try {
            Future future0 = v <= 0L ? ((ScheduledExecutorService)this.c.get()).submit(((Callable)c0)) : ((ScheduledExecutorService)this.c.get()).schedule(((Callable)c0), v, timeUnit0);
            ((io.reactivex.internal.schedulers.a)c0).c(future0);
            return c0;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        io.reactivex.plugins.a.Y(rejectedExecutionException0);
        return e.a;
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.disposables.c h(@f Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Runnable runnable1 = io.reactivex.plugins.a.b0(runnable0);
        if(v1 <= 0L) {
            ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.c.get();
            io.reactivex.disposables.c c0 = new io.reactivex.internal.schedulers.f(runnable1, scheduledExecutorService0);
            try {
                Future future0 = v <= 0L ? scheduledExecutorService0.submit(((Callable)c0)) : scheduledExecutorService0.schedule(((Callable)c0), v, timeUnit0);
                ((io.reactivex.internal.schedulers.f)c0).c(future0);
                return c0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
            }
            io.reactivex.plugins.a.Y(rejectedExecutionException0);
            return e.a;
        }
        io.reactivex.disposables.c c1 = new l(runnable1);
        try {
            ((io.reactivex.internal.schedulers.a)c1).c(((ScheduledExecutorService)this.c.get()).scheduleAtFixedRate(((Runnable)c1), v, v1, timeUnit0));
            return c1;
        }
        catch(RejectedExecutionException rejectedExecutionException1) {
            io.reactivex.plugins.a.Y(rejectedExecutionException1);
            return e.a;
        }
    }

    @Override  // io.reactivex.J
    public void i() {
        ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.c.get();
        ScheduledExecutorService scheduledExecutorService1 = r.g;
        if(scheduledExecutorService0 != scheduledExecutorService1) {
            ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService)this.c.getAndSet(scheduledExecutorService1);
            if(scheduledExecutorService2 != scheduledExecutorService1) {
                scheduledExecutorService2.shutdownNow();
            }
        }
    }

    @Override  // io.reactivex.J
    public void j() {
        ExecutorService executorService0 = null;
        do {
            ScheduledExecutorService scheduledExecutorService0 = (ScheduledExecutorService)this.c.get();
            if(scheduledExecutorService0 != r.g) {
                if(executorService0 != null) {
                    executorService0.shutdown();
                }
                return;
            }
            if(executorService0 == null) {
                executorService0 = r.l(this.b);
            }
        }
        while(!d.a(this.c, scheduledExecutorService0, executorService0));
    }

    static ScheduledExecutorService l(ThreadFactory threadFactory0) {
        return p.a(threadFactory0);
    }
}

