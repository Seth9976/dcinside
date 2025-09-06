package io.reactivex.internal.operators.parallel;

import e3.r;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.parallel.b;
import org.reactivestreams.e;

public final class d extends b {
    static abstract class a implements f3.a, e {
        final r a;
        e b;
        boolean c;

        a(r r0) {
            this.a = r0;
        }

        @Override  // org.reactivestreams.e
        public final void cancel() {
            this.b.cancel();
        }

        @Override  // org.reactivestreams.d
        public final void onNext(Object object0) {
            if(!this.m(object0) && !this.c) {
                this.b.request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public final void request(long v) {
            this.b.request(v);
        }
    }

    static final class io.reactivex.internal.operators.parallel.d.b extends a {
        final f3.a d;

        io.reactivex.internal.operators.parallel.d.b(f3.a a0, r r0) {
            super(r0);
            this.d = a0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.d.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            if(!this.c) {
                try {
                    if(this.a.test(object0)) {
                        return this.d.m(object0);
                    }
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                }
                return false;
            }
            return false;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.c) {
                this.c = true;
                this.d.onComplete();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.d.onError(throwable0);
        }
    }

    static final class c extends a {
        final org.reactivestreams.d d;

        c(org.reactivestreams.d d0, r r0) {
            super(r0);
            this.d = d0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.d.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            if(!this.c) {
                try {
                    if(this.a.test(object0)) {
                        goto label_8;
                    }
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.onError(throwable0);
                }
                return false;
            label_8:
                this.d.onNext(object0);
                return true;
            }
            return false;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.c) {
                this.c = true;
                this.d.onComplete();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.c) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.c = true;
            this.d.onError(throwable0);
        }
    }

    final b a;
    final r b;

    public d(b b0, r r0) {
        this.a = b0;
        this.b = r0;
    }

    @Override  // io.reactivex.parallel.b
    public int F() {
        return this.a.F();
    }

    @Override  // io.reactivex.parallel.b
    public void Q(org.reactivestreams.d[] arr_d) {
        if(!this.U(arr_d)) {
            return;
        }
        org.reactivestreams.d[] arr_d1 = new org.reactivestreams.d[arr_d.length];
        for(int v = 0; v < arr_d.length; ++v) {
            org.reactivestreams.d d0 = arr_d[v];
            arr_d1[v] = d0 instanceof f3.a ? new io.reactivex.internal.operators.parallel.d.b(((f3.a)d0), this.b) : new c(d0, this.b);
        }
        this.a.Q(arr_d1);
    }
}

