package io.reactivex.internal.operators.flowable;

import d3.f;
import d3.g;
import e3.o;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.l;
import io.reactivex.q;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class b2 extends a {
    final class io.reactivex.internal.operators.flowable.b2.a implements o {
        final b2 a;

        @Override  // e3.o
        public Object apply(Object object0) throws Exception {
            return b.g(b2.this.e.apply(new Object[]{object0}), "The combiner returned a null value");
        }
    }

    static final class io.reactivex.internal.operators.flowable.b2.b extends AtomicInteger implements f3.a, e {
        final d a;
        final o b;
        final c[] c;
        final AtomicReferenceArray d;
        final AtomicReference e;
        final AtomicLong f;
        final io.reactivex.internal.util.c g;
        volatile boolean h;
        private static final long i = 0x15E3C5E57E438349L;

        io.reactivex.internal.operators.flowable.b2.b(d d0, o o0, int v) {
            this.a = d0;
            this.b = o0;
            c[] arr_b2$c = new c[v];
            for(int v1 = 0; v1 < v; ++v1) {
                arr_b2$c[v1] = new c(this, v1);
            }
            this.c = arr_b2$c;
            this.d = new AtomicReferenceArray(v);
            this.e = new AtomicReference();
            this.f = new AtomicLong();
            this.g = new io.reactivex.internal.util.c();
        }

        void a(int v) {
            c[] arr_b2$c = this.c;
            for(int v1 = 0; v1 < arr_b2$c.length; ++v1) {
                if(v1 != v) {
                    arr_b2$c[v1].a();
                }
            }
        }

        void b(int v, boolean z) {
            if(!z) {
                this.h = true;
                j.a(this.e);
                this.a(v);
                l.b(this.a, this, this.g);
            }
        }

        void c(int v, Throwable throwable0) {
            this.h = true;
            j.a(this.e);
            this.a(v);
            l.d(this.a, throwable0, this, this.g);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this.e);
            c[] arr_b2$c = this.c;
            for(int v = 0; v < arr_b2$c.length; ++v) {
                arr_b2$c[v].a();
            }
        }

        void d(int v, Object object0) {
            this.d.set(v, object0);
        }

        void e(org.reactivestreams.c[] arr_c, int v) {
            c[] arr_b2$c = this.c;
            AtomicReference atomicReference0 = this.e;
            for(int v1 = 0; v1 < v && atomicReference0.get() != j.a; ++v1) {
                arr_c[v1].e(arr_b2$c[v1]);
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.c(this.e, this.f, e0);
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            Object object2;
            if(this.h) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray0 = this.d;
            int v = atomicReferenceArray0.length();
            Object[] arr_object = new Object[v + 1];
            arr_object[0] = object0;
            int v1 = 0;
            while(v1 < v) {
                Object object1 = atomicReferenceArray0.get(v1);
                if(object1 == null) {
                    return false;
                }
                ++v1;
                arr_object[v1] = object1;
            }
            try {
                object2 = b.g(this.b.apply(arr_object), "The combiner returned a null value");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.cancel();
                this.onError(throwable0);
                return false;
            }
            l.f(this.a, object2, this, this.g);
            return true;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.h) {
                this.h = true;
                this.a(-1);
                l.b(this.a, this, this.g);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.h) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.h = true;
            this.a(-1);
            l.d(this.a, throwable0, this, this.g);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.m(object0) && !this.h) {
                ((e)this.e.get()).request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this.e, this.f, v);
        }
    }

    static final class c extends AtomicReference implements q {
        final io.reactivex.internal.operators.flowable.b2.b a;
        final int b;
        boolean c;
        private static final long d = 0x2D3210DE62C61A18L;

        c(io.reactivex.internal.operators.flowable.b2.b b2$b0, int v) {
            this.a = b2$b0;
            this.b = v;
        }

        void a() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.b(this.b, this.c);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.c(this.b, throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.c) {
                this.c = true;
            }
            this.a.d(this.b, object0);
        }
    }

    @g
    final org.reactivestreams.c[] c;
    @g
    final Iterable d;
    final o e;

    public b2(@f io.reactivex.l l0, @f Iterable iterable0, @f o o0) {
        super(l0);
        this.c = null;
        this.d = iterable0;
        this.e = o0;
    }

    public b2(@f io.reactivex.l l0, @f org.reactivestreams.c[] arr_c, o o0) {
        super(l0);
        this.c = arr_c;
        this.d = null;
        this.e = o0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        int v;
        org.reactivestreams.c[] arr_c = this.c;
        if(arr_c == null) {
            try {
                arr_c = new org.reactivestreams.c[8];
                v = 0;
                Iterator iterator0 = this.d.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_17;
                    }
                    Object object0 = iterator0.next();
                    if(v == arr_c.length) {
                        arr_c = (org.reactivestreams.c[])Arrays.copyOf(arr_c, (v >> 1) + v);
                    }
                    arr_c[v] = (org.reactivestreams.c)object0;
                    ++v;
                }
            }
            catch(Throwable throwable0) {
            }
            io.reactivex.exceptions.b.b(throwable0);
            io.reactivex.internal.subscriptions.g.b(throwable0, d0);
            return;
        }
        else {
            v = arr_c.length;
        }
    label_17:
        if(v == 0) {
            io.reactivex.internal.operators.flowable.b2.a b2$a0 = new io.reactivex.internal.operators.flowable.b2.a(this);
            new C0(this.b, b2$a0).m6(d0);
            return;
        }
        io.reactivex.internal.operators.flowable.b2.b b2$b0 = new io.reactivex.internal.operators.flowable.b2.b(d0, this.e, v);
        d0.g(b2$b0);
        b2$b0.e(arr_c, v);
        this.b.l6(b2$b0);
    }
}

