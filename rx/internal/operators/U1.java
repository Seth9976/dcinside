package rx.internal.operators;

import rx.g.b;
import rx.g;
import rx.n;

public final class u1 implements b {
    private final g a;

    public u1(g g0) {
        this.a = g0;
    }

    public n a(n n0) {
        class a extends n {
            final n f;
            final u1 g;

            a(n n0, boolean z, n n1) {
                this.f = n1;
                super(n0, z);
            }

            @Override  // rx.h
            public void d() {
                try {
                    this.f.d();
                }
                finally {
                    this.f.l();
                }
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                try {
                    this.f.onError(throwable0);
                }
                finally {
                    this.f.l();
                }
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.onNext(object0);
            }
        }


        class rx.internal.operators.u1.b extends n {
            final n f;
            final u1 g;

            rx.internal.operators.u1.b(n n0) {
                this.f = n0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.f.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.f.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.d();
            }

            @Override  // rx.n
            public void onStart() {
                this.v(0x7FFFFFFFFFFFFFFFL);
            }
        }

        rx.observers.g g0 = new rx.observers.g(n0, false);
        n n1 = new a(this, g0, false, g0);
        rx.internal.operators.u1.b u1$b0 = new rx.internal.operators.u1.b(this, n1);
        g0.q(n1);
        g0.q(u1$b0);
        n0.q(g0);
        this.a.N6(u1$b0);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

