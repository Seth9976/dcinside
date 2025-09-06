package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class n implements g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    static final class b {
        @m
        private e info;
        private final long uptimeMillis;

        public b(long v, @m e e0) {
            this.uptimeMillis = v;
            this.info = e0;
        }

        @m
        public final e getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(@m e e0) {
            this.info = e0;
        }
    }

    static final class c implements Runnable {
        @l
        private WeakReference runner;

        public c(@l WeakReference weakReference0) {
            L.p(weakReference0, "runner");
            super();
            this.runner = weakReference0;
        }

        @l
        public final WeakReference getRunner() {
            return this.runner;
        }

        @Override
        public void run() {
            n n0 = (n)this.runner.get();
            if(n0 != null) {
                n0.executePendingJobs();
            }
        }

        public final void setRunner(@l WeakReference weakReference0) {
            L.p(weakReference0, "<set-?>");
            this.runner = weakReference0;
        }
    }

    @l
    public static final a Companion;
    private static final String TAG;
    @l
    private final d creator;
    @l
    private final Executor executor;
    @l
    private static final Handler handler;
    private long nextCheck;
    @l
    private final List pendingJobs;
    @l
    private final Runnable pendingRunnable;
    @m
    private final k threadPriorityHelper;

    static {
        n.Companion = new a(null);
        n.handler = new Handler(Looper.getMainLooper());
        n.TAG = "n";
    }

    public n(@l d d0, @l Executor executor0, @m k k0) {
        L.p(d0, "creator");
        L.p(executor0, "executor");
        super();
        this.creator = d0;
        this.executor = executor0;
        this.threadPriorityHelper = k0;
        this.nextCheck = 0x7FFFFFFFFFFFFFFFL;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new c(new WeakReference(this));
    }

    @Override  // com.vungle.ads.internal.task.g
    public void cancelPendingJob(@l String s) {
        synchronized(this) {
            L.p(s, "tag");
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.pendingJobs) {
                b n$b0 = (b)object0;
                e e0 = n$b0.getInfo();
                if(L.g((e0 == null ? null : e0.getJobTag()), s)) {
                    arrayList0.add(n$b0);
                }
            }
            this.pendingJobs.removeAll(arrayList0);
        }
    }

    @Override  // com.vungle.ads.internal.task.g
    public void execute(@l e e0) {
        synchronized(this) {
            L.p(e0, "jobInfo");
            e e1 = e0.copy();
            if(e1 != null) {
                String s = e1.getJobTag();
                long v1 = e1.getDelay();
                e1.setDelay(0L);
                if(e1.getUpdateCurrent()) {
                    for(Object object0: this.pendingJobs) {
                        b n$b0 = (b)object0;
                        e e2 = n$b0.getInfo();
                        if(L.g((e2 == null ? null : e2.getJobTag()), s)) {
                            L.o(n.TAG, "TAG");
                            p.Companion.d(n.TAG, "replacing pending job with new " + s);
                            this.pendingJobs.remove(n$b0);
                        }
                    }
                }
                b n$b1 = new b(SystemClock.uptimeMillis() + v1, e1);
                this.pendingJobs.add(n$b1);
                this.executePendingJobs();
            }
        }
    }

    private final void executePendingJobs() {
        synchronized(this) {
            long v1 = SystemClock.uptimeMillis();
            long v2 = 0x7FFFFFFFFFFFFFFFL;
            for(Object object0: this.pendingJobs) {
                b n$b0 = (b)object0;
                if(v1 >= n$b0.getUptimeMillis()) {
                    this.pendingJobs.remove(n$b0);
                    e e0 = n$b0.getInfo();
                    if(e0 == null) {
                        continue;
                    }
                    f f0 = new f(e0, this.creator, this, this.threadPriorityHelper);
                    this.executor.execute(f0);
                }
                else {
                    v2 = Math.min(v2, n$b0.getUptimeMillis());
                }
            }
            if(v2 != 0x7FFFFFFFFFFFFFFFL && v2 != this.nextCheck) {
                n.handler.removeCallbacks(this.pendingRunnable);
                n.handler.postAtTime(this.pendingRunnable, n.TAG, v2);
            }
            this.nextCheck = v2;
        }
    }

    @VisibleForTesting
    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}

