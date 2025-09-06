package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.g.a;
import rx.g;
import rx.j;
import rx.n;

public final class g0 implements a {
    static final class rx.internal.operators.g0.a extends n implements rx.functions.a {
        final n f;
        volatile boolean g;

        rx.internal.operators.g0.a(n n0) {
            this.f = n0;
        }

        @Override  // rx.functions.a
        public void call() {
            this.g = true;
        }

        @Override  // rx.h
        public void d() {
            try {
                this.f.d();
            }
            finally {
                this.l();
            }
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            try {
                this.f.onError(throwable0);
            }
            finally {
                this.l();
            }
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            if(this.g) {
                this.f.onNext(object0);
            }
        }
    }

    final long a;
    final TimeUnit b;
    final j c;
    final g d;

    public g0(g g0, long v, TimeUnit timeUnit0, j j0) {
        this.d = g0;
        this.a = v;
        this.b = timeUnit0;
        this.c = j0;
    }

    public void a(n n0) {
        rx.j.a j$a0 = this.c.a();
        rx.internal.operators.g0.a g0$a0 = new rx.internal.operators.g0.a(n0);
        g0$a0.q(j$a0);
        n0.q(g0$a0);
        j$a0.d(g0$a0, this.a, this.b);
        this.d.N6(g0$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

