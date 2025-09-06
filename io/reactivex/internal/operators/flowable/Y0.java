package io.reactivex.internal.operators.flowable;

import io.reactivex.disposables.c;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.s;
import io.reactivex.v;
import org.reactivestreams.e;

public final class y0 extends s {
    static final class a implements c, q {
        final v a;
        e b;
        Object c;

        a(v v0) {
            this.a = v0;
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
            this.b = j.a;
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.a.onSuccess(object0);
                return;
            }
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.b = j.a;
            this.c = null;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
            this.c = object0;
        }
    }

    final org.reactivestreams.c a;

    public y0(org.reactivestreams.c c0) {
        this.a = c0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a y0$a0 = new a(v0);
        this.a.e(y0$a0);
    }
}

