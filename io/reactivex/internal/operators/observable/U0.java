package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.s;
import io.reactivex.v;

public final class u0 extends s {
    static final class a implements I, c {
        final v a;
        c b;
        Object c;

        a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b == d.a;
        }

        @Override  // io.reactivex.I
        public void b(c c0) {
            if(d.i(this.b, c0)) {
                this.b = c0;
                this.a.b(this);
            }
        }

        @Override  // io.reactivex.disposables.c
        public void dispose() {
            this.b.dispose();
            this.b = d.a;
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.b = d.a;
            Object object0 = this.c;
            if(object0 != null) {
                this.c = null;
                this.a.onSuccess(object0);
                return;
            }
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.b = d.a;
            this.c = null;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.c = object0;
        }
    }

    final G a;

    public u0(G g0) {
        this.a = g0;
    }

    @Override  // io.reactivex.s
    protected void r1(v v0) {
        a u0$a0 = new a(v0);
        this.a.d(u0$a0);
    }
}

