package io.reactivex.internal.operators.flowable;

import d3.g;
import f3.l;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class r0 extends a {
    static final class io.reactivex.internal.operators.flowable.r0.a implements l, q {
        final d a;
        e b;

        io.reactivex.internal.operators.flowable.r0.a(d d0) {
            this.a = d0;
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.b.cancel();
        }

        @Override  // f3.o
        public void clear() {
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.a.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // f3.k
        public int i(int v) {
            return v & 2;
        }

        @Override  // f3.o
        public boolean isEmpty() {
            return true;
        }

        @Override  // f3.o
        public boolean j(Object object0, Object object1) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override  // f3.o
        public boolean offer(Object object0) {
            throw new UnsupportedOperationException("Should not be called!");
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
        }

        @Override  // f3.o
        @g
        public Object poll() {
            return null;
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
        }
    }

    public r0(io.reactivex.l l0) {
        super(l0);
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.r0.a r0$a0 = new io.reactivex.internal.operators.flowable.r0.a(d0);
        this.b.l6(r0$a0);
    }
}

