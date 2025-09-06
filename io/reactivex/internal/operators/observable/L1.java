package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.observers.m;

public final class l1 extends a {
    final class io.reactivex.internal.operators.observable.l1.a implements I {
        final io.reactivex.internal.disposables.a a;
        final b b;
        final m c;
        c d;
        final l1 e;

        io.reactivex.internal.operators.observable.l1.a(io.reactivex.internal.disposables.a a0, b l1$b0, m m0) {
            this.a = a0;
            this.b = l1$b0;
            this.c = m0;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.d, c0)) {
                this.d = c0;
                this.a.c(1, c0);
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.b.d = true;
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.dispose();
            this.c.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.d.dispose();
            this.b.d = true;
        }
    }

    static final class b implements I {
        final I a;
        final io.reactivex.internal.disposables.a b;
        c c;
        volatile boolean d;
        boolean e;

        b(I i0, io.reactivex.internal.disposables.a a0) {
            this.a = i0;
            this.b = a0;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.b.c(0, c0);
            }
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.b.dispose();
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.b.dispose();
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.e) {
                this.a.onNext(object0);
                return;
            }
            if(this.d) {
                this.e = true;
                this.a.onNext(object0);
            }
        }
    }

    final G b;

    public l1(G g0, G g1) {
        super(g0);
        this.b = g1;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        m m0 = new m(i0);
        io.reactivex.internal.disposables.a a0 = new io.reactivex.internal.disposables.a(2);
        m0.b(a0);
        b l1$b0 = new b(m0, a0);
        io.reactivex.internal.operators.observable.l1.a l1$a0 = new io.reactivex.internal.operators.observable.l1.a(this, a0, l1$b0, m0);
        this.b.d(l1$a0);
        this.a.d(l1$b0);
    }
}

