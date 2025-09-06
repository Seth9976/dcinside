package rx.internal.operators;

import java.util.Deque;
import rx.g.b;
import rx.n;

public class k1 implements b {
    final int a;

    public k1(int v) {
        if(v < 0) {
            throw new IndexOutOfBoundsException("count could not be negative");
        }
        this.a = v;
    }

    public n a(n n0) {
        class a extends n {
            private final Deque f;
            final n g;
            final k1 h;

            a(k1 k10, n n0, n n1) {
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

