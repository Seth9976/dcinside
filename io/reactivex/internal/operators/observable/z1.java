package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.concurrent.TimeUnit;

public final class z1 extends a {
    static final class io.reactivex.internal.operators.observable.z1.a implements I, c {
        final I a;
        final TimeUnit b;
        final J c;
        long d;
        c e;

        io.reactivex.internal.operators.observable.z1.a(I i0, TimeUnit timeUnit0, J j0) {
            this.a = i0;
            this.c = j0;
            this.b = timeUnit0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.e, c0)) {
                this.e = c0;
                this.d = this.c.e(this.b);
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.e.dispose();
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
            long v = this.c.e(this.b);
            long v1 = this.d;
            this.d = v;
            io.reactivex.schedulers.d d0 = new io.reactivex.schedulers.d(object0, v - v1, this.b);
            this.a.onNext(d0);
        }
    }

    final J b;
    final TimeUnit c;

    public z1(G g0, TimeUnit timeUnit0, J j0) {
        super(g0);
        this.b = j0;
        this.c = timeUnit0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.z1.a z1$a0 = new io.reactivex.internal.operators.observable.z1.a(i0, this.c, this.b);
        this.a.d(z1$a0);
    }
}

