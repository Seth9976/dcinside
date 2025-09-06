package io.reactivex.internal.operators.flowable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.l;
import org.reactivestreams.d;
import org.reactivestreams.e;

public final class l0 extends l {
    static final class a implements I, e {
        final d a;
        c b;

        a(d d0) {
            this.a = d0;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            this.b = c0;
            this.a.g(this);
        }

        @Override  // org.reactivestreams.e
        public void cancel() {
            this.b.dispose();
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.a.onNext(object0);
        }

        @Override  // org.reactivestreams.e
        public void request(long v) {
        }
    }

    private final B b;

    public l0(B b0) {
        this.b = b0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a l0$a0 = new a(d0);
        this.b.d(l0$a0);
    }
}

