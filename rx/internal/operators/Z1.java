package rx.internal.operators;

import rx.g.b;
import rx.j;
import rx.n;
import rx.schedulers.f;

public final class z1 implements b {
    final j a;

    public z1(j j0) {
        this.a = j0;
    }

    public n a(n n0) {
        class a extends n {
            final n f;
            final z1 g;

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
                f f0 = new f(z1.this.a.b(), object0);
                this.f.onNext(f0);
            }
        }

        return new a(this, n0, n0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

