package io.reactivex.internal.operators.parallel;

import e3.c;
import io.reactivex.internal.subscribers.h;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.parallel.b;
import java.util.concurrent.Callable;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class m extends b {
    static final class a extends h {
        final c p;
        Object q;
        boolean r;
        private static final long s = 8200530050639449080L;

        a(d d0, Object object0, c c0) {
            super(d0);
            this.q = object0;
            this.p = c0;
        }

        @Override  // io.reactivex.internal.subscribers.h
        public void cancel() {
            super.cancel();
            this.m.cancel();
        }

        @Override  // io.reactivex.internal.subscribers.h
        public void g(e e0) {
            if(j.k(this.m, e0)) {
                this.m = e0;
                this.b.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // io.reactivex.internal.subscribers.h
        public void onComplete() {
            if(!this.r) {
                this.r = true;
                Object object0 = this.q;
                this.q = null;
                this.a(object0);
            }
        }

        @Override  // io.reactivex.internal.subscribers.h
        public void onError(Throwable throwable0) {
            if(this.r) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.r = true;
            this.q = null;
            this.b.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.r) {
                try {
                    this.q = io.reactivex.internal.functions.b.g(this.p.apply(this.q, object0), "The reducer returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                }
            }
        }
    }

    final b a;
    final Callable b;
    final c c;

    public m(b b0, Callable callable0, c c0) {
        this.a = b0;
        this.b = callable0;
        this.c = c0;
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.a.F();
    }

    @Override  // io.reactivex.parallel.b
    public void Q(d[] arr_d) {
        Object object0;
        if(!this.U(arr_d)) {
            return;
        }
        d[] arr_d1 = new d[arr_d.length];
        for(int v = 0; v < arr_d.length; ++v) {
            try {
                object0 = io.reactivex.internal.functions.b.g(this.b.call(), "The initialSupplier returned a null value");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.V(arr_d, throwable0);
                return;
            }
            arr_d1[v] = new a(arr_d[v], object0, this.c);
        }
        this.a.Q(arr_d1);
    }

    void V(d[] arr_d, Throwable throwable0) {
        for(int v = 0; v < arr_d.length; ++v) {
            g.b(throwable0, arr_d[v]);
        }
    }
}

