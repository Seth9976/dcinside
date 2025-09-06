package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.f;
import io.reactivex.i;
import io.reactivex.internal.disposables.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class o extends s {
    static final class a implements v {
        final AtomicReference a;
        final v b;

        a(AtomicReference atomicReference0, v v0) {
            this.a = atomicReference0;
            this.b = v0;
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.d(this.a, c0);
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
            this.b.onSuccess(object0);
        }
    }

    static final class b extends AtomicReference implements c, f {
        final v a;
        final y b;
        private static final long c = 0x9C3039C7940AB61L;

        b(v v0, y y0) {
            this.a = v0;
            this.b = y0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.f
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.f
        public void onComplete() {
            a o$a0 = new a(this, this.a);
            this.b.a(o$a0);
        }

        @Override  // io.reactivex.f
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }
    }

    final y a;
    final i b;

    public o(y y0, i i0) {
        this.a = y0;
        this.b = i0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        b o$b0 = new b(v0, this.a);
        this.b.e(o$b0);
    }
}

