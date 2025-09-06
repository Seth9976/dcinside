package rx.internal.operators;

import F4.b;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.functions.p;
import rx.g.a;
import rx.g;
import rx.i;
import rx.n;
import rx.o;
import rx.plugins.c;

public final class k0 implements a {
    static final class rx.internal.operators.k0.a extends n {
        final class rx.internal.operators.k0.a.a extends n {
            final long f;
            boolean g;
            final rx.internal.operators.k0.a h;

            rx.internal.operators.k0.a.a(long v) {
                this.f = v;
            }

            @Override  // rx.h
            public void d() {
                if(!this.g) {
                    this.g = true;
                    rx.internal.operators.k0.a.this.x(this.f);
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                if(!this.g) {
                    this.g = true;
                    rx.internal.operators.k0.a.this.Q(this.f, throwable0);
                    return;
                }
                c.I(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(!this.g) {
                    this.g = true;
                    this.l();
                    rx.internal.operators.k0.a.this.x(this.f);
                }
            }
        }

        final n f;
        final p g;
        final g h;
        final rx.internal.producers.a i;
        final AtomicLong j;
        final b k;
        final b l;
        long m;

        rx.internal.operators.k0.a(n n0, p p0, g g0) {
            this.f = n0;
            this.g = p0;
            this.h = g0;
            this.i = new rx.internal.producers.a();
            this.j = new AtomicLong();
            b b0 = new b();
            this.k = b0;
            this.l = new b(this);
            this.q(b0);
        }

        void Q(long v, Throwable throwable0) {
            if(this.j.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
                this.l();
                this.f.onError(throwable0);
                return;
            }
            c.I(throwable0);
        }

        void R(g g0) {
            if(g0 != null) {
                rx.internal.operators.k0.a.a k0$a$a0 = new rx.internal.operators.k0.a.a(this, 0L);
                if(this.k.b(k0$a$a0)) {
                    g0.v5(k0$a$a0);
                }
            }
        }

        @Override  // rx.n
        public void X(i i0) {
            this.i.c(i0);
        }

        @Override  // rx.h
        public void d() {
            if(this.j.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
                this.k.l();
                this.f.d();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.j.getAndSet(0x7FFFFFFFFFFFFFFFL) != 0x7FFFFFFFFFFFFFFFL) {
                this.k.l();
                this.f.onError(throwable0);
                return;
            }
            c.I(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            g g0;
            long v = this.j.get();
            if(v != 0x7FFFFFFFFFFFFFFFL && this.j.compareAndSet(v, v + 1L)) {
                o o0 = (o)this.k.get();
                if(o0 != null) {
                    o0.l();
                }
                this.f.onNext(object0);
                ++this.m;
                try {
                    g0 = (g)this.g.b(object0);
                    if(g0 == null) {
                        throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                    }
                }
                catch(Throwable throwable0) {
                    rx.exceptions.c.e(throwable0);
                    this.l();
                    this.j.getAndSet(0x7FFFFFFFFFFFFFFFL);
                    this.f.onError(throwable0);
                    return;
                }
                rx.internal.operators.k0.a.a k0$a$a0 = new rx.internal.operators.k0.a.a(this, v + 1L);
                if(this.k.b(k0$a$a0)) {
                    g0.v5(k0$a$a0);
                }
            }
        }

        void x(long v) {
            if(!this.j.compareAndSet(v, 0x7FFFFFFFFFFFFFFFL)) {
                return;
            }
            this.l();
            if(this.h == null) {
                TimeoutException timeoutException0 = new TimeoutException();
                this.f.onError(timeoutException0);
                return;
            }
            long v1 = this.m;
            if(v1 != 0L) {
                this.i.b(v1);
            }
            rx.internal.operators.l0.a l0$a0 = new rx.internal.operators.l0.a(this.f, this.i);
            if(this.l.b(l0$a0)) {
                this.h.v5(l0$a0);
            }
        }
    }

    final g a;
    final g b;
    final p c;
    final g d;

    public k0(g g0, g g1, p p0, g g2) {
        this.a = g0;
        this.b = g1;
        this.c = p0;
        this.d = g2;
    }

    public void a(n n0) {
        rx.internal.operators.k0.a k0$a0 = new rx.internal.operators.k0.a(n0, this.c, this.d);
        n0.q(k0$a0.l);
        n0.X(k0$a0.i);
        k0$a0.R(this.b);
        this.a.v5(k0$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

