package io.reactivex.internal.operators.parallel;

import e3.c;
import e3.r;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.parallel.b;

public final class e extends b {
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

    static abstract class io.reactivex.internal.operators.parallel.e.b implements f3.a, org.reactivestreams.e {
        final r a;
        final c b;
        org.reactivestreams.e c;
        boolean d;

        io.reactivex.internal.operators.parallel.e.b(r r0, c c0) {
            this.a = r0;
            this.b = c0;
        }

        @Override  // org.reactivestreams.e
        public final void cancel() {
            this.c.cancel();
        }

        @Override  // org.reactivestreams.d
        public final void onNext(Object object0) {
            if(!this.m(object0) && !this.d) {
                this.c.request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public final void request(long v) {
            this.c.request(v);
        }
    }

    static final class io.reactivex.internal.operators.parallel.e.c extends io.reactivex.internal.operators.parallel.e.b {
        final f3.a e;

        io.reactivex.internal.operators.parallel.e.c(f3.a a0, r r0, c c0) {
            super(r0, c0);
            this.e = a0;
        }

        @Override  // io.reactivex.q
        public void g(org.reactivestreams.e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.e.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            boolean z;
            io.reactivex.parallel.a a0;
            long v;
            if(!this.d) {
                try {
                    v = 0L;
                    return this.a.test(object0) && this.e.m(object0);
                }
                catch(Throwable throwable0) {
                label_4:
                    io.reactivex.exceptions.b.b(throwable0);
                    try {
                        ++v;
                        a0 = (io.reactivex.parallel.a)io.reactivex.internal.functions.b.g(this.b.apply(v, throwable0), "The errorHandler returned a null item");
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
                                z = this.a.test(object0);
                            }
                            catch(Throwable throwable0) {
                                goto label_4;
                            }
                            return z && this.e.m(object0);
                        label_18:
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
                            goto label_18;
                        }
                    }
                    return false;
                }
            }
            return false;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.d) {
                this.d = true;
                this.e.onComplete();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.e.onError(throwable0);
        }
    }

    static final class d extends io.reactivex.internal.operators.parallel.e.b {
        final org.reactivestreams.d e;

        d(org.reactivestreams.d d0, r r0, c c0) {
            super(r0, c0);
            this.e = d0;
        }

        @Override  // io.reactivex.q
        public void g(org.reactivestreams.e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.e.g(this);
            }
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            io.reactivex.parallel.a a0;
            if(!this.d) {
                long v = 0L;
                try {
                label_2:
                    if(this.a.test(object0)) {
                        goto label_23;
                    }
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    try {
                        ++v;
                        a0 = (io.reactivex.parallel.a)io.reactivex.internal.functions.b.g(this.b.apply(v, throwable0), "The errorHandler returned a null item");
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
                            goto label_2;
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
                }
                return false;
            label_23:
                this.e.onNext(object0);
                return true;
            }
            return false;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.d) {
                this.d = true;
                this.e.onComplete();
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.e.onError(throwable0);
        }
    }

    final b a;
    final r b;
    final c c;

    public e(b b0, r r0, c c0) {
        this.a = b0;
        this.b = r0;
        this.c = c0;
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
            arr_d1[v] = d0 instanceof f3.a ? new io.reactivex.internal.operators.parallel.e.c(((f3.a)d0), this.b, this.c) : new d(d0, this.b, this.c);
        }
        this.a.Q(arr_d1);
    }
}

