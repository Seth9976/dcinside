package rx.internal.operators;

import rx.exceptions.c;
import rx.functions.q;
import rx.g.a;
import rx.g;
import rx.n;

public final class d0 implements a {
    static final class rx.internal.operators.d0.a extends t {
        final q n;

        public rx.internal.operators.d0.a(n n0, Object object0, q q0) {
            super(n0);
            this.h = object0;
            this.g = true;
            this.n = q0;
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            try {
                this.h = this.n.p(this.h, object0);
            }
            catch(Throwable throwable0) {
                c.e(throwable0);
                this.l();
                this.f.onError(throwable0);
            }
        }
    }

    final g a;
    final Object b;
    final q c;

    public d0(g g0, Object object0, q q0) {
        this.a = g0;
        this.b = object0;
        this.c = q0;
    }

    public void a(n n0) {
        new rx.internal.operators.d0.a(n0, this.b, this.c).Y(this.a);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

