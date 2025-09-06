package rx.internal.operators;

import rx.g.a;
import rx.g;
import rx.n;

public final class i0 implements a {
    static final class rx.internal.operators.i0.a extends t {
        static final Object n;

        static {
            rx.internal.operators.i0.a.n = new Object();
        }

        public rx.internal.operators.i0.a(n n0) {
            super(n0);
            this.h = rx.internal.operators.i0.a.n;
        }

        @Override  // rx.internal.operators.t
        public void d() {
            Object object0 = this.h;
            if(object0 == rx.internal.operators.i0.a.n) {
                this.x();
                return;
            }
            this.Q(object0);
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.h = object0;
        }
    }

    final g a;

    public i0(g g0) {
        this.a = g0;
    }

    public void a(n n0) {
        new rx.internal.operators.i0.a(n0).Y(this.a);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

