package io.reactivex.internal.operators.maybe;

import io.reactivex.J;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class l extends a {
    static final class io.reactivex.internal.operators.maybe.l.a extends AtomicReference implements c, v, Runnable {
        final v a;
        final long b;
        final TimeUnit c;
        final J d;
        Object e;
        Throwable f;
        private static final long g = 5566860102500855068L;

        io.reactivex.internal.operators.maybe.l.a(v v0, long v1, TimeUnit timeUnit0, J j0) {
            this.a = v0;
            this.b = v1;
            this.c = timeUnit0;
            this.d = j0;
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

        void c() {
            d.d(this, this.d.g(this, this.b, this.c));
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            d.b(this);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.c();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.f = throwable0;
            this.c();
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.e = object0;
            this.c();
        }

        @Override
        public void run() {
            Throwable throwable0 = this.f;
            if(throwable0 != null) {
                this.a.onError(throwable0);
                return;
            }
            Object object0 = this.e;
            if(object0 != null) {
                this.a.onSuccess(object0);
                return;
            }
            this.a.onComplete();
        }
    }

    final long b;
    final TimeUnit c;
    final J d;

    public l(y y0, long v, TimeUnit timeUnit0, J j0) {
        super(y0);
        this.b = v;
        this.c = timeUnit0;
        this.d = j0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.l.a l$a0 = new io.reactivex.internal.operators.maybe.l.a(v0, this.b, this.c, this.d);
        this.a.a(l$a0);
    }
}

