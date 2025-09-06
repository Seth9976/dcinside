package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.exceptions.c;
import rx.g.b;
import rx.j;
import rx.n;
import rx.observers.g;

public final class e1 implements b {
    static final class a extends n implements rx.functions.a {
        private final n f;
        final AtomicReference g;
        private static final Object h;

        static {
            a.h = new Object();
        }

        public a(n n0) {
            this.g = new AtomicReference(a.h);
            this.f = n0;
        }

        @Override  // rx.functions.a
        public void call() {
            this.x();
        }

        @Override  // rx.h
        public void d() {
            this.x();
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
            this.g.set(object0);
        }

        @Override  // rx.n
        public void onStart() {
            this.v(0x7FFFFFFFFFFFFFFFL);
        }

        private void x() {
            Object object0 = this.g.getAndSet(a.h);
            if(object0 != a.h) {
                try {
                    this.f.onNext(object0);
                }
                catch(Throwable throwable0) {
                    c.f(throwable0, this);
                }
            }
        }
    }

    final long a;
    final TimeUnit b;
    final j c;

    public e1(long v, TimeUnit timeUnit0, j j0) {
        this.a = v;
        this.b = timeUnit0;
        this.c = j0;
    }

    public n a(n n0) {
        g g0 = new g(n0);
        rx.j.a j$a0 = this.c.a();
        n0.q(j$a0);
        n n1 = new a(g0);
        n0.q(n1);
        j$a0.e(((rx.functions.a)n1), this.a, this.a, this.b);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

