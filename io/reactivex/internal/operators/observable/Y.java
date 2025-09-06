package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import java.util.concurrent.atomic.AtomicReference;

public final class y extends a {
    static final class io.reactivex.internal.operators.observable.y.a extends AtomicReference implements I, c, v {
        final I a;
        io.reactivex.y b;
        boolean c;
        private static final long d = 0xE4E2F9B100804188L;

        io.reactivex.internal.operators.observable.y.a(I i0, io.reactivex.y y0) {
            this.a = i0;
            this.b = y0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I, io.reactivex.v
        public void b(c c0) {
            if(d.g(this, c0) && !this.c) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I, io.reactivex.v
        public void onComplete() {
            if(this.c) {
                this.a.onComplete();
                return;
            }
            this.c = true;
            d.d(this, null);
            io.reactivex.y y0 = this.b;
            this.b = null;
            y0.a(this);
        }

        @Override  // io.reactivex.I, io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onNext(object0);
            this.a.onComplete();
        }
    }

    final io.reactivex.y b;

    public y(B b0, io.reactivex.y y0) {
        super(b0);
        this.b = y0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.y.a y$a0 = new io.reactivex.internal.operators.observable.y.a(i0, this.b);
        this.a.d(y$a0);
    }
}

