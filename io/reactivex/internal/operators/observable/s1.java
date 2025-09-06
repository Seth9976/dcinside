package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;

public final class s1 extends a {
    static final class io.reactivex.internal.operators.observable.s1.a implements I, c {
        final I a;
        c b;
        Object c;

        io.reactivex.internal.operators.observable.s1.a(I i0) {
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

        void c() {
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.a.onNext(object0);
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c = null;
            this.b.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.c();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.c = null;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.c = object0;
        }
    }

    public s1(G g0) {
        super(g0);
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.s1.a s1$a0 = new io.reactivex.internal.operators.observable.s1.a(i0);
        this.a.d(s1$a0);
    }
}

