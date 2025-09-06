package io.reactivex.internal.operators.maybe;

import f3.f;
import io.reactivex.disposables.c;
import io.reactivex.l;
import io.reactivex.v;
import io.reactivex.y;
import org.reactivestreams.d;

public final class n0 extends l implements f {
    static final class a extends io.reactivex.internal.subscriptions.f implements v {
        c m;
        private static final long n = 0x6984808A6F073B2AL;

        a(d d0) {
            super(d0);
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(io.reactivex.internal.disposables.d.i(this.m, c0)) {
                this.m = c0;
                this.b.g(this);
            }
        }

        @Override  // io.reactivex.internal.subscriptions.f
        public void cancel() {
            super.cancel();
            this.m.dispose();
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.b.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.b.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a(object0);
        }
    }

    final y b;

    public n0(y y0) {
        this.b = y0;
    }

    @Override  // io.reactivex.l
    protected void m6(d d0) {
        a n0$a0 = new a(d0);
        this.b.a(n0$a0);
    }

    @Override  // f3.f
    public y source() {
        return this.b;
    }
}

