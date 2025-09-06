package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.functions.b;
import rx.g.a;
import rx.n;
import rx.observables.c;
import rx.observers.h;

public final class z extends AtomicInteger implements a {
    final c a;
    final int b;
    final b c;

    public z(c c0, int v, b b0) {
        if(v <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.a = c0;
        this.b = v;
        this.c = b0;
    }

    public void a(n n0) {
        n n1 = h.f(n0);
        this.a.N6(n1);
        if(this.incrementAndGet() == this.b) {
            this.a.E7(this.c);
        }
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

