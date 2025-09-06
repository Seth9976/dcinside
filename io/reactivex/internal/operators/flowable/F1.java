package io.reactivex.internal.operators.flowable;

import e3.o;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.subscriptions.i;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.processors.h;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class f1 extends a {
    static final class io.reactivex.internal.operators.flowable.f1.a extends c {
        private static final long o = -2680129890138081029L;

        io.reactivex.internal.operators.flowable.f1.a(d d0, io.reactivex.processors.c c0, e e0) {
            super(d0, c0, e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.j(0);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.l.cancel();
            this.j.onError(throwable0);
        }
    }

    static final class b extends AtomicInteger implements q, e {
        final org.reactivestreams.c a;
        final AtomicReference b;
        final AtomicLong c;
        c d;
        private static final long e = 2827772011130406689L;

        b(org.reactivestreams.c c0) {
            this.a = c0;
            this.b = new AtomicReference();
            this.c = new AtomicLong();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this.b);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.c(this.b, this.c, e0);
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.d.cancel();
            this.d.j.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.d.cancel();
            this.d.j.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.getAndIncrement() == 0) {
                while(true) {
                    if(this.b.get() == j.a) {
                        return;
                    }
                    this.a.e(this.d);
                    if(this.decrementAndGet() == 0) {
                        break;
                    }
                }
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this.b, this.c, v);
        }
    }

    static abstract class c extends i implements q {
        protected final d j;
        protected final io.reactivex.processors.c k;
        protected final e l;
        private long m;
        private static final long n = 0xB238610D1F2E94C0L;

        c(d d0, io.reactivex.processors.c c0, e e0) {
            super(false);
            this.j = d0;
            this.k = c0;
            this.l = e0;
        }

        @Override  // io.reactivex.internal.subscriptions.i
        public final void cancel() {
            super.cancel();
            this.l.cancel();
        }

        @Override  // io.reactivex.q
        public final void g(e e0) {
            this.i(e0);
        }

        protected final void j(Object object0) {
            this.i(g.a);
            long v = this.m;
            if(v != 0L) {
                this.m = 0L;
                this.h(v);
            }
            this.l.request(1L);
            this.k.onNext(object0);
        }

        @Override  // org.reactivestreams.d
        public final void onNext(Object object0) {
            ++this.m;
            this.j.onNext(object0);
        }
    }

    final o c;

    public f1(l l0, o o0) {
        super(l0);
        this.c = o0;
    }

    @Override  // io.reactivex.l
    public void m6(d d0) {
        org.reactivestreams.c c1;
        io.reactivex.subscribers.e e0 = new io.reactivex.subscribers.e(d0);
        io.reactivex.processors.c c0 = h.V8(8).S8();
        try {
            c1 = (org.reactivestreams.c)io.reactivex.internal.functions.b.g(this.c.apply(c0), "handler returned a null Publisher");
        }
        catch(Throwable throwable0) {
            io.reactivex.exceptions.b.b(throwable0);
            g.b(throwable0, d0);
            return;
        }
        b f1$b0 = new b(this.b);
        io.reactivex.internal.operators.flowable.f1.a f1$a0 = new io.reactivex.internal.operators.flowable.f1.a(e0, c0, f1$b0);
        f1$b0.d = f1$a0;
        d0.g(f1$a0);
        c1.e(f1$b0);
        f1$b0.onNext(0);
    }
}

