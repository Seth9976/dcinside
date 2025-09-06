package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.c;
import io.reactivex.l;
import io.reactivex.q;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class c2 extends l {
    static final class a extends AtomicInteger implements e {
        final d a;
        final b[] b;
        final o c;
        final AtomicLong d;
        final c e;
        final boolean f;
        volatile boolean g;
        final Object[] h;
        private static final long i = 0xDE359CF3BBB28EB1L;

        a(d d0, o o0, int v, int v1, boolean z) {
            this.a = d0;
            this.c = o0;
            this.f = z;
            b[] arr_c2$b = new b[v];
            for(int v2 = 0; v2 < v; ++v2) {
                arr_c2$b[v2] = new b(this, v1);
            }
            this.h = new Object[v];
            this.b = arr_c2$b;
            this.d = new AtomicLong();
            this.e = new c();
        }

        void a() {
            b[] arr_c2$b = this.b;
            for(int v = 0; v < arr_c2$b.length; ++v) {
                arr_c2$b[v].cancel();
            }
        }

        void b() {
            Object object2;
            if(this.getAndIncrement() != 0) {
                return;
            }
            d d0 = this.a;
            b[] arr_c2$b = this.b;
            Object[] arr_object = this.h;
            int v = 1;
            do {
                long v1 = this.d.get();
                long v2 = 0L;
                int v3;
                while((v3 = Long.compare(v1, v2)) != 0) {
                    if(this.g) {
                        return;
                    }
                    if(!this.f && this.e.get() != null) {
                        this.a();
                        d0.onError(this.e.c());
                        return;
                    }
                    boolean z = false;
                    int v4 = 0;
                    while(v4 < arr_c2$b.length) {
                        b c2$b0 = arr_c2$b[v4];
                        if(arr_object[v4] == null) {
                            try {
                                boolean z1 = c2$b0.f;
                                Object object0 = c2$b0.d == null ? null : c2$b0.d.poll();
                                if(z1 && object0 == null) {
                                    this.a();
                                    if(((Throwable)this.e.get()) != null) {
                                        d0.onError(this.e.c());
                                        return;
                                    }
                                    d0.onComplete();
                                    return;
                                }
                                if(object0 == null) {
                                    goto label_42;
                                }
                                else {
                                    arr_object[v4] = object0;
                                }
                                goto label_43;
                            }
                            catch(Throwable throwable0) {
                            }
                            io.reactivex.exceptions.b.b(throwable0);
                            this.e.a(throwable0);
                            if(!this.f) {
                                this.a();
                                d0.onError(this.e.c());
                                return;
                            }
                            z = true;
                            goto label_43;
                        label_42:
                            z = true;
                        }
                    label_43:
                        ++v4;
                    }
                    if(z) {
                        break;
                    }
                    try {
                        Object object1 = arr_object.clone();
                        object2 = io.reactivex.internal.functions.b.g(this.c.apply(object1), "The zipper returned a null value");
                    }
                    catch(Throwable throwable1) {
                        io.reactivex.exceptions.b.b(throwable1);
                        this.a();
                        this.e.a(throwable1);
                        d0.onError(this.e.c());
                        return;
                    }
                    d0.onNext(object2);
                    ++v2;
                    Arrays.fill(arr_object, null);
                }
                if(v3 == 0) {
                    if(this.g) {
                        return;
                    }
                    if(!this.f && this.e.get() != null) {
                        this.a();
                        d0.onError(this.e.c());
                        return;
                    }
                    for(int v5 = 0; v5 < arr_c2$b.length; ++v5) {
                        b c2$b1 = arr_c2$b[v5];
                        if(arr_object[v5] == null) {
                            try {
                                boolean z2 = c2$b1.f;
                                Object object3 = c2$b1.d == null ? null : c2$b1.d.poll();
                                if(z2 && object3 == null) {
                                    this.a();
                                    if(((Throwable)this.e.get()) != null) {
                                        d0.onError(this.e.c());
                                        return;
                                    }
                                    d0.onComplete();
                                    return;
                                }
                                if(object3 != null) {
                                    arr_object[v5] = object3;
                                }
                                continue;
                            }
                            catch(Throwable throwable2) {
                            }
                            io.reactivex.exceptions.b.b(throwable2);
                            this.e.a(throwable2);
                            if(!this.f) {
                                this.a();
                                d0.onError(this.e.c());
                                return;
                            }
                        }
                    }
                }
                if(v2 != 0L) {
                    for(int v6 = 0; v6 < arr_c2$b.length; ++v6) {
                        arr_c2$b[v6].request(v2);
                    }
                    if(v1 != 0x7FFFFFFFFFFFFFFFL) {
                        this.d.addAndGet(-v2);
                    }
                }
                v = this.addAndGet(-v);
            }
            while(v != 0);
        }

        void c(b c2$b0, Throwable throwable0) {
            if(this.e.a(throwable0)) {
                c2$b0.f = true;
                this.b();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(!this.g) {
                this.g = true;
                this.a();
            }
        }

        void d(org.reactivestreams.c[] arr_c, int v) {
            b[] arr_c2$b = this.b;
            for(int v1 = 0; v1 < v && !this.g && (this.f || this.e.get() == null); ++v1) {
                arr_c[v1].e(arr_c2$b[v1]);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.d, v);
                this.b();
            }
        }
    }

    static final class b extends AtomicReference implements q, e {
        final a a;
        final int b;
        final int c;
        f3.o d;
        long e;
        volatile boolean f;
        int g;
        private static final long h = -4627193790118206028L;

        b(a c2$a0, int v) {
            this.a = c2$a0;
            this.b = v;
            this.c = v - (v >> 2);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.h(this, e0)) {
                if(e0 instanceof f3.l) {
                    int v = ((f3.l)e0).i(7);
                    if(v == 1) {
                        this.g = 1;
                        this.d = (f3.l)e0;
                        this.f = true;
                        this.a.b();
                        return;
                    }
                    if(v == 2) {
                        this.g = 2;
                        this.d = (f3.l)e0;
                        e0.request(((long)this.b));
                        return;
                    }
                }
                this.d = new io.reactivex.internal.queue.b(this.b);
                e0.request(((long)this.b));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.f = true;
            this.a.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.c(this, throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.g != 2) {
                this.d.offer(object0);
            }
            this.a.b();
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(this.g != 1) {
                long v1 = this.e + v;
                if(v1 >= ((long)this.c)) {
                    this.e = 0L;
                    ((e)this.get()).request(v1);
                    return;
                }
                this.e = v1;
            }
        }
    }

    final org.reactivestreams.c[] b;
    final Iterable c;
    final o d;
    final int e;
    final boolean f;

    public c2(org.reactivestreams.c[] arr_c, Iterable iterable0, o o0, int v, boolean z) {
        this.b = arr_c;
        this.c = iterable0;
        this.d = o0;
        this.e = v;
        this.f = z;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        int v;
        org.reactivestreams.c[] arr_c = this.b;
        if(arr_c == null) {
            arr_c = new org.reactivestreams.c[8];
            v = 0;
            for(Object object0: this.c) {
                if(v == arr_c.length) {
                    org.reactivestreams.c[] arr_c1 = new org.reactivestreams.c[(v >> 2) + v];
                    System.arraycopy(arr_c, 0, arr_c1, 0, v);
                    arr_c = arr_c1;
                }
                arr_c[v] = (org.reactivestreams.c)object0;
                ++v;
            }
        }
        else {
            v = arr_c.length;
        }
        if(v == 0) {
            g.a(d0);
            return;
        }
        a c2$a0 = new a(d0, this.d, v, this.e, this.f);
        d0.g(c2$a0);
        c2$a0.d(arr_c, v);
    }
}

