package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.j;
import com.google.firebase.perf.util.m;
import com.google.firebase.perf.v1.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class l {
    private final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    private final Runtime c;
    @Nullable
    private ScheduledFuture d;
    private long e;
    private static final a f = null;
    public static final long g = -1L;
    private static final int h = -1;

    static {
        l.f = a.e();
    }

    @SuppressLint({"ThreadPoolCreation"})
    l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    @VisibleForTesting
    l(ScheduledExecutorService scheduledExecutorService0, Runtime runtime0) {
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorService0;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime0;
    }

    public void c(Timer timer0) {
        this.h(timer0);
    }

    private int d() {
        return m.d(j.f.e(this.c.totalMemory() - this.c.freeMemory()));
    }

    public static boolean e(long v) {
        return v <= 0L;
    }

    // 检测为 Lambda 实现
    private void f(Timer timer0) [...]

    // 检测为 Lambda 实现
    private void g(Timer timer0) [...]

    private void h(Timer timer0) {
        synchronized(this) {
            try {
                k k0 = () -> {
                    c c0 = this.l(timer0);
                    if(c0 != null) {
                        this.b.add(c0);
                    }
                };
                this.a.schedule(k0, 0L, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                l.f.l("Unable to collect Memory Metric: " + rejectedExecutionException0.getMessage());
            }
        }
    }

    private void i(long v, Timer timer0) {
        synchronized(this) {
            this.e = v;
            try {
                com.google.firebase.perf.session.gauges.j j0 = () -> {
                    c c0 = this.l(timer0);
                    if(c0 != null) {
                        this.b.add(c0);
                    }
                };
                this.d = this.a.scheduleAtFixedRate(j0, 0L, v, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                l.f.l("Unable to start collecting Memory Metrics: " + rejectedExecutionException0.getMessage());
            }
        }
    }

    public void j(long v, Timer timer0) {
        if(l.e(v)) {
            return;
        }
        if(this.d != null) {
            if(this.e != v) {
                this.k();
                this.i(v, timer0);
            }
            return;
        }
        this.i(v, timer0);
    }

    public void k() {
        ScheduledFuture scheduledFuture0 = this.d;
        if(scheduledFuture0 == null) {
            return;
        }
        scheduledFuture0.cancel(false);
        this.d = null;
        this.e = -1L;
    }

    @Nullable
    private c l(Timer timer0) {
        if(timer0 == null) {
            return null;
        }
        long v = timer0.c();
        return (c)c.z6().wb(v).xb(this.d()).build();
    }
}

