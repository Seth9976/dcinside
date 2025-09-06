package io.reactivex.internal.operators.maybe;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicReference;

public final class a0 extends a {
    static final class io.reactivex.internal.operators.maybe.a0.a extends AtomicReference implements c, v, Runnable {
        final v a;
        final J b;
        Object c;
        Throwable d;
        private static final long e = 0x76F356C87EBDA749L;

        io.reactivex.internal.operators.maybe.a0.a(v v0, J j0) {
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
            d.b(this);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            d.d(this, this.b.f(this));
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.d = throwable0;
            d.d(this, this.b.f(this));
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.c = object0;
            d.d(this, this.b.f(this));
        }

        @Override
        public void run() {
            Throwable throwable0 = this.d;
            if(throwable0 != null) {
                this.d = null;
                this.a.onError(throwable0);
                return;
            }
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.a.onSuccess(object0);
                return;
            }
            this.a.onComplete();
        }
    }

    final J b;

    public a0(y y0, J j0) {
        super(y0);
        this.b = j0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.a0.a a0$a0 = new io.reactivex.internal.operators.maybe.a0.a(v0, this.b);
        this.a.a(a0$a0);
    }
}

