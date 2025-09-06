package io.reactivex.internal.operators.maybe;

import e3.g;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.v;
import io.reactivex.y;

public final class e0 extends a {
    static final class io.reactivex.internal.operators.maybe.e0.a implements c, v {
        final v a;
        final e0 b;
        c c;

        io.reactivex.internal.operators.maybe.e0.a(v v0, e0 e00) {
            this.a = v0;
            this.b = e00;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            if(d.i(this.c, c0)) {
                try {
                    this.b.b.accept(c0);
                }
                catch(Throwable throwable0) {
                    b.b(throwable0);
                    c0.dispose();
                    this.c = d.a;
                    e.f(throwable0, this.a);
                    return;
                }
                this.c = c0;
                this.a.b(this);
            }
        }

        void c() {
            try {
                this.b.f.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
        }

        void d(Throwable throwable0) {
            try {
                this.b.d.accept(throwable0);
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.c = d.a;
            this.a.onError(throwable0);
            this.c();
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            try {
                this.b.g.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                io.reactivex.plugins.a.Y(throwable0);
            }
            this.c.dispose();
            this.c = d.a;
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            d d0 = d.a;
            if(this.c == d0) {
                return;
            }
            try {
                this.b.e.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.d(throwable0);
                return;
            }
            this.c = d0;
            this.a.onComplete();
            this.c();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            if(this.c == d.a) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            d d0 = d.a;
            if(this.c == d0) {
                return;
            }
            try {
                this.b.c.accept(object0);
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.d(throwable0);
                return;
            }
            this.c = d0;
            this.a.onSuccess(object0);
            this.c();
        }
    }

    final g b;
    final g c;
    final g d;
    final e3.a e;
    final e3.a f;
    final e3.a g;

    public e0(y y0, g g0, g g1, g g2, e3.a a0, e3.a a1, e3.a a2) {
        super(y0);
        this.b = g0;
        this.c = g1;
        this.d = g2;
        this.e = a0;
        this.f = a1;
        this.g = a2;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.e0.a e0$a0 = new io.reactivex.internal.operators.maybe.e0.a(v0, this);
        this.a.a(e0$a0);
    }
}

