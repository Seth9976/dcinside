package io.reactivex.internal.operators.parallel;

import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.parallel.b;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class l extends b {
    static final class a implements q, e {
        final d a;
        final l b;
        e c;
        boolean d;

        a(d d0, l l0) {
            this.a = d0;
            this.b = l0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            try {
                this.b.i.run();
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
            this.c.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                try {
                    this.c = e0;
                    this.b.g.accept(e0);
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    e0.cancel();
                    this.a.g(g.a);
                    this.onError(throwable0);
                    return;
                }
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.d) {
                try {
                    this.d = true;
                    this.b.e.run();
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.a.onError(throwable0);
                    return;
                }
                this.a.onComplete();
                try {
                    this.b.f.run();
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    io.reactivex.plugins.a.Y(throwable1);
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            try {
                this.d = true;
                this.b.d.accept(throwable0);
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.a.onError(throwable0);
            try {
                this.b.f.run();
            }
            catch(Throwable throwable2) {
                io.reactivex.exceptions.b.b(throwable2);
                io.reactivex.plugins.a.Y(throwable2);
            }
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.d) {
                try {
                    this.b.b.accept(object0);
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.onError(throwable0);
                    return;
                }
                this.a.onNext(object0);
                try {
                    this.b.c.accept(object0);
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    this.onError(throwable1);
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            try {
                this.b.h.a(v);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
            this.c.request(v);
        }
    }

    final b a;
    final e3.g b;
    final e3.g c;
    final e3.g d;
    final e3.a e;
    final e3.a f;
    final e3.g g;
    final e3.q h;
    final e3.a i;

    public l(b b0, e3.g g0, e3.g g1, e3.g g2, e3.a a0, e3.a a1, e3.g g3, e3.q q0, e3.a a2) {
        this.a = b0;
        this.b = (e3.g)io.reactivex.internal.functions.b.g(g0, "onNext is null");
        this.c = (e3.g)io.reactivex.internal.functions.b.g(g1, "onAfterNext is null");
        this.d = (e3.g)io.reactivex.internal.functions.b.g(g2, "onError is null");
        this.e = (e3.a)io.reactivex.internal.functions.b.g(a0, "onComplete is null");
        this.f = (e3.a)io.reactivex.internal.functions.b.g(a1, "onAfterTerminated is null");
        this.g = (e3.g)io.reactivex.internal.functions.b.g(g3, "onSubscribe is null");
        this.h = (e3.q)io.reactivex.internal.functions.b.g(q0, "onRequest is null");
        this.i = (e3.a)io.reactivex.internal.functions.b.g(a2, "onCancel is null");
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.a.F();
    }

    @Override  // io.reactivex.parallel.b
    public void Q(d[] arr_d) {
        if(!this.U(arr_d)) {
            return;
        }
        d[] arr_d1 = new d[arr_d.length];
        for(int v = 0; v < arr_d.length; ++v) {
            arr_d1[v] = new a(arr_d[v], this);
        }
        this.a.Q(arr_d1);
    }
}

