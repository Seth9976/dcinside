package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.NoSuchElementException;

public final class h1 extends K {
    static final class a implements I, c {
        final N a;
        final Object b;
        c c;
        Object d;
        boolean e;

        a(N n0, Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c.a();
        }

        @Override  // io.reactivex.I
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

        @Override  // io.reactivex.I
        public void onComplete() {
            if(this.e) {
                return;
            }
            this.e = true;
            Object object0 = this.d;
            this.d = null;
            if(object0 == null) {
                object0 = this.b;
            }
            if(object0 != null) {
                this.a.onSuccess(object0);
                return;
            }
            NoSuchElementException noSuchElementException0 = new NoSuchElementException();
            this.a.onError(noSuchElementException0);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            if(this.e) {
                io.reactivex.plugins.a.Y(throwable0);
                return;
            }
            this.e = true;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.e) {
                return;
            }
            if(this.d != null) {
                this.e = true;
                this.c.dispose();
                IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("Sequence contains more than one element!");
                this.a.onError(illegalArgumentException0);
                return;
            }
            this.d = object0;
        }
    }

    final G a;
    final Object b;

    public h1(G g0, Object object0) {
        this.a = g0;
        this.b = object0;
    }

    @Override  // io.reactivex.K
    public void c1(N n0) {
        a h1$a0 = new a(n0, this.b);
        this.a.d(h1$a0);
    }
}

