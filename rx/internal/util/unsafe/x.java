package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class x extends t {
    protected static final long L;
    private volatile long producerIndex;

    static {
        x.L = N.a(x.class, "producerIndex");
    }

    public x(int v) {
        super(v);
    }

    protected final long m() {
        return this.producerIndex;
    }

    protected final void n(long v) {
        N.a.putOrderedLong(this, x.L, v);
    }
}

