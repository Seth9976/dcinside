package io.reactivex.internal.operators.maybe;

import e3.r;
import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import io.reactivex.v;
import io.reactivex.y;

public final class b0 extends a {
    static final class io.reactivex.internal.operators.maybe.b0.a implements c, v {
        final v a;
        final r b;
        c c;

        io.reactivex.internal.operators.maybe.b0.a(v v0, r r0) {
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
            this.c.dispose();
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            this.a.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            try {
                if(this.b.test(throwable0)) {
                    goto label_7;
                }
                goto label_9;
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                io.reactivex.exceptions.a a0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
                this.a.onError(a0);
                return;
            }
        label_7:
            this.a.onComplete();
            return;
        label_9:
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            this.a.onSuccess(object0);
        }
    }

    final r b;

    public b0(y y0, r r0) {
        super(y0);
        this.b = r0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        io.reactivex.internal.operators.maybe.b0.a b0$a0 = new io.reactivex.internal.operators.maybe.b0.a(v0, this.b);
        this.a.a(b0$a0);
    }
}

