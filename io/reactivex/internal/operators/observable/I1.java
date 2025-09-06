package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;

public final class i1 extends a {
    static final class io.reactivex.internal.operators.observable.i1.a implements I, c {
        final I a;
        long b;
        c c;

        io.reactivex.internal.operators.observable.i1.a(I i0, long v) {
            this.a = i0;
            this.b = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
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
            long v = this.b;
            if(v != 0L) {
                this.b = v - 1L;
                return;
            }
            this.a.onNext(object0);
        }
    }

    final long b;

    public i1(G g0, long v) {
        super(g0);
        this.b = v;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.i1.a i1$a0 = new io.reactivex.internal.operators.observable.i1.a(i0, this.b);
        this.a.d(i1$a0);
    }
}

