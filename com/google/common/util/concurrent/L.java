package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import j..util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;

@c
@d
@N
public abstract class l implements L0 {
    interface com.google.common.util.concurrent.l.c {
        void cancel(boolean arg1);

        boolean isCancelled();
    }

    public static abstract class com.google.common.util.concurrent.l.d extends f {
        final class a implements Callable {
            private final Runnable a;
            private final ScheduledExecutorService b;
            private final p c;
            private final ReentrantLock d;
            @P1.a("lock")
            @o3.a
            private com.google.common.util.concurrent.l.d.c e;
            final com.google.common.util.concurrent.l.d f;

            a(p p0, ScheduledExecutorService scheduledExecutorService0, Runnable runnable0) {
                this.d = new ReentrantLock();
                this.a = runnable0;
                this.b = scheduledExecutorService0;
                this.c = p0;
            }

            @o3.a
            public Void a() throws Exception {
                this.a.run();
                this.c();
                return null;
            }

            @P1.a("lock")
            private com.google.common.util.concurrent.l.c b(b l$d$b0) {
                com.google.common.util.concurrent.l.d.c l$d$c0 = this.e;
                if(l$d$c0 == null) {
                    ScheduledFuture scheduledFuture0 = this.d(l$d$b0);
                    com.google.common.util.concurrent.l.d.c l$d$c1 = new com.google.common.util.concurrent.l.d.c(this.d, scheduledFuture0);
                    this.e = l$d$c1;
                    return l$d$c1;
                }
                if(!l$d$c0.b.isCancelled()) {
                    this.e.b = this.d(l$d$b0);
                }
                return this.e;
            }

            @O1.a
            public com.google.common.util.concurrent.l.c c() {
                com.google.common.util.concurrent.l.c l$c0;
                b l$d$b0;
                try {
                    l$d$b0 = com.google.common.util.concurrent.l.d.this.d();
                }
                catch(Throwable throwable0) {
                    H0.b(throwable0);
                    this.c.u(throwable0);
                    return new e(h0.m());
                }
                this.d.lock();
                try {
                    l$c0 = this.b(l$d$b0);
                }
                catch(Throwable unused_ex) {
                    try {
                        l$c0 = new e(h0.m());
                    }
                    finally {
                        this.d.unlock();
                    }
                    goto label_18;
                }
                this.d.unlock();
                Throwable throwable1 = null;
            label_18:
                if(throwable1 != null) {
                    this.c.u(throwable1);
                }
                return l$c0;
            }

            @Override
            @o3.a
            public Object call() throws Exception {
                return this.a();
            }

            private ScheduledFuture d(b l$d$b0) {
                long v = l$d$b0.a;
                TimeUnit timeUnit0 = l$d$b0.b;
                return this.b.schedule(this, v, timeUnit0);
            }
        }

        public static final class b {
            private final long a;
            private final TimeUnit b;

            public b(long v, TimeUnit timeUnit0) {
                this.a = v;
                this.b = (TimeUnit)H.E(timeUnit0);
            }
        }

        static final class com.google.common.util.concurrent.l.d.c implements com.google.common.util.concurrent.l.c {
            private final ReentrantLock a;
            @P1.a("lock")
            private Future b;

            com.google.common.util.concurrent.l.d.c(ReentrantLock reentrantLock0, Future future0) {
                this.a = reentrantLock0;
                this.b = future0;
            }

            @Override  // com.google.common.util.concurrent.l$c
            public void cancel(boolean z) {
                this.a.lock();
                try {
                    this.b.cancel(z);
                }
                finally {
                    this.a.unlock();
                }
            }

            @Override  // com.google.common.util.concurrent.l$c
            public boolean isCancelled() {
                this.a.lock();
                try {
                    return this.b.isCancelled();
                }
                finally {
                    this.a.unlock();
                }
            }
        }

        public com.google.common.util.concurrent.l.d() {
            super(null);
        }

        @Override  // com.google.common.util.concurrent.l$f
        final com.google.common.util.concurrent.l.c c(p p0, ScheduledExecutorService scheduledExecutorService0, Runnable runnable0) {
            return new a(this, p0, scheduledExecutorService0, runnable0).c();
        }

