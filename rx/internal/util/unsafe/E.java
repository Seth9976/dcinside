package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class e extends c {
    protected rx.internal.util.atomic.c producerNode;
    protected static final long q;

    static {
        e.q = N.a(e.class, "producerNode");
    }

    protected final rx.internal.util.atomic.c a() {
        return this.producerNode;
    }

    protected final rx.internal.util.atomic.c b() {
        return (rx.internal.util.atomic.c)N.a.getObjectVolatile(this, e.q);
    }

    protected final void c(rx.internal.util.atomic.c c0) {
        this.producerNode = c0;
    }
}

