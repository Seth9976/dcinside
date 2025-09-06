package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class n1 extends a {
    static final class io.reactivex.internal.operators.observable.n1.a extends AtomicReference implements I, c {
        final I a;
        final AtomicReference b;
        private static final long c = 0x70559C6A66BE0138L;

        io.reactivex.internal.operators.observable.n1.a(I i0) {
            this.a = i0;
            this.b = new AtomicReference();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            d.g(this.b, c0);
        }

        void c(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this.b);
            d.b(this);
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
            this.a.onNext(object0);
        }
    }

    final class b implements Runnable {
        private final io.reactivex.internal.operators.observable.n1.a a;
        final n1 b;

        b(io.reactivex.internal.operators.observable.n1.a n1$a0) {
            this.a = n1$a0;
        }

        @Override
        public void run() {
            n1.this.a.d(this.a);
        }
    }

    final J b;

    public n1(G g0, J j0) {
        super(g0);
        this.b = j0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.n1.a n1$a0 = new io.reactivex.internal.operators.observable.n1.a(i0);
        i0.b(n1$a0);
        b n1$b0 = new b(this, n1$a0);
        n1$a0.c(this.b.f(n1$b0));
    }
}