        protected abstract b d() throws Exception;
    }

    static final class e implements com.google.common.util.concurrent.l.c {
        private final Future a;

        e(Future future0) {
            this.a = future0;
        }

        @Override  // com.google.common.util.concurrent.l$c
        public void cancel(boolean z) {
            this.a.cancel(z);
        }

        @Override  // com.google.common.util.concurrent.l$c
        public boolean isCancelled() {
            return this.a.isCancelled();
        }
    }

    public static abstract class f {
        private f() {
        }

        f(com.google.common.util.concurrent.l.a l$a0) {
        }

        public static f a(long v, long v1, TimeUnit timeUnit0) {
            class com.google.common.util.concurrent.l.f.a extends f {
                final long a;
                final long b;
                final TimeUnit c;

                com.google.common.util.concurrent.l.f.a(long v, long v1, TimeUnit timeUnit0) {
                    this.b = v1;
                    this.c = timeUnit0;
                    super(null);
                }

                @Override  // com.google.common.util.concurrent.l$f
                public com.google.common.util.concurrent.l.c c(p p0, ScheduledExecutorService scheduledExecutorService0, Runnable runnable0) {
                    return new e(scheduledExecutorService0.scheduleWithFixedDelay(runnable0, this.a, this.b, this.c));
                }
            }

            H.E(timeUnit0);
            H.p(v1 > 0L, "delay must be > 0, found %s", v1);
            return new com.google.common.util.concurrent.l.f.a(v, v1, timeUnit0);
        }

        public static f b(long v, long v1, TimeUnit timeUnit0) {
            class com.google.common.util.concurrent.l.f.b extends f {
                final long a;
                final long b;
                final TimeUnit c;

                com.google.common.util.concurrent.l.f.b(long v, long v1, TimeUnit timeUnit0) {
                    this.b = v1;
                    this.c = timeUnit0;
                    super(null);
                }

                @Override  // com.google.common.util.concurrent.l$f
                public com.google.common.util.concurrent.l.c c(p p0, ScheduledExecutorService scheduledExecutorService0, Runnable runnable0) {
                    return new e(scheduledExecutorService0.scheduleAtFixedRate(runnable0, this.a, this.b, this.c));
                }
            }

            H.E(timeUnit0);
            H.p(v1 > 0L, "period must be > 0, found %s", v1);
            return new com.google.common.util.concurrent.l.f.b(v, v1, timeUnit0);
        }

        abstract com.google.common.util.concurrent.l.c c(p arg1, ScheduledExecutorService arg2, Runnable arg3);
    }

    final class g extends p {
        class com.google.common.util.concurrent.l.g.a implements Runnable {
            final g a;

            @Override
            public void run() {
                g.this.r.lock();
                try {
                    com.google.common.util.concurrent.l.c l$c0 = g.this.p;
                    Objects.requireNonNull(l$c0);
                    if(!l$c0.isCancelled()) {
                        l.this.m();
                    }
                }
                catch(Throwable throwable0) {
                    H0.b(throwable0);
                    g.this.u(throwable0);
                    com.google.common.util.concurrent.l.c l$c1 = g.this.p;
                    Objects.requireNonNull(l$c1);
                    l$c1.cancel(false);
                }
                finally {
                    g.this.r.unlock();
                }
            }
        }

        @o3.a
        private volatile com.google.common.util.concurrent.l.c p;
        @o3.a
        private volatile ScheduledExecutorService q;
        private final ReentrantLock r;
        private final Runnable s;
        final l t;

        private g() {
            this.r = new ReentrantLock();
            this.s = new com.google.common.util.concurrent.l.g.a(this);
        }

        g(com.google.common.util.concurrent.l.a l$a0) {
        }

        // 去混淆评级： 低(40)
        // 检测为 Lambda 实现
        private String E() [...]

        // 检测为 Lambda 实现
        private void F() [...]

        // 检测为 Lambda 实现
        private void G() [...]

