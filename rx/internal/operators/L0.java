package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.g.a;
import rx.g;
import rx.i;
import rx.j;
import rx.n;
import rx.o;
import rx.plugins.c;

public final class l0 implements a {
    static final class rx.internal.operators.l0.a extends n {
        final n f;
        final rx.internal.producers.a g;

        rx.internal.operators.l0.a(n n0, rx.internal.producers.a a0) {
            this.f = n0;
            this.g = a0;
        }

        @Override  // rx.n
        public void X(i i0) {
            this.g.c(i0);
        }

        @Override  // rx.h
        public void d() {
            this.f.d();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.f.onError(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.f.onNext(object0);
        }
    }

    static final class b extends n {
        final class rx.internal.operators.l0.b.a implements rx.functions.a {
            final long a;
            final b b;

            rx.internal.operators.l0.b.a(long v) {
                this.a = v;
            }

            @Override  // rx.functions.a
            public void call() {
                b.this.x(this.a);
            }
        }

        final n f;
        final long g;
        final TimeUnit h;
        final rx.j.a i;
        final g j;
        final rx.internal.producers.a k;
        final AtomicLong l;
        final F4.b m;
        final F4.b n;
        long o;

        b(n n0, long v, TimeUnit timeUnit0, rx.j.a j$a0, g g0) {
            this.f = n0;
            this.g = v;
            this.h = timeUnit0;
            this.i = j$a0;
            this.j = g0;
            this.k = new rx.internal.producers.a();
            this.l = new AtomicLong();
            F4.b b0 = new F4.b();
            this.m = b0;
            this.n = new F4.b(this);
            this.q(j$a0);
            this.q(b0);
        }

        void Q(long v) {
            rx.internal.operators.l0.b.a l0$b$a0 = () -> {
                if(!b.this.l.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
                    return;
                }
                b.this.l();
                if(b.this.j == null) {
                    TimeoutException timeoutException0 = new TimeoutException();
                    b.this.f.onError(timeoutException0);
                    return;
                }
                long v1 = b.this.o;
                if(v1 != 0L) {
                    b.this.k.b(v1);
                }
                rx.internal.operators.l0.a l0$a0 = new rx.internal.operators.l0.a(b.this.f, b.this.k);
                if(b.this.n.b(l0$a0)) {
                    b.this.j.v5(l0$a0);
                }
            };
            o o0 = this.i.d(l0$b$a0, this.g, this.h);
            this.m.b(o0);
        }

        @Override  // rx.n
        public void X(i i0) {
            this.k.c(i0);
        }

        @Override  // rx.h
        public void d() {
            if(this.l.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
                this.m.l();
                this.f.d();
                this.i.l();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.l.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
                this.m.l();
                this.f.onError(throwable0);
                this.i.l();
                return;
            }
            c.I(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            long v = this.l.get();
            if(v != 0x7FFFFFFFFFFFFFFFL && this.l.compareAndSet(v, v + 1L)) {
                o o0 = (o)this.m.get();
                if(o0 != null) {
                    o0.l();
                }
                ++this.o;
                this.f.onNext(object0);
                this.Q(v + 1L);
            }
        }

        // 检测为 Lambda 实现
        void x(long v) [...]
    }

    final g a;
    final long b;
    final TimeUnit c;
    final j d;
    final g e;

    public l0(g g0, long v, TimeUnit timeUnit0, j j0, g g1) {
        this.a = g0;
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
        this.e = g1;
    }

    public void a(n n0) {
        rx.j.a j$a0 = this.d.a();
        b l0$b0 = new b(n0, this.b, this.c, j$a0, this.e);
        n0.q(l0$b0.n);
        n0.X(l0$b0.k);
        l0$b0.Q(0L);
        this.a.v5(l0$b0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

