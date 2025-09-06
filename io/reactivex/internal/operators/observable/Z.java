package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.N;
import io.reactivex.Q;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class z extends a {
    static final class io.reactivex.internal.operators.observable.z.a extends AtomicReference implements I, N, c {
        final I a;
        Q b;
        boolean c;
        private static final long d = 0xE4E2F9B100804188L;

        io.reactivex.internal.operators.observable.z.a(I i0, Q q0) {
            this.a = i0;
            this.b = q0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I, io.reactivex.N
        public void b(c c0) {
            if(d.g(this, c0) && !this.c) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.c = true;
            d.d(this, null);
            Q q0 = this.b;
            this.b = null;
            q0.e(this);
        }

        @Override  // io.reactivex.I, io.reactivex.N
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // io.reactivex.N
        public void onSuccess(Object object0) {
            this.a.onNext(object0);
            this.a.onComplete();
        }
    }

    final Q b;

    public z(B b0, Q q0) {
        super(b0);
        this.b = q0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.z.a z$a0 = new io.reactivex.internal.operators.observable.z.a(i0, this.b);
        this.a.d(z$a0);
    }
}

