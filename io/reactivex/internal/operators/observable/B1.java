package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;

public final class b1 extends a {
    static final class io.reactivex.internal.operators.observable.b1.a implements I, c {
        final I a;
        final e3.c b;
        c c;
        Object d;
        boolean e;

        io.reactivex.internal.operators.observable.b1.a(I i0, e3.c c0) {
            this.a = i0;
            this.b = c0;
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
            if(this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Object object2;
            if(this.e) {
                return;
            }
            I i0 = this.a;
            Object object1 = this.d;
            if(object1 == null) {
                this.d = object0;
                i0.onNext(object0);
                return;
            }
            try {
                object2 = b.g(this.b.apply(object1, object0), "The value returned by the accumulator is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.c.dispose();
                this.onError(throwable0);
                return;
            }
            this.d = object2;
            i0.onNext(object2);
        }
    }

    final e3.c b;

    public b1(G g0, e3.c c0) {
        super(g0);
        this.b = c0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.b1.a b1$a0 = new io.reactivex.internal.operators.observable.b1.a(i0, this.b);
        this.a.d(b1$a0);
    }
}

