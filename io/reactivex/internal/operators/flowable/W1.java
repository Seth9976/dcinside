package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.ArrayDeque;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class w1 extends a {
    static final class io.reactivex.internal.operators.flowable.w1.a extends ArrayDeque implements q, e {
        final d a;
        final int b;
        e c;
        private static final long d = 0xCB291257BC42536BL;

        io.reactivex.internal.operators.flowable.w1.a(d d0, int v) {
            super(v);
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
                this.c = e0;
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
            if(this.b == this.size()) {
                Object object1 = this.poll();
                this.a.onNext(object1);
            }
            else {
                this.c.request(1L);
            }
            this.offer(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
            this.c.request(v);
        }
    }

    final int c;

    public w1(l l0, int v) {
        super(l0);
        this.c = v;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.w1.a w1$a0 = new io.reactivex.internal.operators.flowable.w1.a(d0, this.c);
        this.b.l6(w1$a0);
    }
}

