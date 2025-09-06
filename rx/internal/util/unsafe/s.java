package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class s extends u {
    protected static final long T8;
    private volatile long consumerIndex;

    static {
        s.T8 = N.a(s.class, "consumerIndex");
    }

    public s(int v) {
        super(v);
    }

    protected final boolean o(long v, long v1) {
        return N.a.compareAndSwapLong(this, s.T8, v, v1);
    }

    protected final long p() {
        return this.consumerIndex;
    }
}

