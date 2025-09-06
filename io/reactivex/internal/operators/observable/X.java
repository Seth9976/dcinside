package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class x extends a {
    static final class io.reactivex.internal.operators.observable.x.a extends AtomicReference implements I, c, f {
        final I a;
        i b;
        boolean c;
        private static final long d = 0xE4E2F9B100804188L;

        io.reactivex.internal.operators.observable.x.a(I i0, i i1) {
            this.a = i0;
            this.b = i1;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I, io.reactivex.f
        public void b(c c0) {
            if(d.g(this, c0) && !this.c) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I, io.reactivex.f
        public void onComplete() {
            if(this.c) {
                this.a.onComplete();
                return;
            }
            this.c = true;
            d.d(this, null);
            i i0 = this.b;
            this.b = null;
            i0.e(this);
        }

        @Override  // io.reactivex.I, io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }
    }

    final i b;

    public x(B b0, i i0) {
        super(b0);
        this.b = i0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.observable.x.a x$a0 = new io.reactivex.internal.operators.observable.x.a(i0, this.b);
        this.a.d(x$a0);
    }
}

