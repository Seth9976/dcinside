package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.util.l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class u1 extends a {
    static final class io.reactivex.internal.operators.observable.u1.a extends AtomicInteger implements I, c {
        final class io.reactivex.internal.operators.observable.u1.a.a extends AtomicReference implements I {
            final io.reactivex.internal.operators.observable.u1.a a;
            private static final long b = 0x875AC1397AD30441L;

            @Override  // io.reactivex.I
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.I
            public void onComplete() {
                io.reactivex.internal.operators.observable.u1.a.this.c();
            }

            @Override  // io.reactivex.I
            public void onError(Throwable throwable0) {
                io.reactivex.internal.operators.observable.u1.a.this.d(throwable0);
            }

            @Override  // io.reactivex.I
            public void onNext(Object object0) {
                d.b(this);
                io.reactivex.internal.operators.observable.u1.a.this.c();
            }
        }

        final I a;
        final AtomicReference b;
        final io.reactivex.internal.operators.observable.u1.a.a c;
        final io.reactivex.internal.util.c d;
        private static final long e = 0x13AFB1A8379F6A45L;

        io.reactivex.internal.operators.observable.u1.a(I i0) {
            this.a = i0;
            this.b = new AtomicReference();
            this.c = new io.reactivex.internal.operators.observable.u1.a.a(this);
            this.d = new io.reactivex.internal.util.c();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.b.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            d.g(this.b, c0);
        }

        void c() {
            d.b(this.b);
            l.a(this.a, this, this.d);
        }

        void d(Throwable throwable0) {
            d.b(this.b);
            l.c(this.a, throwable0, this, this.d);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this.b);
            d.b(this.c);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            d.b(this.c);
            l.a(this.a, this, this.d);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            d.b(this.c);
            l.c(this.a, throwable0, this, this.d);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            l.e(this.a, object0, this, this.d);
        }
    }

    final G b;

    public u1(G g0, G g1) {
        super(g0);
        this.b = g1;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.u1.a u1$a0 = new io.reactivex.internal.operators.observable.u1.a(i0);
        i0.b(u1$a0);
        this.b.d(u1$a0.c);
        this.a.d(u1$a0);
    }
}

