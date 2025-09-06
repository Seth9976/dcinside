package rx.internal.util.unsafe;

import rx.internal.util.r;

@r
abstract class y extends w {
    private volatile long j9;

    public y(int v) {
        super(v);
    }

    protected final long q() {
        return this.j9;
    }

    protected final void r(long v) {
        this.j9 = v;
    }
}

