package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class k extends m {
    private static final long W8;
    private volatile long consumerIndex;

    static {
        k.W8 = N.a(k.class, "consumerIndex");
    }

    public k(int v) {
        super(v);
    }

    protected final boolean r(long v, long v1) {
        return N.a.compareAndSwapLong(this, k.W8, v, v1);
    }

    protected final long t() {
        return this.consumerIndex;
    }
}

