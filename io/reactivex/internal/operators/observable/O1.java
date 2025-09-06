package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.h;

public final class o1 extends a {
    static final class io.reactivex.internal.operators.observable.o1.a implements I {
        final I a;
        final G b;
        final h c;
        boolean d;

        io.reactivex.internal.operators.observable.o1.a(I i0, G g0) {
            this.a = i0;
            this.b = g0;
            this.d = true;
            this.c = new h();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            this.c.c(c0);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.d) {
                this.d = false;
                this.b.d(this);
                return;
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.d) {
                this.d = false;
            }
            this.a.onNext(object0);
        }
    }

    final G b;

    public o1(G g0, G g1) {
        super(g0);
        this.b = g1;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.o1.a o1$a0 = new io.reactivex.internal.operators.observable.o1.a(i0, this.b);
        i0.b(o1$a0.c);
        this.a.d(o1$a0);
    }
}

