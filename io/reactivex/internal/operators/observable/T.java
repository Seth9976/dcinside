package io.reactivex.internal.operators.observable;

import e3.b;
import f3.d;
import io.reactivex.B;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.Callable;

public final class t extends K implements d {
    static final class a implements I, c {
        final N a;
        final b b;
        final Object c;
        c d;
        boolean e;

        a(N n0, Object object0, b b0) {
            this.a = n0;
            this.b = b0;
            this.c = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d.a();
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(io.reactivex.internal.disposables.d.i(this.d, c0)) {
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
            this.a.onSuccess(this.c);
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

    final G a;
    final Callable b;
    final b c;

    public t(G g0, Callable callable0, b b0) {
        this.a = g0;
        this.b = callable0;
        this.c = b0;
    }

    @Override  // f3.d
    public B c() {
        return io.reactivex.plugins.a.R(new s(this.a, this.b, this.c));
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        Object object0;
        try {
            object0 = io.reactivex.internal.functions.b.g(this.b.call(), "The initialSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            e.m(throwable0, n0);
            return;
        }
        a t$a0 = new a(n0, object0, this.c);
        this.a.d(t$a0);
    }
}

