package io.reactivex.internal.operators.maybe;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.h;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class f0 extends a {
    static final class io.reactivex.internal.operators.maybe.f0.a extends AtomicReference implements c, v {
        final h a;
        final v b;
        private static final long c = 0x76F356C87EBDA749L;

        io.reactivex.internal.operators.maybe.f0.a(v v0) {
            this.b = v0;
            this.a = new h();
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return d.c(((c)this.get()));
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            d.g(this, c0);
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
            this.a.dispose();
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

    static final class b implements Runnable {
        final v a;
        final y b;

        b(v v0, y y0) {
            this.a = v0;
            this.b = y0;
        }

        @Override
        public void run() {
            this.b.a(this.a);
        }
    }

    final J b;

    public f0(y y0, J j0) {
        super(y0);
        this.b = j0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.f0.a f0$a0 = new io.reactivex.internal.operators.maybe.f0.a(v0);
        v0.b(f0$a0);
        b f0$b0 = new b(f0$a0, this.a);
        c c0 = this.b.f(f0$b0);
        f0$a0.a.b(c0);
    }
}

