package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class v1 extends a {
    static final class io.reactivex.internal.operators.flowable.v1.a implements q, e {
        final d a;
        long b;
        e c;

        io.reactivex.internal.operators.flowable.v1.a(d d0, long v) {
            this.a = d0;
            this.b = v;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.c.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.c, e0)) {
                long v = this.b;
                this.c = e0;
                this.a.g(this);
                e0.request(v);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            long v = this.b;
            if(v != 0L) {
                this.b = v - 1L;
                return;
            }
            this.a.onNext(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.c.request(v);
        }
    }

    final long c;

    public v1(l l0, long v) {
        super(l0);
        this.c = v;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.v1.a v1$a0 = new io.reactivex.internal.operators.flowable.v1.a(d0, this.c);
        this.b.l6(v1$a0);
    }
}

