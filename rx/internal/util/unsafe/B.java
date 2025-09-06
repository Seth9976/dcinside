package rx.internal.util.unsafe;

import rx.internal.util.atomic.c;
import rx.internal.util.r;

@r
abstract class b extends d {
    protected static final long H;
    protected c consumerNode;

    static {
        b.H = N.a(b.class, "consumerNode");
    }

    protected final c d() {
        return this.consumerNode;
    }

    protected final c g() {
        return (c)N.a.getObjectVolatile(this, b.H);
    }

    protected final void h(c c0) {
        this.consumerNode = c0;
    }
}

