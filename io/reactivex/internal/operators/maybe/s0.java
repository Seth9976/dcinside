package io.reactivex.internal.operators.maybe;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class s0 extends a {
    static final class io.reactivex.internal.operators.maybe.s0.a extends AtomicReference implements c, v, Runnable {
        final v a;
        final J b;
        c c;
        private static final long d = 0x2D321DFC37BE109AL;

        io.reactivex.internal.operators.maybe.s0.a(v v0, J j0) {
            this.a = v0;
            this.b = j0;
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
            c c0 = (c)this.getAndSet(d.a);
            if(c0 != d.a) {
                this.c = c0;
                this.b.f(this);
            }
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

        @Override
        public void run() {
            this.c.dispose();
        }
    }

    final J b;

    public s0(y y0, J j0) {
        super(y0);
        this.b = j0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.s0.a s0$a0 = new io.reactivex.internal.operators.maybe.s0.a(v0, this.b);
        this.a.a(s0$a0);
    }
}

