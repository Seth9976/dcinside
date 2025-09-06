package io.reactivex.internal.operators.flowable;

import f3.b;
import io.reactivex.c;
import io.reactivex.f;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.l;
import io.reactivex.q;
import org.reactivestreams.e;

public final class s0 extends c implements b {
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
            this.b = j.a;
            this.a.onComplete();
        }

        @Override  // org.reactivestreams.d
        public void onError(Throwable throwable0) {
            this.b = j.a;
            this.a.onError(throwable0);
        }

        @Override  // org.reactivestreams.d
        public void onNext(Object object0) {
        }
    }

    final l a;

    public s0(l l0) {
        this.a = l0;
    }

    @Override  // io.reactivex.c
    protected void J0(f f0) {
        a s0$a0 = new a(f0);
        this.a.l6(s0$a0);
    }

    @Override  // f3.b
    public l d() {
        return io.reactivex.plugins.a.P(new r0(this.a));
    }
}

