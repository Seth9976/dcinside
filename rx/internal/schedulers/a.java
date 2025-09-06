package rx.internal.schedulers;

import androidx.compose.animation.core.d;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.n;
import rx.j;
import rx.o;
import rx.subscriptions.b;
import rx.subscriptions.f;

public final class a extends j implements k {
    static final class rx.internal.schedulers.a.a {
        private final ThreadFactory a;
        private final long b;
        private final ConcurrentLinkedQueue c;
        private final b d;
        private final ScheduledExecutorService e;
        private final Future f;

        rx.internal.schedulers.a.a(ThreadFactory threadFactory0, long v, TimeUnit timeUnit0) {
            class rx.internal.schedulers.a.a.a implements ThreadFactory {
                final ThreadFactory a;
                final rx.internal.schedulers.a.a b;

                rx.internal.schedulers.a.a.a(ThreadFactory threadFactory0) {
                    this.a = threadFactory0;
                    super();
                }

                @Override
                public Thread newThread(Runnable runnable0) {
                    Thread thread0 = this.a.newThread(runnable0);
                    thread0.setName(thread0.getName() + " (Evictor)");
                    return thread0;
                }
            }


            class rx.internal.schedulers.a.a.b implements Runnable {
                final rx.internal.schedulers.a.a a;

                @Override
                public void run() {
                    rx.internal.schedulers.a.a.this.a();
                }
            }

            ScheduledFuture scheduledFuture0;
            ScheduledExecutorService scheduledExecutorService0;
            this.a = threadFactory0;
            long v1 = timeUnit0 == null ? 0L : timeUnit0.toNanos(v);
            this.b = v1;
            this.c = new ConcurrentLinkedQueue();
            this.d = new b();
            if(timeUnit0 == null) {
                scheduledExecutorService0 = null;
                scheduledFuture0 = null;
            }
            else {
                scheduledExecutorService0 = Executors.newScheduledThreadPool(1, new rx.internal.schedulers.a.a.a(this, threadFactory0));
                h.T(scheduledExecutorService0);
                scheduledFuture0 = scheduledExecutorService0.scheduleWithFixedDelay(() -> if(!rx.internal.schedulers.a.a.this.c.isEmpty()) {
                    for(Object object0: rx.internal.schedulers.a.a.this.c) {
                        c a$c0 = (c)object0;
                        if(a$c0.Y() > 0xBA64B4E9100L) {
                            break;
                        }
                        if(rx.internal.schedulers.a.a.this.c.remove(a$c0)) {
                            rx.internal.schedulers.a.a.this.d.e(a$c0);
                        }
                    }
                }, v1, v1, TimeUnit.NANOSECONDS);
            }
            this.e = scheduledExecutorService0;
            this.f = scheduledFuture0;
        }

        // 检测为 Lambda 实现
        void a() [...]

        c b() {
            if(this.d.j()) {
                return a.e;
            }
            while(!this.c.isEmpty()) {
                c a$c0 = (c)this.c.poll();
                if(a$c0 != null) {
                    return a$c0;
                }
                if(false) {
                    break;
                }
            }
            c a$c1 = new c(this.a);
            this.d.a(a$c1);
            return a$c1;
        }

        long c() [...] // 潜在的解密器

        void d(c a$c0) {
            a$c0.a0(this.b + 0xBA64D36D004L);
            this.c.offer(a$c0);
        }

        void e() {
            try {
                Future future0 = this.f;
                if(future0 != null) {
                    future0.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService0 = this.e;
                if(scheduledExecutorService0 != null) {
                    scheduledExecutorService0.shutdownNow();
                }
            }
            finally {
                this.d.l();
            }
        }
    }

    static final class rx.internal.schedulers.a.b extends rx.j.a implements rx.functions.a {
        private final b a;
        private final rx.internal.schedulers.a.a b;
        private final c c;
        final AtomicBoolean d;

        rx.internal.schedulers.a.b(rx.internal.schedulers.a.a a$a0) {
            this.a = new b();
            this.b = a$a0;
            this.d = new AtomicBoolean();
            this.c = a$a0.b();
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            return this.d(a0, 0L, null);
        }

        @Override  // rx.functions.a
        public void call() {
            this.b.d(this.c);
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            class rx.internal.schedulers.a.b.a implements rx.functions.a {
                final rx.functions.a a;
                final rx.internal.schedulers.a.b b;

                rx.internal.schedulers.a.b.a(rx.functions.a a0) {
                    this.a = a0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    if(rx.internal.schedulers.a.b.this.j()) {
                        return;
                    }
                    this.a.call();
                }
            }

            if(this.a.j()) {
                return f.e();
            }
            rx.internal.schedulers.a.b.a a$b$a0 = new rx.internal.schedulers.a.b.a(this, a0);
            o o0 = this.c.x(a$b$a0, v, timeUnit0);
            this.a.a(o0);
            ((rx.internal.schedulers.j)o0).d(this.a);
            return o0;
        }

        @Override  // rx.o
        public boolean j() {
            return this.a.j();
        }

        @Override  // rx.o
        public void l() {
            if(this.d.compareAndSet(false, true)) {
                this.c.c(this);
            }
            this.a.l();
        }
    }

    static final class c extends h {
        private long l;

        c(ThreadFactory threadFactory0) {
            super(threadFactory0);
            this.l = 0L;
        }

        public long Y() {
            return this.l;
        }

        public void a0(long v) {
            this.l = v;
        }
    }

    final ThreadFactory a;
    final AtomicReference b;
    private static final long c;
    private static final TimeUnit d;
    static final c e;
    static final rx.internal.schedulers.a.a f;

    static {
        a.d = TimeUnit.SECONDS;
        c a$c0 = new c(n.c);
        a.e = a$c0;
        a$c0.l();
        rx.internal.schedulers.a.a a$a0 = new rx.internal.schedulers.a.a(null, 0L, null);
        a.f = a$a0;
        a$a0.e();
        a.c = 60L;
    }

    public a(ThreadFactory threadFactory0) {
        this.a = threadFactory0;
        this.b = new AtomicReference(a.f);
        this.start();
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new rx.internal.schedulers.a.b(((rx.internal.schedulers.a.a)this.b.get()));
    }

    @Override  // rx.internal.schedulers.k
    public void shutdown() {
        rx.internal.schedulers.a.a a$a0;
        do {
            a$a0 = (rx.internal.schedulers.a.a)this.b.get();
            rx.internal.schedulers.a.a a$a1 = a.f;
            if(a$a0 == a$a1) {
                return;
            }
        }
        while(!d.a(this.b, a$a0, a$a1));
        a$a0.e();
    }

    @Override  // rx.internal.schedulers.k
    public void start() {
        rx.internal.schedulers.a.a a$a0 = new rx.internal.schedulers.a.a(this.a, a.c, a.d);
        if(!d.a(this.b, a.f, a$a0)) {
            a$a0.e();
        }
    }
}

