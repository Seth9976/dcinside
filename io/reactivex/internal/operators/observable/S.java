package io.reactivex.internal.operators.observable;

import e3.b;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Callable;

public final class s extends a {
    static final class io.reactivex.internal.operators.observable.s.a implements I, c {
        final I a;
        final b b;
        final Object c;
        c d;
        boolean e;

        io.reactivex.internal.operators.observable.s.a(I i0, Object object0, b b0) {
            this.a = i0;
            this.b = b0;
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
            this.a.onNext(this.c);
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
            if(this.e) {
                return;
            }
            try {
                this.b.accept(this.c, object0);
            }
            catch(Throwable throwable0) {
                this.d.dispose();
                this.onError(throwable0);
            }
        }
    }

    final Callable b;
    final b c;

    public s(G g0, Callable callable0, b b0) {
        super(g0);
        this.b = callable0;
        this.c = b0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        Object object0;
        try {
            object0 = io.reactivex.internal.functions.b.g(this.b.call(), "The initialSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            e.g(throwable0, i0);
            return;
        }
        io.reactivex.internal.operators.observable.s.a s$a0 = new io.reactivex.internal.operators.observable.s.a(i0, object0, this.c);
        this.a.d(s$a0);
    }
}

