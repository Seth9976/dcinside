package rx.internal.operators;

import rx.g.b;
import rx.n;
import rx.observers.g;

public final class h1 implements b {
    static final class rx.internal.operators.h1.b {
        static final h1 a;

        static {
            rx.internal.operators.h1.b.a = new h1();
        }
    }

    public n a(n n0) {
        class a extends n {
            final n f;
            final h1 g;

            a(n n0, n n1) {
                this.f = n1;
                super(n0);
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
                this.f.onNext(object0);
            }
        }

        return new g(new a(this, n0, n0));
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }

    public static h1 c() {
        return rx.internal.operators.h1.b.a;
    }
}

