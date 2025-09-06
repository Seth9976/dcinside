package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.g.b;
import rx.g;
import rx.n;

public final class d1 implements b {
    final g a;
    static final Object b;

    static {
        d1.b = new Object();
    }

    public d1(g g0) {
        this.a = g0;
    }

    public n a(n n0) {
        class a extends n {
            final AtomicReference f;
            final rx.observers.g g;
            final AtomicReference h;
            final d1 i;

            a(d1 d10, AtomicReference atomicReference0, rx.observers.g g0, AtomicReference atomicReference1) {
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


        class rx.internal.operators.d1.b extends n {
            final AtomicReference f;
            final rx.observers.g g;
            final n h;
            final d1 i;

            rx.internal.operators.d1.b(d1 d10, AtomicReference atomicReference0, rx.observers.g g0, n n0) {
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

        rx.observers.g g0 = new rx.observers.g(n0);
        AtomicReference atomicReference0 = new AtomicReference(d1.b);
        AtomicReference atomicReference1 = new AtomicReference();
        a d1$a0 = new a(this, atomicReference0, g0, atomicReference1);
        n n1 = new rx.internal.operators.d1.b(this, atomicReference0, g0, d1$a0);
        atomicReference1.lazySet(n1);
        n0.q(n1);
        n0.q(d1$a0);
        this.a.N6(d1$a0);
        return n1;
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

