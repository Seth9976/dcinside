package io.reactivex.internal.operators.maybe;

import e3.g;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;

public final class q extends a {
    static final class io.reactivex.internal.operators.maybe.q.a implements c, v {
        final v a;
        final g b;
        c c;

        io.reactivex.internal.operators.maybe.q.a(v v0, g g0) {
            this.a = v0;
            this.b = g0;
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

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.c.dispose();
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
            try {
                this.b.accept(object0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }
    }

    final g b;

    public q(y y0, g g0) {
        super(y0);
        this.b = g0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.q.a q$a0 = new io.reactivex.internal.operators.maybe.q.a(v0, this.b);
        this.a.a(q$a0);
    }
}

