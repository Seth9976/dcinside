package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.atomic.AtomicInteger;

public final class r extends a {
    static final class io.reactivex.internal.operators.maybe.r.a extends AtomicInteger implements c, v {
        final v a;
        final e3.a b;
        c c;
        private static final long d = 0x3907BA0B13897E3DL;

        io.reactivex.internal.operators.maybe.r.a(v v0, e3.a a0) {
            this.a = v0;
            this.b = a0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                this.c = c0;
                this.a.b(this);
            }
        }

        void c() {
            if(this.compareAndSet(0, 1)) {
                try {
                    this.b.run();
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    io.reactivex.plugins.a.Y(throwable0);
                }
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
            this.c();
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.onComplete();
            this.c();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
            this.c();
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
            this.c();
        }
    }

    final e3.a b;

    public r(y y0, e3.a a0) {
        super(y0);
        this.b = a0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.r.a r$a0 = new io.reactivex.internal.operators.maybe.r.a(v0, this.b);
        this.a.a(r$a0);
    }
}

