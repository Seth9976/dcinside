package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import rx.g.b;
import rx.j;
import rx.n;
import rx.observers.g;

public final class t1 implements b {
    static final class a extends n implements rx.functions.a {
        final n f;

        public a(n n0) {
            super(n0);
            this.f = n0;
        }

        @Override  // rx.functions.a
        public void call() {
            this.d();
        }

        @Override  // rx.h
        public void d() {
            this.f.d();
            this.l();
        }

        @Override  // rx.h
        public void onError(Throwable throwable0) {
            this.f.onError(throwable0);
            this.l();
        }

        @Override  // rx.h
        public void onNext(Object object0) {
            this.f.onNext(object0);
        }
    }

    final long a;
    final TimeUnit b;
    final j c;

    public t1(long v, TimeUnit timeUnit0, j j0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = j0;
    }

    public n a(n n0) {
        rx.j.a j$a0 = this.c.a();
        n0.q(j$a0);
        n n1 = new a(new g(n0));
        j$a0.d(((rx.functions.a)n1), this.a, this.b);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

