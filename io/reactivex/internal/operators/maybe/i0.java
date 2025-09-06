package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class i0 extends a {
    static final class io.reactivex.internal.operators.maybe.i0.a extends AtomicReference implements c, v {
        static final class io.reactivex.internal.operators.maybe.i0.a.a extends AtomicReference implements v {
            final io.reactivex.internal.operators.maybe.i0.a a;
            private static final long b = 0xEE6E1E214F1C3D15L;

            io.reactivex.internal.operators.maybe.i0.a.a(io.reactivex.internal.operators.maybe.i0.a i0$a0) {
                this.a = i0$a0;
            }

            @Override  // io.reactivex.v
            public void b(c c0) {
                d.g(this, c0);
            }

            @Override  // io.reactivex.v
            public void onComplete() {
                this.a.c();
            }

            @Override  // io.reactivex.v
            public void onError(Throwable throwable0) {
                this.a.d(throwable0);
            }

            @Override  // io.reactivex.v
            public void onSuccess(Object object0) {
                this.a.c();
            }
        }

        final v a;
        final io.reactivex.internal.operators.maybe.i0.a.a b;
        private static final long c = 0xE1A4B77FFCDB68EFL;

        io.reactivex.internal.operators.maybe.i0.a(v v0) {
            this.a = v0;
            this.b = new io.reactivex.internal.operators.maybe.i0.a.a(this);
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.g(this, c0);
        }

        void c() {
            if(d.b(this)) {
                this.a.onComplete();
            }
        }

        void d(Throwable throwable0) {
            if(d.b(this)) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
            d.b(this.b);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            d.b(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            d.b(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            d.b(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onSuccess(object0);
            }
        }
    }

    final y b;

    public i0(y y0, y y1) {
        super(y0);
        this.b = y1;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.i0.a i0$a0 = new io.reactivex.internal.operators.maybe.i0.a(v0);
        v0.b(i0$a0);
        this.b.a(i0$a0.b);
        this.a.a(i0$a0);
    }
}

