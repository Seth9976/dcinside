package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import rx.g.b;
import rx.g;
import rx.n;

public final class m1 implements b {
    final g a;

    public m1(g g0) {
        this.a = g0;
    }

    public n a(n n0) {
        class a extends n {
            final AtomicBoolean f;
            final rx.observers.g g;
            final m1 h;

            a(AtomicBoolean atomicBoolean0, rx.observers.g g0) {
                this.f = atomicBoolean0;
                this.g = g0;
                super();
            }

            @Override  // rx.h
            public void d() {
                this.l();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.onError(throwable0);
                this.g.l();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                this.f.set(true);
                this.l();
            }
        }


        class rx.internal.operators.m1.b extends n {
            final AtomicBoolean f;
            final rx.observers.g g;
            final m1 h;

            rx.internal.operators.m1.b(n n0, AtomicBoolean atomicBoolean0, rx.observers.g g0) {
                this.f = atomicBoolean0;
                this.g = g0;
                super(n0);
            }

            @Override  // rx.h
            public void d() {
                this.g.d();
                this.l();
            }

            @Override  // rx.h
            public void onError(Throwable throwable0) {
                this.g.onError(throwable0);
                this.l();
            }

            @Override  // rx.h
            public void onNext(Object object0) {
                if(this.f.get()) {
                    this.g.onNext(object0);
                    return;
                }
                this.v(1L);
            }
        }

        rx.observers.g g0 = new rx.observers.g(n0);
        AtomicBoolean atomicBoolean0 = new AtomicBoolean();
        a m1$a0 = new a(this, atomicBoolean0, g0);
        n0.q(m1$a0);
        this.a.N6(m1$a0);
        return new rx.internal.operators.m1.b(this, n0, atomicBoolean0, g0);
    }

    @Override  // rx.functions.p
    public Object b(Object object0) {
        return this.a(((n)object0));
    }
}

