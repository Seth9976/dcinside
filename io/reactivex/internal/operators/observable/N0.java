package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;

public final class n0 extends a {
    static final class io.reactivex.internal.operators.observable.n0.a implements I, c {
        final I a;
        c b;

        io.reactivex.internal.operators.observable.n0.a(I i0) {
            this.a = i0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            this.b = c0;
            this.a.b(this);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
        }
    }

    public n0(G g0) {
        super(g0);
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.n0.a n0$a0 = new io.reactivex.internal.operators.observable.n0.a(i0);
        this.a.d(n0$a0);
    }
}

