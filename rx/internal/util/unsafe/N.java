package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class n extends l {
    private static final long O;
    private volatile long producerIndex;

    static {
        n.O = N.a(n.class, "producerIndex");
    }

    public n(int v) {
        super(v);
    }

    protected final boolean p(long v, long v1) {
        return N.a.compareAndSwapLong(this, n.O, v, v1);
    }

    protected final long q() {
        return this.producerIndex;
    }
}

