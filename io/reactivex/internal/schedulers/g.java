package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.d;
import d3.f;
import io.reactivex.J;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends J {
    static final class a implements Runnable {
        private final long a;
        private final ConcurrentLinkedQueue b;
        final b c;
        private final ScheduledExecutorService d;
        private final Future e;
        private final ThreadFactory f;

        a(long v, TimeUnit timeUnit0, ThreadFactory threadFactory0) {
            ScheduledFuture scheduledFuture0;
            ScheduledExecutorService scheduledExecutorService0;
            long v1 = timeUnit0 == null ? 0L : timeUnit0.toNanos(v);
            this.a = v1;
            this.b = new ConcurrentLinkedQueue();
            this.c = new b();
            this.f = threadFactory0;
            if(timeUnit0 == null) {
                scheduledExecutorService0 = null;
                scheduledFuture0 = null;
            }
            else {
                scheduledExecutorService0 = Executors.newScheduledThreadPool(1, g.g);
                scheduledFuture0 = scheduledExecutorService0.scheduleWithFixedDelay(this, v1, v1, TimeUnit.NANOSECONDS);
            }
            this.d = scheduledExecutorService0;
            this.e = scheduledFuture0;
        }

        void a() {
            if(!this.b.isEmpty()) {
                for(Object object0: this.b) {
                    c g$c0 = (c)object0;
                    if(g$c0.j() > 11278197047400L) {
                        break;
                    }
                    if(this.b.remove(g$c0)) {
                        this.c.b(g$c0);
                    }
                }
            }
        }

        c b() {
            if(this.c.a()) {
                return g.l;
            }
            while(!this.b.isEmpty()) {
                c g$c0 = (c)this.b.poll();
                if(g$c0 != null) {
                    return g$c0;
                }
                if(false) {
                    break;
                }
            }
            c g$c1 = new c(this.f);
            this.c.d(g$c1);
            return g$c1;
        }

        long c() [...] // 潜在的解密器

        void d(c g$c0) {
            g$c0.k(this.a + 11278256467400L);
            this.b.offer(g$c0);
        }

        void e() {
            this.c.dispose();
            Future future0 = this.e;
            if(future0 != null) {
                future0.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService0 = this.d;
            if(scheduledExecutorService0 != null) {
                scheduledExecutorService0.shutdownNow();
            }
        }

        @Override
        public void run() {
            this.a();
        }
    }

    static final class io.reactivex.internal.schedulers.g.b extends io.reactivex.J.c {
        private final b a;
        private final a b;
        private final c c;
        final AtomicBoolean d;

        io.reactivex.internal.schedulers.g.b(a g$a0) {
            this.d = new AtomicBoolean();
            this.b = g$a0;
            this.a = new b();
            this.c = g$a0.b();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d.get();
        }

        @Override  // io.reactivex.J$c
        @f
        public io.reactivex.disposables.c d(@f Runnable runnable0, long v, @f TimeUnit timeUnit0) {
            return this.a.a() ? e.a : this.c.f(runnable0, v, timeUnit0, this.a);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            if(this.d.compareAndSet(false, true)) {
                this.a.dispose();
                this.b.d(this.c);
            }
        }
    }

    static final class c extends i {
        private long c;

        c(ThreadFactory threadFactory0) {
            super(threadFactory0);
            this.c = 0L;
        }

        public long j() {
            return this.c;
        }

        public void k(long v) {
            this.c = v;
        }
    }

    final ThreadFactory b;
    final AtomicReference c;
    private static final String d = "RxCachedThreadScheduler";
    static final k e = null;
    private static final String f = "RxCachedWorkerPoolEvictor";
    static final k g = null;
    private static final String h = "rx2.io-keep-alive-time";
    public static final long i = 60L;
    private static final long j = 0L;
    private static final TimeUnit k = null;
    static final c l = null;
    private static final String m = "rx2.io-priority";
    static final a n;

    static {
        g.k = TimeUnit.SECONDS;
        g.j = 60L;
        c g$c0 = new c(new k("RxCachedThreadSchedulerShutdown"));
        g.l = g$c0;
        g$c0.dispose();
        k k0 = new k("RxCachedThreadScheduler", 5);
        g.e = k0;
        g.g = new k("RxCachedWorkerPoolEvictor", 5);
        a g$a0 = new a(0L, null, k0);
        g.n = g$a0;
        g$a0.e();
    }

    public g() {
        this(g.e);
    }

    public g(ThreadFactory threadFactory0) {
        this.b = threadFactory0;
        this.c = new AtomicReference(g.n);
        this.j();
    }

    @Override  // io.reactivex.J
    @f
    public io.reactivex.J.c d() {
        return new io.reactivex.internal.schedulers.g.b(((a)this.c.get()));
    }

    @Override  // io.reactivex.J
    public void i() {
        a g$a0;
        do {
            g$a0 = (a)this.c.get();
            a g$a1 = g.n;
            if(g$a0 == g$a1) {
                return;
            }
        }
        while(!d.a(this.c, g$a0, g$a1));
        g$a0.e();
    }

    @Override  // io.reactivex.J
    public void j() {
        a g$a0 = new a(g.j, g.k, this.b);
        if(!d.a(this.c, g.n, g$a0)) {
            g$a0.e();
        }
    }

    public int l() {
        return ((a)this.c.get()).c.h();
    }
}

