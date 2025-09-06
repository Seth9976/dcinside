package io.reactivex.internal.schedulers;

import d3.f;
import d3.g;
import io.reactivex.J.c;
import io.reactivex.internal.disposables.e;
import io.reactivex.plugins.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class i extends c implements io.reactivex.disposables.c {
    private final ScheduledExecutorService a;
    volatile boolean b;

    public i(ThreadFactory threadFactory0) {
        this.a = p.a(threadFactory0);
    }

    @Override  // io.reactivex.disposables.c
    public boolean a() {
        return this.b;
    }

    @Override  // io.reactivex.J$c
    @f
    public io.reactivex.disposables.c c(@f Runnable runnable0) {
        return this.d(runnable0, 0L, null);
    }

    @Override  // io.reactivex.J$c
    @f
    public io.reactivex.disposables.c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
        return this.b ? e.a : this.f(runnable0, v, timeUnit0, null);
    }

    @Override  // io.reactivex.disposables.c
    public void dispose() {
        if(!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    @f
    public n f(Runnable runnable0, long v, @f TimeUnit timeUnit0, @g io.reactivex.internal.disposables.c c0) {
        n n0 = new n(a.b0(runnable0), c0);
        if(c0 != null && !c0.d(n0)) {
            return n0;
        }
        try {
            Future future0 = v <= 0L ? this.a.submit(n0) : this.a.schedule(n0, v, timeUnit0);
            n0.b(future0);
            return n0;
        label_10:
            if(c0 != null) {
                goto label_11;
            }
            goto label_12;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            goto label_10;
        }
    label_11:
        c0.b(n0);
    label_12:
        a.Y(rejectedExecutionException0);
        return n0;
    }

    public io.reactivex.disposables.c g(Runnable runnable0, long v, TimeUnit timeUnit0) {
        io.reactivex.disposables.c c0 = new m(a.b0(runnable0));
        try {
            Future future0 = v <= 0L ? this.a.submit(((Callable)c0)) : this.a.schedule(((Callable)c0), v, timeUnit0);
            ((io.reactivex.internal.schedulers.a)c0).c(future0);
            return c0;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        a.Y(rejectedExecutionException0);
        return e.a;
    }

    public io.reactivex.disposables.c h(Runnable runnable0, long v, long v1, TimeUnit timeUnit0) {
        Runnable runnable1 = a.b0(runnable0);
        if(v1 <= 0L) {
            io.reactivex.disposables.c c0 = new io.reactivex.internal.schedulers.f(runnable1, this.a);
            try {
                Future future0 = v <= 0L ? this.a.submit(((Callable)c0)) : this.a.schedule(((Callable)c0), v, timeUnit0);
                ((io.reactivex.internal.schedulers.f)c0).c(future0);
                return c0;
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
            }
            a.Y(rejectedExecutionException0);
            return e.a;
        }
        io.reactivex.disposables.c c1 = new l(runnable1);
        try {
            ((io.reactivex.internal.schedulers.a)c1).c(this.a.scheduleAtFixedRate(((Runnable)c1), v, v1, timeUnit0));
            return c1;
        }
        catch(RejectedExecutionException rejectedExecutionException1) {
            a.Y(rejectedExecutionException1);
            return e.a;
        }
    }

    public void i() {
        if(!this.b) {
            this.b = true;
            this.a.shutdown();
        }
    }
}