        @Override  // com.google.common.util.concurrent.p
        protected final void n() {
            this.q = C0.s(l.this.l(), () -> // 去混淆评级： 低(40)
            "l " + this.h());
            this.q.execute(() -> {
                this.r.lock();
                try {
                    Objects.requireNonNull(this.q);
                    this.p = l.this.n().c(l.this.a, this.q, this.s);
                    this.v();
                }
                catch(Throwable throwable0) {
                    H0.b(throwable0);
                    this.u(throwable0);
                    if(this.p != null) {
                        this.p.cancel(false);
                    }
                }
                finally {
                    this.r.unlock();
                }
            });
        }

        @Override  // com.google.common.util.concurrent.p
        protected final void o() {
            Objects.requireNonNull(this.p);
            Objects.requireNonNull(this.q);
            this.p.cancel(false);
            this.q.execute(() -> try {
                this.r.lock();
                try {
                    if(this.h() != com.google.common.util.concurrent.L0.b.d) {
                        return;
                    }
                }
                finally {
                    this.r.unlock();
                }
                this.w();
            }
            catch(Throwable throwable0) {
                H0.b(throwable0);
                this.u(throwable0);
            });
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.util.concurrent.p
        public String toString() {
            return "l [NEW]";
        }
    }

    private final p a;
    private static final s0 b;

    static {
        l.b = new s0(l.class);
    }

    protected l() {
        this.a = new g(this, null);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void a(com.google.common.util.concurrent.L0.a l0$a0, Executor executor0) {
        this.a.a(l0$a0, executor0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void b(long v, TimeUnit timeUnit0) throws TimeoutException {
        this.a.b(v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void c(long v, TimeUnit timeUnit0) throws TimeoutException {
        this.a.c(v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void d() {
        this.a.d();
    }

    @Override  // com.google.common.util.concurrent.L0
    public final Throwable e() {
        return this.a.e();
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void f() {
        this.a.f();
    }

    @Override  // com.google.common.util.concurrent.L0
    @O1.a
    public final L0 g() {
        this.a.g();
        return this;
    }

    @Override  // com.google.common.util.concurrent.L0
    public final com.google.common.util.concurrent.L0.b h() {
        return this.a.h();
    }

    @Override  // com.google.common.util.concurrent.L0
    @O1.a
    public final L0 i() {
        this.a.i();
        return this;
    }

    @Override  // com.google.common.util.concurrent.L0
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    static s0 j() {
        return l.b;
    }

    protected ScheduledExecutorService l() {
        class com.google.common.util.concurrent.l.a extends com.google.common.util.concurrent.L0.a {
            final ScheduledExecutorService a;

            com.google.common.util.concurrent.l.a(ScheduledExecutorService scheduledExecutorService0) {
                this.a = scheduledExecutorService0;
                super();
            }

            @Override  // com.google.common.util.concurrent.L0$a
            public void a(com.google.common.util.concurrent.L0.b l0$b0, Throwable throwable0) {
                this.a.shutdown();
            }

            @Override  // com.google.common.util.concurrent.L0$a
            public void e(com.google.common.util.concurrent.L0.b l0$b0) {
                this.a.shutdown();
            }
        }


        class com.google.common.util.concurrent.l.b implements ThreadFactory {
            final l a;

            // 去混淆评级： 低(20)
            @Override
            public Thread newThread(Runnable runnable0) {
                return C0.n("l", runnable0);
            }
        }

        ScheduledExecutorService scheduledExecutorService0 = Executors.newSingleThreadScheduledExecutor(new com.google.common.util.concurrent.l.b(this));
        this.a(new com.google.common.util.concurrent.l.a(this, scheduledExecutorService0), C0.c());
        return scheduledExecutorService0;
    }

    protected abstract void m() throws Exception;

    protected abstract f n();

    protected String o() [...] // 潜在的解密器

    protected void p() throws Exception {
    }

    protected void q() throws Exception {
    }

    // 去混淆评级： 低(40)
    @Override
    public String toString() [...] // 潜在的解密器
}

