package rx.internal.operators;

import rx.g.b;
import rx.j;
import rx.n;
import rx.schedulers.e;

public final class y1 implements b {
    final j a;

    public y1(j j0) {
        this.a = j0;
    }

    public n a(n n0) {
        class a extends n {
            private long f;
            final n g;
            final y1 h;

            a(n n0, n n1) {
                this.g = n1;
                super(n0);
                this.f = y10.a.b();
            }

            @Override  // rx.h
            public void d() {
                this.g.d();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.onError(throwable0);
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                long v = y1.this.a.b();
                e e0 = new e(v - this.f, object0);
                this.g.onNext(e0);
                this.f = v;
            }
        }

        return new a(this, n0, n0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

