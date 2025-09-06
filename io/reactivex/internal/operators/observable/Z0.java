package io.reactivex.internal.operators.observable;

import io.reactivex.A;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;

public final class z0 extends a {
    static final class io.reactivex.internal.operators.observable.z0.a implements I, c {
        final I a;
        c b;

        io.reactivex.internal.operators.observable.z0.a(I i0) {
            this.a = i0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.b, c0)) {
                this.b = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.onNext(A.a());
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            A a0 = A.b(throwable0);
            this.a.onNext(a0);
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            A a0 = A.c(object0);
            this.a.onNext(a0);
        }
    }

    public z0(G g0) {
        super(g0);
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.z0.a z0$a0 = new io.reactivex.internal.operators.observable.z0.a(i0);
        this.a.d(z0$a0);
    }
}

