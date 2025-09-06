package io.reactivex.internal.operators.flowable;

import e3.c;
import io.reactivex.internal.functions.b;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class n1 extends a {
    static final class io.reactivex.internal.operators.flowable.n1.a implements q, e {
        final d a;
        final c b;
        e c;
        Object d;
        boolean e;

        io.reactivex.internal.operators.flowable.n1.a(d d0, c c0) {
            this.a = d0;
            this.b = c0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.c.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                this.c = e0;
                this.a.g(this);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            Object object2;
            if(this.e) {
                return;
            }
            d d0 = this.a;
            Object object1 = this.d;
            if(object1 == null) {
                this.d = object0;
                d0.onNext(object0);
                return;
            }
            try {
                object2 = b.g(this.b.apply(object1, object0), "The value returned by the accumulator is null");
            }
            catch(Throwable throwable0) {
                io.reactivex.exceptions.b.b(throwable0);
                this.c.cancel();
                this.onError(throwable0);
                return;
            }
            this.d = object2;
            d0.onNext(object2);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.c.request(v);
        }
    }

    final c c;

    public n1(l l0, c c0) {
        super(l0);
        this.c = c0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.n1.a n1$a0 = new io.reactivex.internal.operators.flowable.n1.a(d0, this.c);
        this.b.l6(n1$a0);
    }
}

