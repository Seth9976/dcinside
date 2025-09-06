package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.queue.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class w0 extends a {
    static final class io.reactivex.internal.operators.flowable.w0.a extends AtomicInteger implements b, e {
        final d a;
        final AtomicLong b;
        final c c;
        final io.reactivex.disposables.b d;
        final Map e;
        final Map f;
        final AtomicReference g;
        final o h;
        final o i;
        final e3.c j;
        final AtomicInteger k;
        int l;
        int m;
        volatile boolean n;
        private static final long o = 0xABBEB4AB90BF18C7L;
        static final Integer p;
        static final Integer q;
        static final Integer r;
        static final Integer s;

        static {
            io.reactivex.internal.operators.flowable.w0.a.p = 1;
            io.reactivex.internal.operators.flowable.w0.a.q = 2;
            io.reactivex.internal.operators.flowable.w0.a.r = 3;
            io.reactivex.internal.operators.flowable.w0.a.s = 4;
        }

        io.reactivex.internal.operators.flowable.w0.a(d d0, o o0, o o1, e3.c c0) {
            this.a = d0;
            this.b = new AtomicLong();
            this.d = new io.reactivex.disposables.b();
            this.c = new c(0x80);
            this.e = new LinkedHashMap();
            this.f = new LinkedHashMap();
            this.g = new AtomicReference();
            this.h = o0;
            this.i = o1;
            this.j = c0;
            this.k = new AtomicInteger(2);
        }

        void a() {
            this.d.dispose();
        }

        @Override  // io.reactivex.internal.operators.flowable.p0$b
        public void b(Throwable throwable0) {
            if(k.a(this.g, throwable0)) {
                this.g();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.operators.flowable.p0$b
        public void c(Throwable throwable0) {
            if(k.a(this.g, throwable0)) {
                this.k.decrementAndGet();
                this.g();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            if(this.n) {
                return;
            }
            this.n = true;
            this.a();
            if(this.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.p0$b
        public void d(boolean z, Object object0) {
            synchronized(this) {
                this.c.j((z ? io.reactivex.internal.operators.flowable.w0.a.p : io.reactivex.internal.operators.flowable.w0.a.q), object0);
            }
            this.g();
        }

        @Override  // io.reactivex.internal.operators.flowable.p0$b
        public void e(boolean z, io.reactivex.internal.operators.flowable.p0.c p0$c0) {
            synchronized(this) {
                this.c.j((z ? io.reactivex.internal.operators.flowable.w0.a.r : io.reactivex.internal.operators.flowable.w0.a.s), p0$c0);
            }
            this.g();
        }

        @Override  // io.reactivex.internal.operators.flowable.p0$b
        public void f(io.reactivex.internal.operators.flowable.p0.d p0$d0) {
            this.d.c(p0$d0);
            this.k.decrementAndGet();
            this.g();
        }

        void g() {
            Object object4;
            org.reactivestreams.c c3;
            Object object2;
            org.reactivestreams.c c1;
            if(this.getAndIncrement() != 0) {
                return;
            }
            c c0 = this.c;
            d d0 = this.a;
            int v = 1;
            while(true) {
                if(this.n) {
                    c0.clear();
                    return;
                }
                if(((Throwable)this.g.get()) != null) {
                    c0.clear();
                    this.a();
                    this.h(d0);
                    return;
                }
                boolean z = this.k.get() == 0;
                Integer integer0 = (Integer)c0.poll();
                if(z && integer0 == null) {
                    this.e.clear();
                    this.f.clear();
                    this.d.dispose();
                    d0.onComplete();
                    return;
                }
                if(integer0 == null) {
                    v = this.addAndGet(-v);
                    if(v != 0) {
                        continue;
                    }
                    return;
                }
                Object object0 = c0.poll();
                if(integer0 == io.reactivex.internal.operators.flowable.w0.a.p) {
                    int v1 = this.l;
                    this.l = v1 + 1;
                    this.e.put(v1, object0);
                    try {
                        c1 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.h.apply(object0), "The leftEnd returned a null Publisher");
                    }
                    catch(Throwable throwable0) {
                        this.i(throwable0, d0, c0);
                        return;
                    }
                    io.reactivex.internal.operators.flowable.p0.c p0$c0 = new io.reactivex.internal.operators.flowable.p0.c(this, true, v1);
                    this.d.d(p0$c0);
                    c1.e(p0$c0);
                    if(((Throwable)this.g.get()) != null) {
                        c0.clear();
                        this.a();
                        this.h(d0);
                        return;
                    }
                    long v2 = this.b.get();
                    long v3 = 0L;
                    for(Object object1: this.f.values()) {
                        try {
                            object2 = io.reactivex.internal.functions.b.g(this.j.apply(object0, object1), "The resultSelector returned a null value");
                        }
                        catch(Throwable throwable1) {
                            this.i(throwable1, d0, c0);
                            return;
                        }
                        if(v3 != v2) {
                            d0.onNext(object2);
                            ++v3;
                            continue;
                        }
                        io.reactivex.exceptions.c c2 = new io.reactivex.exceptions.c("Could not emit value due to lack of requests");
                        k.a(this.g, c2);
                        c0.clear();
                        this.a();
                        this.h(d0);
                        return;
                    }
                    if(v3 == 0L) {
                        continue;
                    }
                    io.reactivex.internal.util.d.e(this.b, v3);
                }
                else if(integer0 == io.reactivex.internal.operators.flowable.w0.a.q) {
                    int v4 = this.m;
                    this.m = v4 + 1;
                    this.f.put(v4, object0);
                    try {
                        c3 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.i.apply(object0), "The rightEnd returned a null Publisher");
                    }
                    catch(Throwable throwable2) {
                        this.i(throwable2, d0, c0);
                        return;
                    }
                    io.reactivex.internal.operators.flowable.p0.c p0$c1 = new io.reactivex.internal.operators.flowable.p0.c(this, false, v4);
                    this.d.d(p0$c1);
                    c3.e(p0$c1);
                    if(((Throwable)this.g.get()) != null) {
                        c0.clear();
                        this.a();
                        this.h(d0);
                        return;
                    }
                    long v5 = this.b.get();
                    long v6 = 0L;
                    for(Object object3: this.e.values()) {
                        try {
                            object4 = io.reactivex.internal.functions.b.g(this.j.apply(object3, object0), "The resultSelector returned a null value");
                        }
                        catch(Throwable throwable3) {
                            this.i(throwable3, d0, c0);
                            return;
                        }
                        if(v6 != v5) {
                            d0.onNext(object4);
                            ++v6;
                            continue;
                        }
                        io.reactivex.exceptions.c c4 = new io.reactivex.exceptions.c("Could not emit value due to lack of requests");
                        k.a(this.g, c4);
                        c0.clear();
                        this.a();
                        this.h(d0);
                        return;
                    }
                    if(v6 == 0L) {
                        continue;
                    }
                    io.reactivex.internal.util.d.e(this.b, v6);
                }
                else if(integer0 == io.reactivex.internal.operators.flowable.w0.a.r) {
                    this.e.remove(((io.reactivex.internal.operators.flowable.p0.c)object0).c);
                    this.d.b(((io.reactivex.internal.operators.flowable.p0.c)object0));
                }
                else if(integer0 == io.reactivex.internal.operators.flowable.w0.a.s) {
                    this.f.remove(((io.reactivex.internal.operators.flowable.p0.c)object0).c);
                    this.d.b(((io.reactivex.internal.operators.flowable.p0.c)object0));
                }
            }
        }

        void h(d d0) {
            Throwable throwable0 = k.c(this.g);
            this.e.clear();
            this.f.clear();
            d0.onError(throwable0);
        }

        void i(Throwable throwable0, d d0, f3.o o0) {
            io.reactivex.exceptions.b.b(throwable0);
            k.a(this.g, throwable0);
            o0.clear();
            this.a();
            this.h(d0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.b, v);
            }
        }
    }

    final org.reactivestreams.c c;
    final o d;
    final o e;
    final e3.c f;

    public w0(l l0, org.reactivestreams.c c0, o o0, o o1, e3.c c1) {
        super(l0);
        this.c = c0;
        this.d = o0;
        this.e = o1;
        this.f = c1;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.w0.a w0$a0 = new io.reactivex.internal.operators.flowable.w0.a(d0, this.d, this.e, this.f);
        d0.g(w0$a0);
        io.reactivex.internal.operators.flowable.p0.d p0$d0 = new io.reactivex.internal.operators.flowable.p0.d(w0$a0, true);
        w0$a0.d.d(p0$d0);
        io.reactivex.internal.operators.flowable.p0.d p0$d1 = new io.reactivex.internal.operators.flowable.p0.d(w0$a0, false);
        w0$a0.d.d(p0$d1);
        this.b.l6(p0$d0);
        this.c.e(p0$d1);
    }
}

