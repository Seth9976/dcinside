package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class q0 extends a {
    static final class io.reactivex.internal.operators.flowable.q0.a implements q, e {
        final d a;
        e b;

        io.reactivex.internal.operators.flowable.q0.a(d d0) {
            this.a = d0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.b.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.a.g(this);
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
            this.a.onNext(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.b.request(v);
        }
    }

    public q0(l l0) {
        super(l0);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.q0.a q0$a0 = new io.reactivex.internal.operators.flowable.q0.a(d0);
        this.b.l6(q0$a0);
    }
}

