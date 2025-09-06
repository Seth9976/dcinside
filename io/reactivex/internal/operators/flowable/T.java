package io.reactivex.internal.operators.flowable;

import f3.b;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.Callable;
import org.reactivestreams.e;

public final class t extends K implements b {
    static final class a implements c, q {
        final N a;
        final e3.b b;
        final Object c;
        e d;
        boolean e;

        a(N n0, Object object0, e3.b b0) {
            this.a = n0;
            this.b = b0;
            this.c = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.d == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.d.cancel();
            this.d = j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.d = j.a;
            this.a.onSuccess(this.c);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.d = j.a;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.e) {
                return;
            }
            try {
                this.b.accept(this.c, object0);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.d.cancel();
                this.onError(throwable0);
            }
        }
    }

    final l a;
    final Callable b;
    final e3.b c;

    public t(l l0, Callable callable0, e3.b b0) {
        this.a = l0;
        this.b = callable0;
        this.c = b0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        Object object0;
        try {
            object0 = io.reactivex.internal.functions.b.g(this.b.call(), "The initialSupplier returned a null value");
        }
        catch(Throwable throwable0) {
            io.reactivex.internal.disposables.e.m(throwable0, n0);
            return;
        }
        a t$a0 = new a(n0, object0, this.c);
        this.a.l6(t$a0);
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new s(this.a, this.b, this.c));
    }
}

