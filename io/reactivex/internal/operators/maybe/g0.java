package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class g0 extends a {
    static final class io.reactivex.internal.operators.maybe.g0.a extends AtomicReference implements c, v {
        static final class io.reactivex.internal.operators.maybe.g0.a.a implements v {
            final v a;
            final AtomicReference b;

            io.reactivex.internal.operators.maybe.g0.a.a(v v0, AtomicReference atomicReference0) {
                this.a = v0;
                this.b = atomicReference0;
            }

            @Override  // io.reactivex.v
            public void b(c c0) {
                d.g(this.b, c0);
            }

            @Override  // io.reactivex.v
            public void onComplete() {
                this.a.onComplete();
            }

            @Override  // io.reactivex.v
            public void onError(Throwable throwable0) {
                this.a.onError(throwable0);
            }

            @Override  // io.reactivex.v
            public void onSuccess(Object object0) {
                this.a.onSuccess(object0);
            }
        }

        final v a;
        final y b;
        private static final long c = 0xE124AF7B0D3A04F8L;

        io.reactivex.internal.operators.maybe.g0.a(v v0, y y0) {
            this.a = v0;
            this.b = y0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.g(this, c0)) {
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            c c0 = (c)this.get();
            if(c0 != d.a && this.compareAndSet(c0, null)) {
                io.reactivex.internal.operators.maybe.g0.a.a g0$a$a0 = new io.reactivex.internal.operators.maybe.g0.a.a(this.a, this);
                this.b.a(g0$a$a0);
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    final y b;

    public g0(y y0, y y1) {
        super(y0);
        this.b = y1;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.g0.a g0$a0 = new io.reactivex.internal.operators.maybe.g0.a(v0, this.b);
        this.a.a(g0$a0);
    }
}

