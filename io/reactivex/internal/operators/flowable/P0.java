package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.queue.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.k;
import io.reactivex.l;
import io.reactivex.processors.h;
import io.reactivex.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class p0 extends a {
    static final class io.reactivex.internal.operators.flowable.p0.a extends AtomicInteger implements b, e {
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
            io.reactivex.internal.operators.flowable.p0.a.p = 1;
            io.reactivex.internal.operators.flowable.p0.a.q = 2;
            io.reactivex.internal.operators.flowable.p0.a.r = 3;
            io.reactivex.internal.operators.flowable.p0.a.s = 4;
        }

        io.reactivex.internal.operators.flowable.p0.a(d d0, o o0, o o1, e3.c c0) {
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
                this.c.j((z ? io.reactivex.internal.operators.flowable.p0.a.p : io.reactivex.internal.operators.flowable.p0.a.q), object0);
            }
            this.g();
        }

        @Override  // io.reactivex.internal.operators.flowable.p0$b
        public void e(boolean z, io.reactivex.internal.operators.flowable.p0.c p0$c0) {
            synchronized(this) {
                this.c.j((z ? io.reactivex.internal.operators.flowable.p0.a.r : io.reactivex.internal.operators.flowable.p0.a.s), p0$c0);
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
            org.reactivestreams.c c2;
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
                    for(Object object0: this.e.values()) {
                        ((h)object0).onComplete();
                    }
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
                Object object1 = c0.poll();
                if(integer0 == io.reactivex.internal.operators.flowable.p0.a.p) {
                    h h0 = h.U8();
                    int v1 = this.l;
                    this.l = v1 + 1;
                    this.e.put(v1, h0);
                    try {
                        c1 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.h.apply(object1), "The leftEnd returned a null Publisher");
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
                    try {
                        object2 = io.reactivex.internal.functions.b.g(this.j.apply(object1, h0), "The resultSelector returned a null value");
                    }
                    catch(Throwable throwable1) {
                        this.i(throwable1, d0, c0);
                        return;
                    }
                    if(this.b.get() != 0L) {
                        d0.onNext(object2);
                        io.reactivex.internal.util.d.e(this.b, 1L);
                        for(Object object3: this.f.values()) {
                            h0.onNext(object3);
                        }
                        continue;
                    }
                    this.i(new io.reactivex.exceptions.c("Could not emit value due to lack of requests"), d0, c0);
                    return;
                }
                if(integer0 == io.reactivex.internal.operators.flowable.p0.a.q) {
                    int v2 = this.m;
                    this.m = v2 + 1;
                    this.f.put(v2, object1);
                    try {
                        c2 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.i.apply(object1), "The rightEnd returned a null Publisher");
                    }
                    catch(Throwable throwable2) {
                        this.i(throwable2, d0, c0);
                        return;
                    }
                    io.reactivex.internal.operators.flowable.p0.c p0$c1 = new io.reactivex.internal.operators.flowable.p0.c(this, false, v2);
                    this.d.d(p0$c1);
                    c2.e(p0$c1);
                    if(((Throwable)this.g.get()) != null) {
                        c0.clear();
                        this.a();
                        this.h(d0);
                        return;
                    }
                    for(Object object4: this.e.values()) {
                        ((h)object4).onNext(object1);
                    }
                }
                else if(integer0 == io.reactivex.internal.operators.flowable.p0.a.r) {
                    h h1 = (h)this.e.remove(((io.reactivex.internal.operators.flowable.p0.c)object1).c);
                    this.d.b(((io.reactivex.internal.operators.flowable.p0.c)object1));
                    if(h1 == null) {
                        continue;
                    }
                    h1.onComplete();
                }
                else if(integer0 == io.reactivex.internal.operators.flowable.p0.a.s) {
                    this.f.remove(((io.reactivex.internal.operators.flowable.p0.c)object1).c);
                    this.d.b(((io.reactivex.internal.operators.flowable.p0.c)object1));
                }
            }
        }

        void h(d d0) {
            Throwable throwable0 = k.c(this.g);
            for(Object object0: this.e.values()) {
                ((h)object0).onError(throwable0);
            }
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

    interface b {
        void b(Throwable arg1);

        void c(Throwable arg1);

        void d(boolean arg1, Object arg2);

        void e(boolean arg1, io.reactivex.internal.operators.flowable.p0.c arg2);

        void f(io.reactivex.internal.operators.flowable.p0.d arg1);
    }

    static final class io.reactivex.internal.operators.flowable.p0.c extends AtomicReference implements io.reactivex.disposables.c, q {
        final b a;
        final boolean b;
        final int c;
        private static final long d = 0x1A24EC53E2780A15L;

        io.reactivex.internal.operators.flowable.p0.c(b p0$b0, boolean z, int v) {
            this.a = p0$b0;
            this.b = z;
            this.c = v;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.e(this.b, this);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.b(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(j.a(this)) {
                this.a.e(this.b, this);
            }
        }
    }

    static final class io.reactivex.internal.operators.flowable.p0.d extends AtomicReference implements io.reactivex.disposables.c, q {
        final b a;
        final boolean b;
        private static final long c = 0x1A24EC53E2780A15L;

        io.reactivex.internal.operators.flowable.p0.d(b p0$b0, boolean z) {
            this.a = p0$b0;
            this.b = z;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.get() == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            j.a(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.f(this);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.c(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.d(this.b, object0);
        }
    }

    final org.reactivestreams.c c;
    final o d;
    final o e;
    final e3.c f;

    public p0(l l0, org.reactivestreams.c c0, o o0, o o1, e3.c c1) {
        super(l0);
        this.c = c0;
        this.d = o0;
        this.e = o1;
        this.f = c1;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.p0.a p0$a0 = new io.reactivex.internal.operators.flowable.p0.a(d0, this.d, this.e, this.f);
        d0.g(p0$a0);
        io.reactivex.internal.operators.flowable.p0.d p0$d0 = new io.reactivex.internal.operators.flowable.p0.d(p0$a0, true);
        p0$a0.d.d(p0$d0);
        io.reactivex.internal.operators.flowable.p0.d p0$d1 = new io.reactivex.internal.operators.flowable.p0.d(p0$a0, false);
        p0$a0.d.d(p0$d1);
        this.b.l6(p0$d0);
        this.c.e(p0$d1);
    }
}

