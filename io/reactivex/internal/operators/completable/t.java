package io.reactivex.internal.operators.completable;

import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import org.reactivestreams.e;

public final class t extends c {
    static final class a implements io.reactivex.disposables.c, q {
        final f a;
        e b;

        a(f f0) {
            this.a = f0;
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
        }
    }

    final org.reactivestreams.c a;

    public t(org.reactivestreams.c c0) {
        this.a = c0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a t$a0 = new a(f0);
        this.a.e(t$a0);
    }
}

