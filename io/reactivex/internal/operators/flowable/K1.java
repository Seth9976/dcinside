package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class k1 extends l {
    static final class a extends c {
        final AtomicInteger g;
        volatile boolean h;
        private static final long i = 0xD5F42546ACF217D7L;

        a(d d0, org.reactivestreams.c c0) {
            super(d0, c0);
            this.g = new AtomicInteger();
        }

        @Override  // io.reactivex.internal.operators.flowable.k1$c
        void b() {
            this.h = true;
            if(this.g.getAndIncrement() == 0) {
                this.c();
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.internal.operators.flowable.k1$c
        void e() {
            if(this.g.getAndIncrement() == 0) {
                while(true) {
                    boolean z = this.h;
                    this.c();
                    if(z) {
                        this.a.onComplete();
                        return;
                    }
                    if(this.g.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }
    }

    static final class b extends c {
        private static final long g = 0xD5F42546ACF217D7L;

        b(d d0, org.reactivestreams.c c0) {
            super(d0, c0);
        }

        @Override  // io.reactivex.internal.operators.flowable.k1$c
        void b() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.internal.operators.flowable.k1$c
        void e() {
            this.c();
        }
    }

    static abstract class c extends AtomicReference implements q, e {
        final d a;
        final org.reactivestreams.c b;
        final AtomicLong c;
        final AtomicReference d;
        e e;
        private static final long f = 0xCF2EF70693764EADL;

        c(d d0, org.reactivestreams.c c0) {
            this.c = new AtomicLong();
            this.d = new AtomicReference();
            this.a = d0;
            this.b = c0;
        }

        public void a() {
            this.e.cancel();
            this.b();
        }

        abstract void b();

        void c() {
            Object object0 = this.getAndSet(null);
            if(object0 != null) {
                if(this.c.get() != 0L) {
                    this.a.onNext(object0);
                    io.reactivex.internal.util.d.e(this.c, 1L);
                    return;
                }
                this.cancel();
                io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Couldn\'t emit value due to lack of requests!");
                this.a.onError(c0);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this.d);
            this.e.cancel();
        }

        public void d(Throwable throwable0) {
            this.e.cancel();
            this.a.onError(throwable0);
        }

        abstract void e();

        void f(e e0) {
            j.i(this.d, e0, 0x7FFFFFFFFFFFFFFFL);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.e, e0)) {
                this.e = e0;
                this.a.g(this);
                if(this.d.get() == null) {
                    io.reactivex.internal.operators.flowable.k1.d k1$d0 = new io.reactivex.internal.operators.flowable.k1.d(this);
                    this.b.e(k1$d0);
                    e0.request(0x7FFFFFFFFFFFFFFFL);
                }
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            j.a(this.d);
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            j.a(this.d);
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.lazySet(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.c, v);
            }
        }
    }

    static final class io.reactivex.internal.operators.flowable.k1.d implements q {
        final c a;

        io.reactivex.internal.operators.flowable.k1.d(c k1$c0) {
            this.a = k1$c0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            this.a.f(e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.a();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.d(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.e();
        }
    }

    final org.reactivestreams.c b;
    final org.reactivestreams.c c;
    final boolean d;

    public k1(org.reactivestreams.c c0, org.reactivestreams.c c1, boolean z) {
        this.b = c0;
        this.c = c1;
        this.d = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.subscribers.e e0 = new io.reactivex.subscribers.e(d0);
        if(this.d) {
            a k1$a0 = new a(e0, this.c);
            this.b.e(k1$a0);
            return;
        }
        b k1$b0 = new b(e0, this.c);
        this.b.e(k1$b0);
    }
}

