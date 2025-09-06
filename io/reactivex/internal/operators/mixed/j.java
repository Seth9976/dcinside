package io.reactivex.internal.operators.mixed;

import e3.o;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class j extends B {
    static final class a extends AtomicReference implements I, c, v {
        final I a;
        final o b;
        private static final long c = 0x83D160F5B9057B50L;

        a(I i0, o o0) {
            this.a = i0;
            this.b = o0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.I, io.reactivex.v
        public void b(c c0) {
            d.d(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.I, io.reactivex.v
        public void onComplete() {
            this.a.onComplete();
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
            G g0;
            try {
                g0 = (G)b.g(this.b.apply(object0), "The mapper returned a null Publisher");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            g0.d(this);
        }
    }

    final y a;
    final o b;

    public j(y y0, o o0) {
        this.a = y0;
        this.b = o0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        a j$a0 = new a(i0, this.b);
        i0.b(j$a0);
        this.a.a(j$a0);
    }
}

