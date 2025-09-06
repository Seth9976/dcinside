package io.reactivex.internal.operators.maybe;

import e3.r;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;

public final class y extends a {
    static final class io.reactivex.internal.operators.maybe.y.a implements c, v {
        final v a;
        final r b;
        c c;

        io.reactivex.internal.operators.maybe.y.a(v v0, r r0) {
            this.a = v0;
            this.b = r0;
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
            c c0 = this.c;
            this.c = d.a;
            c0.dispose();
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
            try {
                if(this.b.test(object0)) {
                    goto label_6;
                }
                goto label_8;
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
        label_6:
            this.a.onSuccess(object0);
            return;
        label_8:
            this.a.onComplete();
        }
    }

    final r b;

    public y(io.reactivex.y y0, r r0) {
        super(y0);
        this.b = r0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.y.a y$a0 = new io.reactivex.internal.operators.maybe.y.a(v0, this.b);
        this.a.a(y$a0);
    }
}

