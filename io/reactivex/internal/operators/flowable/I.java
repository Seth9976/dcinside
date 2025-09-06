package io.reactivex.internal.operators.flowable;

import e3.r;
import io.reactivex.exceptions.b;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class i extends a {
    static final class io.reactivex.internal.operators.flowable.i.a extends f implements q {
        final r m;
        e n;
        boolean o;
        private static final long p = 0xDFECC81CD1BA4A8BL;

        io.reactivex.internal.operators.flowable.i.a(d d0, r r0) {
            super(d0);
            this.m = r0;
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            super.cancel();
            this.n.cancel();
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.n, e0)) {
                this.n = e0;
                this.b.g(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
            }
        }

        @Override  // org.reactivestreams.d
        public void onComplete() {
            if(!this.o) {
                this.o = true;
                this.a(Boolean.FALSE);
            }
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            if(this.o) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.o = true;
            this.b.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            if(this.o) {
                return;
            }
            try {
                if(this.m.test(object0)) {
                    goto label_9;
                }
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.n.cancel();
                this.onError(throwable0);
            }
            return;
        label_9:
            this.o = true;
            this.n.cancel();
            this.a(Boolean.TRUE);
        }
    }

    final r c;

    public i(l l0, r r0) {
        super(l0);
        this.c = r0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.i.a i$a0 = new io.reactivex.internal.operators.flowable.i.a(d0, this.c);
        this.b.l6(i$a0);
    }
}

