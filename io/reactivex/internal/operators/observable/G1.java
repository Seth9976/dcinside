package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import io.reactivex.s;
import io.reactivex.v;

public final class g1 extends s {
    static final class a implements I, c {
        final v a;
        c b;
        Object c;
        boolean d;

        a(v v0) {
            this.a = v0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.b.a();
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
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.d) {
                return;
            }
            this.d = true;
            Object object0 = this.c;
            this.c = null;
            if(object0 == null) {
                this.a.onComplete();
                return;
            }
            this.a.onSuccess(object0);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.d) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.d = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.d) {
                return;
            }
            if(this.c != null) {
                this.d = true;
                this.b.dispose();
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                this.a.onError(illegalArgumentException0);
                return;
            }
            this.c = object0;
        }
    }

    final G a;

    public g1(G g0) {
        this.a = g0;
    }

    @Override  // io.reactivex.s
    public void r1(v v0) {
        a g1$a0 = new a(v0);
        this.a.d(g1$a0);
    }
}

