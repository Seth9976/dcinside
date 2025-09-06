package io.reactivex.internal.operators.observable;

import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;

public final class y0 extends a {
    static final class io.reactivex.internal.operators.observable.y0.a implements I, c {
        final I a;
        final o b;
        final o c;
        final Callable d;
        c e;

        io.reactivex.internal.operators.observable.y0.a(I i0, o o0, o o1, Callable callable0) {
            this.a = i0;
            this.b = o0;
            this.c = o1;
            this.d = callable0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.e.a();
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
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            G g0;
            try {
                g0 = (G)b.g(this.d.call(), "The onComplete ObservableSource returned is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onNext(g0);
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            G g0;
            try {
                g0 = (G)b.g(this.c.apply(throwable0), "The onError ObservableSource returned is null");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                this.a.onError(a0);
                return;
            }
            this.a.onNext(g0);
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            G g0;
            try {
                g0 = (G)b.g(this.b.apply(object0), "The onNext ObservableSource returned is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onNext(g0);
        }
    }

    final o b;
    final o c;
    final Callable d;

    public y0(G g0, o o0, o o1, Callable callable0) {
        super(g0);
        this.b = o0;
        this.c = o1;
        this.d = callable0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.y0.a y0$a0 = new io.reactivex.internal.operators.observable.y0.a(i0, this.b, this.c, this.d);
        this.a.d(y0$a0);
    }
}

