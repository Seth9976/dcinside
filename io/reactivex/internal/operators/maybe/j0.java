package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.j;
import io.reactivex.q;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

public final class j0 extends a {
    static final class io.reactivex.internal.operators.maybe.j0.a extends AtomicReference implements c, v {
        static final class io.reactivex.internal.operators.maybe.j0.a.a extends AtomicReference implements q {
            final io.reactivex.internal.operators.maybe.j0.a a;
            private static final long b = 0xEE6E1E214F1C3D15L;

            io.reactivex.internal.operators.maybe.j0.a.a(io.reactivex.internal.operators.maybe.j0.a j0$a0) {
                this.a = j0$a0;
            }

            @Override  // io.reactivex.q
            public void g(e e0) {
                j.i(this, e0, 0x7FFFFFFFFFFFFFFFL);
            }

            @Override  // org.reactivestreams.d
            public void onComplete() {
                this.a.c();
            }

            @Override  // org.reactivestreams.d
            public void onError(Throwable throwable0) {
                this.a.d(throwable0);
            }

            @Override  // org.reactivestreams.d
            public void onNext(Object object0) {
                j.a(this);
                this.a.c();
            }
        }

        final v a;
        final io.reactivex.internal.operators.maybe.j0.a.a b;
        private static final long c = 0xE1A4B77FFCDB68EFL;

        io.reactivex.internal.operators.maybe.j0.a(v v0) {
            this.a = v0;
            this.b = new io.reactivex.internal.operators.maybe.j0.a.a(this);
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
            j.a(this.b);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            j.a(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onComplete();
            }
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            j.a(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onError(throwable0);
                return;
            }
            io.reactivex.plugins.a.Y(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            j.a(this.b);
            if(this.getAndSet(d.a) != d.a) {
                this.a.onSuccess(object0);
            }
        }
    }

    final org.reactivestreams.c b;

    public j0(y y0, org.reactivestreams.c c0) {
        super(y0);
        this.b = c0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.j0.a j0$a0 = new io.reactivex.internal.operators.maybe.j0.a(v0);
        v0.b(j0$a0);
        this.b.e(j0$a0.b);
        this.a.a(j0$a0);
    }
}

