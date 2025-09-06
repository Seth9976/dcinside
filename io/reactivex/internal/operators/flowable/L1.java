package io.reactivex.internal.operators.flowable;

import io.reactivex.J;
import io.reactivex.internal.disposables.h;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class l1 extends a {
    static final class io.reactivex.internal.operators.flowable.l1.a extends c {
        final AtomicInteger i;
        private static final long j = 0x9CE9A3CC07000B6DL;

        io.reactivex.internal.operators.flowable.l1.a(d d0, long v, TimeUnit timeUnit0, J j0) {
            super(d0, v, timeUnit0, j0);
            this.i = new AtomicInteger(1);
        }

        @Override  // io.reactivex.internal.operators.flowable.l1$c
        void b() {
            this.c();
            if(this.i.decrementAndGet() == 0) {
                this.a.onComplete();
            }
        }

        @Override
        public void run() {
            if(this.i.incrementAndGet() == 2) {
                this.c();
                if(this.i.decrementAndGet() == 0) {
                    this.a.onComplete();
                }
            }
        }
    }

    static final class b extends c {
        private static final long i = 0x9CE9A3CC07000B6DL;

        b(d d0, long v, TimeUnit timeUnit0, J j0) {
            super(d0, v, timeUnit0, j0);
        }

        @Override  // io.reactivex.internal.operators.flowable.l1$c
        void b() {
            this.a.onComplete();
        }

        @Override
        public void run() {
            this.c();
        }
    }

    static abstract class c extends AtomicReference implements q, Runnable, e {
        final d a;
        final long b;
        final TimeUnit c;
        final J d;
        final AtomicLong e;
        final h f;
        e g;
        private static final long h = 0xCF2EF70693764EADL;

        c(d d0, long v, TimeUnit timeUnit0, J j0) {
            this.e = new AtomicLong();
            this.f = new h();
            this.a = d0;
            this.b = v;
            this.c = timeUnit0;
            this.d = j0;
        }

        void a() {
            io.reactivex.internal.disposables.d.b(this.f);
        }

        abstract void b();

        void c() {
            Object object0 = this.getAndSet(null);
            if(object0 != null) {
                if(this.e.get() != 0L) {
                    this.a.onNext(object0);
                    io.reactivex.internal.util.d.e(this.e, 1L);
                    return;
                }
                this.cancel();
                io.reactivex.exceptions.c c0 = new io.reactivex.exceptions.c("Couldn\'t emit value due to lack of requests!");
                this.a.onError(c0);
            }
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.a();
            this.g.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.g, e0)) {
                this.g = e0;
                this.a.g(this);
                io.reactivex.disposables.c c0 = this.d.h(this, this.b, this.b, this.c);
                this.f.b(c0);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a();
            this.b();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a();
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.lazySet(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            if(j.j(v)) {
                io.reactivex.internal.util.d.a(this.e, v);
            }
        }
    }

    final long c;
    final TimeUnit d;
    final J e;
    final boolean f;

    public l1(l l0, long v, TimeUnit timeUnit0, J j0, boolean z) {
        super(l0);
        this.c = v;
        this.d = timeUnit0;
        this.e = j0;
        this.f = z;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.subscribers.e e0 = new io.reactivex.subscribers.e(d0);
        if(this.f) {
            io.reactivex.internal.operators.flowable.l1.a l1$a0 = new io.reactivex.internal.operators.flowable.l1.a(e0, this.c, this.d, this.e);
            this.b.l6(l1$a0);
            return;
        }
        b l1$b0 = new b(e0, this.c, this.d, this.e);
        this.b.l6(l1$b0);
    }
}

