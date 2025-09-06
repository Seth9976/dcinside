package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class A extends a {
    static final class io.reactivex.internal.operators.flowable.A.a extends AtomicReference implements f, q, e {
        final d a;
        e b;
        i c;
        boolean d;
        private static final long e = 0x9A0C6557FB0641AFL;

        io.reactivex.internal.operators.flowable.A.a(d d0, i i0) {
            this.a = d0;
            this.c = i0;
        }

        @Override  // io.reactivex.f
        public void b(c c0) {
            io.reactivex.internal.disposables.d.g(this, c0);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.b.cancel();
            io.reactivex.internal.disposables.d.b(this);
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.a.g(this);
            }
        }

        @Override  // io.reactivex.f, org.reactivestreams.d
        public void onComplete() {
            if(this.d) {
                this.a.onComplete();
                return;
            }
            this.d = true;
            this.b = j.a;
            i i0 = this.c;
            this.c = null;
            i0.e(this);
        }

        @Override  // io.reactivex.f, org.reactivestreams.d
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

    final i c;

    public A(l l0, i i0) {
        super(l0);
        this.c = i0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        io.reactivex.internal.operators.flowable.A.a a$a0 = new io.reactivex.internal.operators.flowable.A.a(d0, this.c);
        this.b.l6(a$a0);
    }
}

