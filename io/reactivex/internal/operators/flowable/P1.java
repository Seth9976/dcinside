package io.reactivex.internal.operators.flowable;

import e3.d;
import f3.o;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class p1 extends l {
    static final class a extends f implements b {
        final d m;
        final c n;
        final c o;
        final io.reactivex.internal.util.c p;
        final AtomicInteger q;
        Object r;
        Object s;
        private static final long t = -6178010334400373240L;

        a(org.reactivestreams.d d0, int v, d d1) {
            super(d0);
            this.m = d1;
            this.q = new AtomicInteger();
            this.n = new c(this, v);
            this.o = new c(this, v);
            this.p = new io.reactivex.internal.util.c();
        }

        @Override  // io.reactivex.internal.operators.flowable.p1$b
        public void c(Throwable throwable0) {
            if(this.p.a(throwable0)) {
                this.d();
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            super.cancel();
            this.n.a();
            this.o.a();
            if(this.q.getAndIncrement() == 0) {
                this.n.b();
                this.o.b();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.p1$b
        public void d() {
            if(this.q.getAndIncrement() != 0) {
                return;
            }
            int v = 1;
            do {
                o o0 = this.n.e;
                o o1 = this.o.e;
                if(o0 == null || o1 == null) {
                    if(this.f()) {
                        this.n.b();
                        this.o.b();
                        return;
                    }
                    if(((Throwable)this.p.get()) != null) {
                        this.o();
                        Throwable throwable7 = this.p.c();
                        this.b.onError(throwable7);
                        return;
                    }
                }
                else {
                    while(true) {
                        if(this.f()) {
                            this.n.b();
                            this.o.b();
                            return;
                        }
                        if(((Throwable)this.p.get()) != null) {
                            this.o();
                            Throwable throwable0 = this.p.c();
                            this.b.onError(throwable0);
                            return;
                        }
                        boolean z = this.n.f;
                        Object object0 = this.r;
                        if(object0 == null) {
                            try {
                                object0 = o0.poll();
                                this.r = object0;
                            }
                            catch(Throwable throwable1) {
                                io.reactivex.exceptions.b.b(throwable1);
                                this.o();
                                this.p.a(throwable1);
                                Throwable throwable2 = this.p.c();
                                this.b.onError(throwable2);
                                return;
                            }
                        }
                        int v1 = 0;
                        int v2 = object0 == null ? 1 : 0;
                        boolean z1 = this.o.f;
                        Object object1 = this.s;
                        if(object1 == null) {
                            try {
                                object1 = o1.poll();
                                this.s = object1;
                            }
                            catch(Throwable throwable3) {
                                io.reactivex.exceptions.b.b(throwable3);
                                this.o();
                                this.p.a(throwable3);
                                Throwable throwable4 = this.p.c();
                                this.b.onError(throwable4);
                                return;
                            }
                        }
                        if(object1 == null) {
                            v1 = 1;
                        }
                        if(z && z1 && v2 != 0 && v1 != 0) {
                            this.a(Boolean.TRUE);
                            return;
                        }
                        if(z && z1 && v2 != v1) {
                            this.o();
                            this.a(Boolean.FALSE);
                            return;
                        }
                        if(v2 != 0 || v1 != 0) {
                            break;
                        }
                        try {
                            if(!this.m.a(object0, object1)) {
                                goto label_62;
                            }
                            goto label_65;
                        }
                        catch(Throwable throwable5) {
                            io.reactivex.exceptions.b.b(throwable5);
                            this.o();
                            this.p.a(throwable5);
                            Throwable throwable6 = this.p.c();
                            this.b.onError(throwable6);
                            return;
                        }
                    label_62:
                        this.o();
                        this.a(Boolean.FALSE);
                        return;
                    label_65:
                        this.r = null;
                        this.s = null;
                        this.n.c();
                        this.o.c();
                    }
                }
                v = this.q.addAndGet(-v);
            }
            while(v != 0);
        }

        void o() {
            this.n.a();
            this.n.b();
            this.o.a();
            this.o.b();
        }

        void p(org.reactivestreams.c c0, org.reactivestreams.c c1) {
            c0.e(this.n);
            c1.e(this.o);
        }
    }

    interface b {
        void c(Throwable arg1);

        void d();
    }

    static final class c extends AtomicReference implements q {
        final b a;
        final int b;
        final int c;
        long d;
        volatile o e;
        volatile boolean f;
        int g;
        private static final long h = 4804128302091633067L;

        c(b p1$b0, int v) {
            this.a = p1$b0;
            this.c = v - (v >> 2);
            this.b = v;
        }

        public void a() {
            j.a(this);
        }

        void b() {
            o o0 = this.e;
            if(o0 != null) {
                o0.clear();
            }
        }

        public void c() {
            if(this.g != 1) {
                long v = this.d + 1L;
                if(v >= ((long)this.c)) {
                    this.d = 0L;
                    ((e)this.get()).request(v);
                    return;
                }
                this.d = v;
            }
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.h(this, e0)) {
                if(e0 instanceof f3.l) {
                    int v = ((f3.l)e0).i(3);
                    if(v == 1) {
                        this.g = 1;
                        this.e = (f3.l)e0;
                        this.f = true;
                        this.a.d();
                        return;
                    }
                    if(v == 2) {
                        this.g = 2;
                        this.e = (f3.l)e0;
                        e0.request(((long)this.b));
                        return;
                    }
                }
                this.e = new io.reactivex.internal.queue.b(this.b);
                e0.request(((long)this.b));
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.f = true;
            this.a.d();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.c(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.g == 0 && !this.e.offer(object0)) {
                this.onError(new io.reactivex.exceptions.c());
                return;
            }
            this.a.d();
        }
    }

    final org.reactivestreams.c b;
    final org.reactivestreams.c c;
    final d d;
    final int e;

    public p1(org.reactivestreams.c c0, org.reactivestreams.c c1, d d0, int v) {
        this.b = c0;
        this.c = c1;
        this.d = d0;
        this.e = v;
    }

    @Override  // io.reactivex.l
    public void m6(org.reactivestreams.d d0) {
        a p1$a0 = new a(d0, this.e, this.d);
        d0.g(p1$a0);
        p1$a0.p(this.b, this.c);
    }
}

