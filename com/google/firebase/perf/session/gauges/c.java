package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.h;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class c {
    public final ConcurrentLinkedQueue a;
    private final ScheduledExecutorService b;
    private final String c;
    private final long d;
    @Nullable
    private ScheduledFuture e;
    private long f;
    private static final a g = null;
    public static final long h = -1L;
    private static final int i = -1;
    private static final int j = -1;
    private static final int k = 13;
    private static final int l = 14;
    private static final int m = 15;
    private static final int n = 16;
    private static final long o;

    static {
        c.g = a.e();
        c.o = TimeUnit.SECONDS.toMicros(1L);
    }

    @SuppressLint({"ThreadPoolCreation"})
    c() {
        this.e = null;
        this.f = -1L;
        this.a = new ConcurrentLinkedQueue();
        this.b = Executors.newSingleThreadScheduledExecutor();
        this.c = "/proc/2774/stat";
        this.d = this.e();
    }

    @VisibleForTesting
    c(ScheduledExecutorService scheduledExecutorService0, String s, long v) {
        this.e = null;
        this.f = -1L;
        this.a = new ConcurrentLinkedQueue();
        this.b = scheduledExecutorService0;
        this.c = s;
        this.d = v;
    }

    public void c(Timer timer0) {
        this.i(timer0);
    }

    private long d(long v) {
        return Math.round(((double)v) / ((double)this.d) * ((double)c.o));
    }

    private long e() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    public static boolean f(long v) {
        return v <= 0L;
    }

    // 检测为 Lambda 实现
    private void g(Timer timer0) [...]

    // 检测为 Lambda 实现
    private void h(Timer timer0) [...]

    private void i(Timer timer0) {
        synchronized(this) {
            try {
                b b0 = () -> {
                    h h0 = this.m(timer0);
                    if(h0 != null) {
                        this.a.add(h0);
                    }
                };
                this.b.schedule(b0, 0L, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                c.g.l("Unable to collect Cpu Metric: " + rejectedExecutionException0.getMessage());
            }
        }
    }

    private void j(long v, Timer timer0) {
        synchronized(this) {
            this.f = v;
            try {
                com.google.firebase.perf.session.gauges.a a0 = () -> {
                    h h0 = this.m(timer0);
                    if(h0 != null) {
                        this.a.add(h0);
                    }
                };
                this.e = this.b.scheduleAtFixedRate(a0, 0L, v, TimeUnit.MILLISECONDS);
            }
            catch(RejectedExecutionException rejectedExecutionException0) {
                c.g.l("Unable to start collecting Cpu Metrics: " + rejectedExecutionException0.getMessage());
            }
        }
    }

    public void k(long v, Timer timer0) {
        if(this.d == -1L || this.d == 0L || c.f(v)) {
            return;
        }
        if(this.e != null) {
            if(this.f != v) {
                this.l();
                this.j(v, timer0);
            }
            return;
        }
        this.j(v, timer0);
    }

    public void l() {
        ScheduledFuture scheduledFuture0 = this.e;
        if(scheduledFuture0 == null) {
            return;
        }
        scheduledFuture0.cancel(false);
        this.e = null;
        this.f = -1L;
    }

    @Nullable
    private h m(Timer timer0) {
        if(timer0 == null) {
            return null;
        }
        try(BufferedReader bufferedReader0 = new BufferedReader(new FileReader(this.c))) {
            long v = timer0.c();
            String[] arr_s = bufferedReader0.readLine().split(" ");
            long v1 = Long.parseLong(arr_s[13]);
            long v2 = Long.parseLong(arr_s[15]);
            long v3 = Long.parseLong(arr_s[14]);
            long v4 = Long.parseLong(arr_s[16]);
            return (h)h.M6().xb(v).yb(this.d(v3 + v4)).zb(this.d(v1 + v2)).build();
        }
        catch(IOException iOException0) {
            c.g.l("Unable to read \'proc/[pid]/stat\' file: " + iOException0.getMessage());
            return null;
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException | NullPointerException arrayIndexOutOfBoundsException0) {
            c.g.l("Unexpected \'/proc/[pid]/stat\' file format encountered: " + arrayIndexOutOfBoundsException0.getMessage());
            return null;
        }
    }
}

