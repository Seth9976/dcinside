package io.reactivex.internal.operators.maybe;

import e3.o;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import io.reactivex.y;

public final class d0 extends a {
    static final class io.reactivex.internal.operators.maybe.d0.a implements c, v {
        final v a;
        final o b;
        c c;

        io.reactivex.internal.operators.maybe.d0.a(v v0, o o0) {
            this.a = v0;
            this.b = o0;
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
            Object object0;
            try {
                object0 = b.g(this.b.apply(throwable0), "The valueSupplier returned a null value");
            }
            catch(Throwable throwable1) {
                io.reactivex.exceptions.b.b(throwable1);
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                this.a.onError(a0);
                return;
            }
            this.a.onSuccess(object0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    final o b;

    public d0(y y0, o o0) {
        super(y0);
        this.b = o0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.d0.a d0$a0 = new io.reactivex.internal.operators.maybe.d0.a(v0, this.b);
        this.a.a(d0$a0);
    }
}

