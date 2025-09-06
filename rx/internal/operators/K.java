package rx.internal.operators;

import F4.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import rx.b.J;
import rx.d;
import rx.g;
import rx.internal.util.unsafe.z;
import rx.n;
import rx.o;
import rx.plugins.c;

public final class k implements J {
    static final class a extends n {
        final class rx.internal.operators.k.a.a extends AtomicInteger implements d {
            final a a;
            private static final long b = 0x646290C7E039AC74L;

            @Override  // rx.d
            public void a(o o0) {
                a.this.g.set(o0);
            }

            @Override  // rx.d
            public void d() {
                a.this.Q();
            }

            @Override  // rx.d
            public void onError(Throwable throwable0) {
                a.this.R(throwable0);
            }
        }

        final d f;
        final b g;
        final z h;
        final rx.internal.operators.k.a.a i;
        final AtomicBoolean j;
        volatile boolean k;
        volatile boolean l;

        public a(d d0, int v) {
            this.f = d0;
            this.h = new z(v);
            b b0 = new b();
            this.g = b0;
            this.i = new rx.internal.operators.k.a.a(this);
            this.j = new AtomicBoolean();
            this.q(b0);
            this.v(((long)v));
        }

        void Q() {
            this.l = false;
            this.x();
        }

        void R(Throwable throwable0) {
            this.l();
            this.onError(throwable0);
        }

        public void T(rx.b b0) {
            if(!this.h.offer(b0)) {
                this.onError(new rx.exceptions.d());
                return;
            }
            this.x();
        }

        @Override  // rx.h
        public void d() {
            if(this.k) {
                return;
            }
            this.k = true;
            this.x();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            if(this.j.compareAndSet(false, true)) {
                this.f.onError(throwable0);
                return;
            }
            c.I(throwable0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.T(((rx.b)object0));
        }

        void x() {
            rx.internal.operators.k.a.a k$a$a0 = this.i;
            if(k$a$a0.getAndIncrement() != 0) {
                return;
            }
            do {
                if(this.j()) {
                    return;
                }
                if(!this.l) {
                    boolean z = this.k;
                    rx.b b0 = (rx.b)this.h.poll();
                    if(z && b0 == null) {
                        this.f.d();
                        return;
                    }
                    if(b0 != null) {
                        this.l = true;
                        b0.q0(k$a$a0);
                        this.v(1L);
                    }
                }
            }
            while(k$a$a0.decrementAndGet() != 0);
        }
    }

    final g a;
    final int b;

    public k(g g0, int v) {
        this.a = g0;
        this.b = v;
    }

    public void a(d d0) {
        a k$a0 = new a(d0, this.b);
        d0.a(k$a0);
        this.a.N6(k$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((d)object0));
    }
}

