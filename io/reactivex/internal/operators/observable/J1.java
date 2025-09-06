package io.reactivex.internal.operators.observable;

import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.d;
import java.util.ArrayDeque;

public final class j1 extends a {
    static final class io.reactivex.internal.operators.observable.j1.a extends ArrayDeque implements I, c {
        final I a;
        final int b;
        c c;
        private static final long d = 0xCB291257BC42536BL;

        io.reactivex.internal.operators.observable.j1.a(I i0, int v) {
            super(v);
            this.a = i0;
            this.b = v;
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
            this.a.onComplete();
        }

        @Override  // io.reactivex.I
        public void onError(Throwable throwable0) {
            this.a.onError(throwable0);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            if(this.b == this.size()) {
                Object object1 = this.poll();
                this.a.onNext(object1);
            }
            this.offer(object0);
        }
    }

    final int b;

    public j1(G g0, int v) {
        super(g0);
        this.b = v;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.j1.a j1$a0 = new io.reactivex.internal.operators.observable.j1.a(i0, this.b);
        this.a.d(j1$a0);
    }
}

