package io.reactivex.internal.operators.flowable;

import d3.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import org.reactivestreams.d;

public final class h0 extends l {
    static final class a extends c {
        final f3.a f;
        private static final long g = 0x23E7F25903D0C345L;

        a(f3.a a0, Object[] arr_object) {
            super(arr_object);
            this.f = a0;
        }

        @Override  // io.reactivex.internal.operators.flowable.h0$c
        void a() {
            Object[] arr_object = this.b;
            f3.a a0 = this.f;
            for(int v = this.c; v != arr_object.length; ++v) {
                if(this.d) {
                    return;
                }
                Object object0 = arr_object[v];
                if(object0 == null) {
                    a0.onError(new NullPointerException("The element at index " + v + " is null"));
                    return;
                }
                a0.m(object0);
            }
            if(this.d) {
                return;
            }
            a0.onComplete();
        }

        @Override  // io.reactivex.internal.operators.flowable.h0$c
        void b(long v) {
            Object[] arr_object = this.b;
            int v1 = this.c;
            f3.a a0 = this.f;
            do {
                long v2 = 0L;
                while(true) {
                    if(v2 != v && v1 != arr_object.length) {
                        if(this.d) {
                            return;
                        }
                        Object object0 = arr_object[v1];
                        if(object0 == null) {
                            a0.onError(new NullPointerException("The element at index " + v1 + " is null"));
                            return;
                        }
                        if(a0.m(object0)) {
                            ++v2;
                        }
                        ++v1;
                    }
                    else {
                        if(v1 == arr_object.length) {
                            if(!this.d) {
                                a0.onComplete();
                            }
                            return;
                        }
                        long v3 = this.get();
                        if(v2 == v3) {
                            break;
                        }
                        v = v3;
                    }
                }
                this.c = v1;
                v = this.addAndGet(-v2);
            }
            while(v != 0L);
        }
    }

    static final class b extends c {
        final d f;
        private static final long g = 0x23E7F25903D0C345L;

        b(d d0, Object[] arr_object) {
            super(arr_object);
            this.f = d0;
        }

        @Override  // io.reactivex.internal.operators.flowable.h0$c
        void a() {
            Object[] arr_object = this.b;
            d d0 = this.f;
            for(int v = this.c; v != arr_object.length; ++v) {
                if(this.d) {
                    return;
                }
                Object object0 = arr_object[v];
                if(object0 == null) {
                    d0.onError(new NullPointerException("The element at index " + v + " is null"));
                    return;
                }
                d0.onNext(object0);
            }
            if(this.d) {
                return;
            }
            d0.onComplete();
        }

        @Override  // io.reactivex.internal.operators.flowable.h0$c
        void b(long v) {
            Object[] arr_object = this.b;
            int v1 = this.c;
            d d0 = this.f;
            do {
                long v2 = 0L;
                while(true) {
                    if(v2 != v && v1 != arr_object.length) {
                        if(this.d) {
                            return;
                        }
                        Object object0 = arr_object[v1];
                        if(object0 == null) {
                            d0.onError(new NullPointerException("The element at index " + v1 + " is null"));
                            return;
                        }
                        d0.onNext(object0);
                        ++v2;
                        ++v1;
                    }
                    else {
                        if(v1 == arr_object.length) {
                            if(!this.d) {
                                d0.onComplete();
                            }
                            return;
                        }
                        long v3 = this.get();
                        if(v2 == v3) {
                            break;
                        }
                        v = v3;
                    }
                }
                this.c = v1;
                v = this.addAndGet(-v2);
            }
            while(v != 0L);
        }
    }

    static abstract class c extends io.reactivex.internal.subscriptions.d {
        final Object[] b;
        int c;
        volatile boolean d;
        private static final long e = -2252972430506210021L;

        c(Object[] arr_object) {
            this.b = arr_object;
        }

        abstract void a();

        abstract void b(long arg1);

        @Override  // org.reactivestreams.e
        public final void cancel() {
            this.d = true;
        }

        @Override  // f3.o
        public final void clear() {
            this.c = this.b.length;
        }

        @Override  // f3.k
        public final int i(int v) {
            return v & 1;
        }

        @Override  // f3.o
        public final boolean isEmpty() {
            return this.c == this.b.length;
        }

        @Override  // f3.o
        @g
        public final Object poll() {
            int v = this.c;
            Object[] arr_object = this.b;
            if(v == arr_object.length) {
                return null;
            }
            this.c = v + 1;
            return io.reactivex.internal.functions.b.g(arr_object[v], "array element is null");
        }

        @Override  // org.reactivestreams.e
        public final void request(long v) {
            if(j.j(v) && io.reactivex.internal.util.d.a(this, v) == 0L) {
                if(v == 0x7FFFFFFFFFFFFFFFL) {
                    this.a();
                    return;
                }
                this.b(v);
            }
        }
    }

    final Object[] b;

    public h0(Object[] arr_object) {
        this.b = arr_object;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        if(d0 instanceof f3.a) {
            d0.g(new a(((f3.a)d0), this.b));
            return;
        }
        d0.g(new b(d0, this.b));
    }
}

