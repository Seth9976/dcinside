package rx.internal.operators;

import rx.g.a;
import rx.k.t;
import rx.n;

public final class i2 implements a {
    final t a;

    public i2(t k$t0) {
        this.a = k$t0;
    }

    public void a(n n0) {
        rx.internal.operators.V1.a v1$a0 = new rx.internal.operators.V1.a(n0);
        n0.q(v1$a0);
        this.a.b(v1$a0);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

