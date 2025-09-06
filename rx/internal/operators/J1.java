package rx.internal.operators;

import rx.g.b;
import rx.i;
import rx.n;

public final class j1 implements b {
    final int a;

    public j1(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("n >= 0 required but it was " + v);
        }
        this.a = v;
    }

    public n a(n n0) {
        class a extends n {
            int f;
            final n g;
            final j1 h;

            a(j1 j10, n n0, n n1) {
            }

            @Override  // rx.n
            public void X(i i0) {
            }

            @Override  // rx.h
            public void d() {
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
            }

            @Override  // rx.h
            public void onNext(Object object0) {
            }
        }

        return new a(this, n0, n0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

