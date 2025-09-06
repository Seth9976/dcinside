package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.observers.m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class x1 extends a {
    static final class io.reactivex.internal.operators.observable.x1.a extends AtomicReference implements I, c, Runnable {
        final I a;
        final long b;
        final TimeUnit c;
        final io.reactivex.J.c d;
        c e;
        volatile boolean f;
        boolean g;
        private static final long h = 0xAEBF798AFBE73BFL;

        io.reactivex.internal.operators.observable.x1.a(I i0, long v, TimeUnit timeUnit0, io.reactivex.J.c j$c0) {
            this.a = i0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j$c0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.e, c0)) {
                this.e = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.e.dispose();
            this.d.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(!this.g) {
                this.g = true;
                this.a.onComplete();
                this.d.dispose();
            }
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.g) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.g = true;
            this.a.onError(throwable0);
            this.d.dispose();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(!this.f && !this.g) {
                this.f = true;
                this.a.onNext(object0);
                c c0 = (c)this.get();
                if(c0 != null) {
                    c0.dispose();
                }
                d.d(this, this.d.d(this, this.b, this.c));
            }
        }

        @Override
        public void run() {
            this.f = false;
        }
    }

    final long b;
    final TimeUnit c;
    final J d;

    public x1(G g0, long v, TimeUnit timeUnit0, J j0) {
        super(g0);
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        m m0 = new m(i0);
        io.reactivex.J.c j$c0 = this.d.d();
        io.reactivex.internal.operators.observable.x1.a x1$a0 = new io.reactivex.internal.operators.observable.x1.a(m0, this.b, this.c, j$c0);
        this.a.d(x1$a0);
    }
}

