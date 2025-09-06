package rx.internal.schedulers;

import androidx.compose.animation.core.d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.n;
import rx.internal.util.q;
import rx.j;
import rx.o;
import rx.subscriptions.f;

public final class b extends j implements k {
    static final class a extends rx.j.a {
        private final q a;
        private final rx.subscriptions.b b;
        private final q c;
        private final c d;

        a(c b$c0) {
            q q0 = new q();
            this.a = q0;
            rx.subscriptions.b b0 = new rx.subscriptions.b();
            this.b = b0;
            this.c = new q(new o[]{q0, b0});
            this.d = b$c0;
        }

        @Override  // rx.j$a
        public o c(rx.functions.a a0) {
            class rx.internal.schedulers.b.a.a implements rx.functions.a {
                final rx.functions.a a;
                final a b;

                rx.internal.schedulers.b.a.a(rx.functions.a a0) {
                    this.a = a0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    if(a.this.j()) {
                        return;
                    }
                    this.a.call();
                }
            }

            if(this.j()) {
                return f.e();
            }
            rx.internal.schedulers.b.a.a b$a$a0 = new rx.internal.schedulers.b.a.a(this, a0);
            return this.d.Q(b$a$a0, 0L, null, this.a);
        }

        @Override  // rx.j$a
        public o d(rx.functions.a a0, long v, TimeUnit timeUnit0) {
            class rx.internal.schedulers.b.a.b implements rx.functions.a {
                final rx.functions.a a;
                final a b;

                rx.internal.schedulers.b.a.b(rx.functions.a a0) {
                    this.a = a0;
                    super();
                }

                @Override  // rx.functions.a
                public void call() {
                    if(a.this.j()) {
                        return;
                    }
                    this.a.call();
                }
            }

            if(this.j()) {
                return f.e();
            }
            rx.internal.schedulers.b.a.b b$a$b0 = new rx.internal.schedulers.b.a.b(this, a0);
            return this.d.R(b$a$b0, v, timeUnit0, this.b);
        }

        @Override  // rx.o
        public boolean j() {
            return this.c.j();
        }

        @Override  // rx.o
        public void l() {
            this.c.l();
        }
    }

    static final class rx.internal.schedulers.b.b {
        final int a;
        final c[] b;
        long c;

        rx.internal.schedulers.b.b(ThreadFactory threadFactory0, int v) {
            this.a = v;
            this.b = new c[v];
            for(int v1 = 0; v1 < v; ++v1) {
                this.b[v1] = new c(threadFactory0);
            }
        }

        public c a() {
            int v = this.a;
            if(v == 0) {
                return b.e;
            }
            long v1 = this.c;
            this.c = v1 + 1L;
            return this.b[((int)(v1 % ((long)v)))];
        }

        public void b() {
            c[] arr_b$c = this.b;
            for(int v = 0; v < arr_b$c.length; ++v) {
                arr_b$c[v].l();
            }
        }
    }

    static final class c extends h {
        c(ThreadFactory threadFactory0) {
            super(threadFactory0);
        }
    }

    final ThreadFactory a;
    final AtomicReference b;
    static final String c = "rx.scheduler.max-computation-threads";
    static final int d;
    static final c e;
    static final rx.internal.schedulers.b.b f;

    static {
        b.d = Runtime.getRuntime().availableProcessors();
        c b$c0 = new c(n.c);
        b.e = b$c0;
        b$c0.l();
        b.f = new rx.internal.schedulers.b.b(null, 0);
    }

    public b(ThreadFactory threadFactory0) {
        this.a = threadFactory0;
        this.b = new AtomicReference(b.f);
        this.start();
    }

    @Override  // rx.j
    public rx.j.a a() {
        return new a(((rx.internal.schedulers.b.b)this.b.get()).a());
    }

    public o d(rx.functions.a a0) {
        return ((rx.internal.schedulers.b.b)this.b.get()).a().x(a0, -1L, TimeUnit.NANOSECONDS);
    }

    @Override  // rx.internal.schedulers.k
    public void shutdown() {
        rx.internal.schedulers.b.b b$b0;
        do {
            b$b0 = (rx.internal.schedulers.b.b)this.b.get();
            rx.internal.schedulers.b.b b$b1 = b.f;
            if(b$b0 == b$b1) {
                return;
            }
        }
        while(!d.a(this.b, b$b0, b$b1));
        b$b0.b();
    }

    @Override  // rx.internal.schedulers.k
    public void start() {
        rx.internal.schedulers.b.b b$b0 = new rx.internal.schedulers.b.b(this.a, b.d);
        if(!d.a(this.b, b.f, b$b0)) {
            b$b0.b();
        }
    }
}

