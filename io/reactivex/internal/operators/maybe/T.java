package io.reactivex.internal.operators.maybe;

import io.reactivex.disposables.c;
import io.reactivex.exceptions.b;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

public final class t extends s {
    final class a implements v {
        final v a;
        final t b;

        a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.v
        public void b(c c0) {
            this.a.b(c0);
        }

        @Override  // io.reactivex.v
        public void onComplete() {
            try {
                t.this.b.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.v
        public void onError(Throwable throwable0) {
            try {
                t.this.b.run();
            }
            catch(Throwable throwable1) {
                b.b(throwable1);
                throwable0 = new io.reactivex.exceptions.a(new Throwable[]{throwable0, throwable1});
            }
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.v
        public void onSuccess(Object object0) {
            try {
                t.this.b.run();
            }
            catch(Throwable throwable0) {
                b.b(throwable0);
                this.a.onError(throwable0);
                return;
            }
            this.a.onSuccess(object0);
        }
    }

    final y a;
    final e3.a b;

    public t(y y0, e3.a a0) {
        this.a = y0;
        this.b = a0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a t$a0 = new a(this, v0);
        this.a.a(t$a0);
    }
}

