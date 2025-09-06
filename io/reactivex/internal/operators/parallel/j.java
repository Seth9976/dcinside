package io.reactivex.internal.operators.parallel;

import e3.o;
import io.reactivex.parallel.b;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class j extends b {
    static final class a implements f3.a, e {
        final f3.a a;
        final o b;
        e c;
        boolean d;

        a(f3.a a0, o o0) {
            this.a = a0;
            this.b = o0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.c.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.c, e0)) {
                this.c = e0;
                this.a.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            if(this.d) {
                return false;
            }
            try {
                Object object1 = io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null value");
                return this.a.m(object1);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.onError(throwable0);
                return false;
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object1;
            if(this.d) {
                return;
            }
            try {
                object1 = io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null value");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.onError(throwable0);
                return;
            }
            this.a.onNext(object1);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.c.request(v);
        }
    }

    static final class io.reactivex.internal.operators.parallel.j.b implements q, e {
        final d a;
        final o b;
        e c;
        boolean d;

        io.reactivex.internal.operators.parallel.j.b(d d0, o o0) {
            this.a = d0;
            this.b = o0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.c.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(io.reactivex.internal.subscriptions.j.k(this.c, e0)) {
                this.c = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object1;
            if(this.d) {
                return;
            }
            try {
                object1 = io.reactivex.internal.functions.b.g(this.b.apply(object0), "The mapper returned a null value");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.onError(throwable0);
                return;
            }
            this.a.onNext(object1);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.c.request(v);
        }
    }

    final b a;
    final o b;

    public j(b b0, o o0) {
        this.a = b0;
        this.b = o0;
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
            d d0 = arr_d[v];
            arr_d1[v] = d0 instanceof f3.a ? new a(((f3.a)d0), this.b) : new io.reactivex.internal.operators.parallel.j.b(d0, this.b);
        }
        this.a.Q(arr_d1);
    }
}

