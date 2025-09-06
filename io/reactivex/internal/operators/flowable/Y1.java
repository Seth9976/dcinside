package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.util.c;
import io.reactivex.internal.util.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class y1 extends a {
    static final class io.reactivex.internal.operators.flowable.y1.a extends AtomicInteger implements f3.a, e {
        final class io.reactivex.internal.operators.flowable.y1.a.a extends AtomicReference implements q {
            final io.reactivex.internal.operators.flowable.y1.a a;
            private static final long b = 0xB265128CE6E6C03FL;

            @Override  // io.reactivex.q
            public void g(e e0) {
                j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
            }

            @Override  // org.reactivestreams.d
            public void onComplete() {
                io.reactivex.internal.operators.flowable.y1.a.this.f = true;
            }

            @Override  // org.reactivestreams.d
            public void onError(Throwable throwable0) {
                j.a(io.reactivex.internal.operators.flowable.y1.a.this.b);
                l.d(io.reactivex.internal.operators.flowable.y1.a.this.a, throwable0, io.reactivex.internal.operators.flowable.y1.a.this, io.reactivex.internal.operators.flowable.y1.a.this.e);
            }

            @Override  // org.reactivestreams.d
            public void onNext(Object object0) {
                io.reactivex.internal.operators.flowable.y1.a.this.f = true;
                ((e)this.get()).cancel();
            }
        }

        final d a;
        final AtomicReference b;
        final AtomicLong c;
        final io.reactivex.internal.operators.flowable.y1.a.a d;
        final c e;
        volatile boolean f;
        private static final long g = 0xA8F8FDC35C3068E3L;

        io.reactivex.internal.operators.flowable.y1.a(d d0) {
            this.a = d0;
            this.b = new AtomicReference();
            this.c = new AtomicLong();
            this.d = new io.reactivex.internal.operators.flowable.y1.a.a(this);
            this.e = new c();
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this.b);
            j.a(this.d);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.c(this.b, this.c, e0);
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            if(this.f) {
                l.f(this.a, object0, this, this.e);
                return true;
            }
            return false;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            j.a(this.d);
            l.b(this.a, this, this.e);
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            j.a(this.d);
            l.d(this.a, throwable0, this, this.e);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.m(object0)) {
                ((e)this.b.get()).request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this.b, this.c, v);
        }
    }

    final org.reactivestreams.c c;

    public y1(io.reactivex.l l0, org.reactivestreams.c c0) {
        super(l0);
        this.c = c0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.y1.a y1$a0 = new io.reactivex.internal.operators.flowable.y1.a(d0);
        d0.g(y1$a0);
        this.c.e(y1$a0.d);
        this.b.l6(y1$a0);
    }
}

