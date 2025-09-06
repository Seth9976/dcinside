package io.reactivex.internal.operators.mixed;

import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;

public final class a extends B {
    static final class io.reactivex.internal.operators.mixed.a.a extends AtomicReference implements I, c, f {
        final I a;
        G b;
        private static final long c = 0x83D160F5B9057B50L;

        io.reactivex.internal.operators.mixed.a.a(I i0, G g0) {
            this.b = g0;
            this.a = i0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I, io.reactivex.f
        public void b(c c0) {
            d.d(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I, io.reactivex.f
        public void onComplete() {
            G g0 = this.b;
            if(g0 == null) {
                this.a.onComplete();
                return;
            }
            this.b = null;
            g0.d(this);
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

    final i a;
    final G b;

    public a(i i0, G g0) {
        this.a = i0;
        this.b = g0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        io.reactivex.internal.operators.mixed.a.a a$a0 = new io.reactivex.internal.operators.mixed.a.a(i0, this.b);
        i0.b(a$a0);
        this.a.e(a$a0);
    }
}

