package io.reactivex.internal.operators.observable;

import io.reactivex.B;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.e;

public final class h0 extends B {
    static final class a implements c, q {
        final I a;
        e b;

        a(I i0) {
            this.a = i0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b == j.a;
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.cancel();
            this.b = j.a;
        }

        @Override  // io.reactivex.q
        public void g(e e0) {
            if(j.k(this.b, e0)) {
                this.b = e0;
                this.a.b(this);
                e0.request(0x7FFFFFFFFFFFFFFFL);
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
    }

    final org.reactivestreams.c a;

    public h0(org.reactivestreams.c c0) {
        this.a = c0;
    }

    @Override  // io.reactivex.B
    protected void I5(I i0) {
        a h0$a0 = new a(i0);
        this.a.e(h0$a0);
    }
}

