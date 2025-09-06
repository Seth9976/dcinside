package io.reactivex.internal.operators.parallel;

import e3.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.parallel.b;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class c extends b {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[io.reactivex.parallel.a.values().length];
            a.a = arr_v;
            try {
                arr_v[io.reactivex.parallel.a.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[io.reactivex.parallel.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[io.reactivex.parallel.a.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static final class io.reactivex.internal.operators.parallel.c.b implements f3.a, e {
        final f3.a a;
        final g b;
        final e3.c c;
        e d;
        boolean e;

        io.reactivex.internal.operators.parallel.c.b(f3.a a0, g g0, e3.c c0) {
            this.a = a0;
            this.b = g0;
            this.c = c0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.d.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            io.reactivex.parallel.a a0;
            long v;
            if(this.e) {
                return false;
            }
            try {
                v = 0L;
                this.b.accept(object0);
                return this.a.m(object0);
            }
            catch(Throwable throwable0) {
            label_6:
                io.reactivex.exceptions.b.b(throwable0);
                try {
                    ++v;
                    a0 = (io.reactivex.parallel.a)io.reactivex.internal.functions.b.g(this.c.apply(v, throwable0), "The errorHandler returned a null item");
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    this.cancel();
                    this.onError(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
                    return false;
                }
                int v1 = a.a[a0.ordinal()];
                switch(v1) {
                    case 1: {
                        try {
                            this.b.accept(object0);
                        }
                        catch(Throwable throwable0) {
                            goto label_6;
                        }
                        return this.a.m(object0);
                    label_20:
                        if(v1 != 3) {
                            this.cancel();
                            this.onError(throwable0);
                            return false;
                        }
                        this.cancel();
                        this.onComplete();
                        break;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        goto label_20;
                    }
                }
                return false;
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.m(object0) && !this.e) {
                this.d.request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.d.request(v);
        }
    }

    static final class io.reactivex.internal.operators.parallel.c.c implements f3.a, e {
        final d a;
        final g b;
        final e3.c c;
        e d;
        boolean e;

        io.reactivex.internal.operators.parallel.c.c(d d0, g g0, e3.c c0) {
            this.a = d0;
            this.b = g0;
            this.c = c0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.d.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.d, e0)) {
                this.d = e0;
                this.a.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            io.reactivex.parallel.a a0;
            if(this.e) {
                return false;
            }
            long v = 0L;
            try {
            label_3:
                this.b.accept(object0);
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                try {
                    ++v;
                    a0 = (io.reactivex.parallel.a)io.reactivex.internal.functions.b.g(this.c.apply(v, throwable0), "The errorHandler returned a null item");
                }
                catch(Throwable throwable1) {
                    io.reactivex.exceptions.b.b(throwable1);
                    this.cancel();
                    this.onError(new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1}));
                    return false;
                }
                int v1 = a.a[a0.ordinal()];
                switch(v1) {
                    case 1: {
                        goto label_3;
                    }
                    case 2: {
                        break;
                    }
                    default: {
                        if(v1 != 3) {
                            this.cancel();
                            this.onError(throwable0);
                            return false;
                        }
                        this.cancel();
                        this.onComplete();
                    }
                }
                return false;
            }
            this.a.onNext(object0);
            return true;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.m(object0)) {
                this.d.request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.d.request(v);
        }
    }

    final b a;
    final g b;
    final e3.c c;

    public c(b b0, g g0, e3.c c0) {
        this.a = b0;
        this.b = g0;
        this.c = c0;
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
            arr_d1[v] = d0 instanceof f3.a ? new io.reactivex.internal.operators.parallel.c.b(((f3.a)d0), this.b, this.c) : new io.reactivex.internal.operators.parallel.c.c(d0, this.b, this.c);
        }
        this.a.Q(arr_d1);
    }
}

