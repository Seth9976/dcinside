package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.K;
import io.reactivex.N;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.NoSuchElementException;

public final class v0 extends K {
    static final class a implements I, c {
        final N a;
        final Object b;
        c c;
        Object d;

        a(N n0, Object object0) {
            this.a = n0;
            this.b = object0;
        }

        @Override  // io.reactivex.disposables.c
        public boolean a() {
            return this.c == d.a;
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
            this.c = d.a;
        }

        @Override  // io.reactivex.I
        public void onComplete() {
            this.c = d.a;
            Object object0 = this.d;
            if(object0 != null) {
                this.d = null;
                this.a.onSuccess(object0);
                return;
            }
            Object object1 = this.b;
            if(object1 != null) {
                this.a.onSuccess(object1);
                return;
            }
            NoSuchElementException noSuchElementException0 = new NoSuchElementException();
            this.a.onError(noSuchElementException0);
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.c = d.a;
            this.d = null;
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            this.d = object0;
        }
    }

    final G a;
    final Object b;

    public v0(G g0, Object object0) {
        this.a = g0;
        this.b = object0;
    }

    @Override  // io.reactivex.K
    protected void c1(N n0) {
        a v0$a0 = new a(n0, this.b);
        this.a.d(v0$a0);
    }
}

