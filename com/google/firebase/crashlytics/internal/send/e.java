package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.google.android.datatransport.f;
import com.google.android.datatransport.h;
import com.google.android.datatransport.l;
import com.google.android.datatransport.runtime.m;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.F;
import com.google.firebase.crashlytics.internal.common.T;
import com.google.firebase.crashlytics.internal.common.i0;
import com.google.firebase.crashlytics.internal.g;
import com.google.firebase.crashlytics.internal.settings.d;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class e {
    static class a {
    }

    final class b implements Runnable {
        private final F a;
        private final TaskCompletionSource b;
        final e c;

        private b(F f0, TaskCompletionSource taskCompletionSource0) {
            this.a = f0;
            this.b = taskCompletionSource0;
        }

        b(F f0, TaskCompletionSource taskCompletionSource0, a e$a0) {
            this(f0, taskCompletionSource0);
        }

        @Override
        public void run() {
            e.this.p(this.a, this.b);
            e.this.i.e();
            double f = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", ((double)(f / 1000.0))) + " s for report: " + this.a.d());
            e.q(f);
        }
    }

    private final double a;
    private final double b;
    private final long c;
    private final long d;
    private final int e;
    private final BlockingQueue f;
    private final ThreadPoolExecutor g;
    private final l h;
    private final T i;
    private int j;
    private long k;
    private static final int l = 1000;
    private static final int m = 60000;
    private static final int n = 3600000;
    private static final int o = 2000;

    @SuppressLint({"ThreadPoolCreation"})
    e(double f, double f1, long v, l l0, T t0) {
        this.a = f;
        this.b = f1;
        this.c = v;
        this.h = l0;
        this.i = t0;
        this.d = SystemClock.elapsedRealtime();
        this.e = (int)f;
        ArrayBlockingQueue arrayBlockingQueue0 = new ArrayBlockingQueue(((int)f));
        this.f = arrayBlockingQueue0;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue0);
        this.j = 0;
        this.k = 0L;
    }

    e(l l0, d d0, T t0) {
        this(d0.f, d0.g, ((long)d0.h) * 1000L, l0, t0);
    }

    private double g() {
        double f = (double)this.h();
        return Math.min(3600000.0, 60000.0 / this.a * Math.pow(this.b, f));
    }

    private int h() {
        if(this.k == 0L) {
            this.k = 0x1991AF31B2BL;
        }
        int v = (int)((0x1991AF31B2BL - this.k) / this.c);
        int v1 = this.l() ? Math.min(100, this.j + v) : Math.max(0, this.j - v);
        if(this.j != v1) {
            this.j = v1;
            this.k = 0x1991AF31B2BL;
        }
        return v1;
    }

    TaskCompletionSource i(F f0, boolean z) {
        synchronized(this.f) {
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            if(z) {
                this.i.d();
                if(this.k()) {
                    g.f().b("Enqueueing report: " + f0.d());
                    g.f().b("Queue size: " + this.f.size());
                    b e$b0 = new b(this, f0, taskCompletionSource0, null);
                    this.g.execute(e$b0);
                    g.f().b("Closing task for report: " + f0.d());
                    taskCompletionSource0.trySetResult(f0);
                    return taskCompletionSource0;
                }
                this.h();
                g.f().b("Dropping report due to queue being full: " + f0.d());
                this.i.c();
                taskCompletionSource0.trySetResult(f0);
                return taskCompletionSource0;
            }
            this.p(f0, taskCompletionSource0);
            return taskCompletionSource0;
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        new Thread(() -> {
            try {
                m.a(this.h, h.c);
            }
            catch(Exception unused_ex) {
            }
            countDownLatch0.countDown();
        }).start();
        i0.c(countDownLatch0, 2L, TimeUnit.SECONDS);
    }

    private boolean k() {
        return this.f.size() < this.e;
    }

    private boolean l() {
        return this.f.size() == this.e;
    }

    // 检测为 Lambda 实现
    private void m(CountDownLatch countDownLatch0) [...]

    // 检测为 Lambda 实现
    private void n(TaskCompletionSource taskCompletionSource0, boolean z, F f0, Exception exception0) [...]

    private long o() [...] // 潜在的解密器

    private void p(F f0, TaskCompletionSource taskCompletionSource0) {
        g.f().b("Sending report through Google DataTransport: " + f0.d());
        boolean z = SystemClock.elapsedRealtime() - this.d < 2000L;
        f f1 = f.z(f0.b());
        com.google.firebase.crashlytics.internal.send.d d0 = (Exception exception0) -> {
            if(exception0 != null) {
                taskCompletionSource0.trySetException(exception0);
                return;
            }
            if(z) {
                this.j();
            }
            taskCompletionSource0.trySetResult(f0);
        };
        this.h.a(f1, d0);
    }

    private static void q(double f) {
        try {
            Thread.sleep(((long)f));
        }
        catch(InterruptedException unused_ex) {
        }
    }
}

