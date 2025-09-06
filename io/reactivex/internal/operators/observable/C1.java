package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.concurrent.Callable;

public final class c1 extends a {
    static final class io.reactivex.internal.operators.observable.c1.a implements I, c {
        final I a;
        final e3.c b;
        Object c;
        c d;
        boolean e;

        io.reactivex.internal.operators.observable.c1.a(I i0, e3.c c0, Object object0) {
            this.a = i0;
            this.b = c0;
            this.c = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.d, c0)) {
                this.d = c0;
                this.a.b(this);
                this.a.onNext(this.c);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Object object1;
            if(this.e) {
                return;
            }
            try {
                object1 = b.g(this.b.apply(this.c, object0), "The accumulator returned a null value");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.d.dispose();
                this.onError(throwable0);
                return;
            }
            this.c = object1;
            this.a.onNext(object1);
        }
    }

    final e3.c b;
    final Callable c;

    public c1(G g0, Callable callable0, e3.c c0) {
        super(g0);
        this.b = c0;
        this.c = callable0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        Object object0;
        try {
            object0 = b.g(this.c.call(), "The seed supplied is null");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            e.g(throwable0, i0);
            return;
        }
        io.reactivex.internal.operators.observable.c1.a c1$a0 = new io.reactivex.internal.operators.observable.c1.a(i0, this.b, object0);
        this.a.d(c1$a0);
    }
}

