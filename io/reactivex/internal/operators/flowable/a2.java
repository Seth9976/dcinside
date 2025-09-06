package io.reactivex.internal.operators.flowable;

import e3.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class a2 extends a {
    final class io.reactivex.internal.operators.flowable.a2.a implements q {
        private final b a;
        final a2 b;

        io.reactivex.internal.operators.flowable.a2.a(b a2$b0) {
            this.a = a2$b0;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(this.a.b(e0)) {
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.a(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.a.lazySet(object0);
        }
    }

    static final class b extends AtomicReference implements f3.a, e {
        final d a;
        final c b;
        final AtomicReference c;
        final AtomicLong d;
        final AtomicReference e;
        private static final long f = -312246233408980075L;

        b(d d0, c c0) {
            this.c = new AtomicReference();
            this.d = new AtomicLong();
            this.e = new AtomicReference();
            this.a = d0;
            this.b = c0;
        }

        public void a(Throwable throwable0) {
            j.a(this.c);
            this.a.onError(throwable0);
        }

        public boolean b(e e0) {
            return j.h(this.e, e0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            j.a(this.c);
            j.a(this.e);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            j.c(this.c, this.d, e0);
        }

        @Override  // f3.a
        public boolean m(Object object0) {
            Object object2;
            Object object1 = this.get();
            if(object1 != null) {
                try {
                    object2 = io.reactivex.internal.functions.b.g(this.b.apply(object0, object1), "The combiner returned a null value");
                }
                catch(Throwable throwable0) {
                    io.reactivex.exceptions.b.b(throwable0);
                    this.cancel();
                    this.a.onError(throwable0);
                    return false;
                }
                this.a.onNext(object2);
                return true;
            }
            return false;
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            j.a(this.e);
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            j.a(this.e);
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(!this.m(object0)) {
                ((e)this.c.get()).request(1L);
            }
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            j.b(this.c, this.d, v);
        }
    }

    final c c;
    final org.reactivestreams.c d;

    public a2(l l0, c c0, org.reactivestreams.c c1) {
        super(l0);
        this.c = c0;
        this.d = c1;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.subscribers.e e0 = new io.reactivex.subscribers.e(d0);
        b a2$b0 = new b(e0, this.c);
        e0.g(a2$b0);
        io.reactivex.internal.operators.flowable.a2.a a2$a0 = new io.reactivex.internal.operators.flowable.a2.a(this, a2$b0);
        this.d.e(a2$a0);
        this.b.l6(a2$b0);
    }
}

