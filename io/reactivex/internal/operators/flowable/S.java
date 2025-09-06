package io.reactivex.internal.operators.flowable;

import e3.b;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.Callable;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class s extends a {
    static final class io.reactivex.internal.operators.flowable.s.a extends f implements q {
        final b m;
        final Object n;
        e o;
        boolean p;
        private static final long q = 0xCE2F5B1824F0CF92L;

        io.reactivex.internal.operators.flowable.s.a(d d0, Object object0, b b0) {
            super(d0);
            this.m = b0;
            this.n = object0;
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            super.cancel();
            this.o.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.o, e0)) {
                this.o = e0;
                this.b.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.p) {
                return;
            }
            this.p = true;
            this.a(this.n);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.p) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.p = true;
            this.b.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.p) {
                return;
            }
            try {
                this.m.accept(this.n, object0);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.o.cancel();
                this.onError(throwable0);
            }
        }
    }

    final Callable c;
    final b d;

    public s(l l0, Callable callable0, b b0) {
        super(l0);
        this.c = callable0;
        this.d = b0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        Object object0;
        try {
            object0 = io.reactivex.internal.functions.b.g(this.c.call(), "The initial value supplied is null");
        }
        catch(Throwable throwable0) {
            g.b(throwable0, d0);
            return;
        }
        io.reactivex.internal.operators.flowable.s.a s$a0 = new io.reactivex.internal.operators.flowable.s.a(d0, object0, this.d);
        this.b.l6(s$a0);
    }
}

