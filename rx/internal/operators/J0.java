package rx.internal.operators;

import rx.g.a;
import rx.n;

public final class j0 implements a {
    private final Throwable a;

    public j0(Throwable throwable0) {
        this.a = throwable0;
    }

    public void a(n n0) {
        n0.onError(this.a);
    }

    @Override  // rx.functions.b
    public void b(Object object0) {
        this.a(((n)object0));
    }
}

