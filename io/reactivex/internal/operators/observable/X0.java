package io.reactivex.internal.operators.observable;

import d3.g;
import e3.o;
import io.reactivex.G;
import io.reactivex.I;
import io.reactivex.internal.functions.b;

public final class x0 extends a {
    static final class io.reactivex.internal.operators.observable.x0.a extends io.reactivex.internal.observers.a {
        final o f;

        io.reactivex.internal.operators.observable.x0.a(I i0, o o0) {
            super(i0);
            this.f = o0;
        }

        @Override  // f3.k
        public int i(int v) {
            return this.f(v);
        }

        @Override  // io.reactivex.I
        public void onNext(Object object0) {
            Object object1;
            if(this.d) {
                return;
            }
            if(this.e != 0) {
                this.a.onNext(null);
                return;
            }
            try {
                object1 = b.g(this.f.apply(object0), "The mapper function returned a null value.");
            }
            catch(Throwable throwable0) {
                this.e(throwable0);
                return;
            }
            this.a.onNext(object1);
        }

        @Override  // f3.o
        @g
        public Object poll() throws Exception {
            Object object0 = this.c.poll();
            return object0 == null ? null : b.g(this.f.apply(object0), "The mapper function returned a null value.");
        }
    }

    final o b;

    public x0(G g0, o o0) {
        super(g0);
        this.b = o0;
    }

    @Override  // io.reactivex.B
    public void I5(I i0) {
        io.reactivex.internal.operators.observable.x0.a x0$a0 = new io.reactivex.internal.operators.observable.x0.a(i0, this.b);
        this.a.d(x0$a0);
    }
}

