package rx.internal.util.unsafe;

import rx.internal.util.r;
import sun.misc.Unsafe;

@r
public abstract class h extends f {
    protected final long[] w;
    private static final long x;
    private static final int y;

    static {
        Unsafe unsafe0 = N.a;
        Class class0 = long[].class;
        if(8 != unsafe0.arrayIndexScale(class0)) {
            throw new IllegalStateException("Unexpected long[] element size");
        }
        h.y = f.s + 3;
        h.x = (long)(unsafe0.arrayBaseOffset(class0) + 0x100);
    }

    public h(int v) {
        super(v);
        int v1 = (int)(this.q + 1L);
        this.w = new long[(v1 << f.s) + 0x40];
        for(long v2 = 0L; v2 < ((long)v1); ++v2) {
            this.o(this.w, this.m(v2), v2);
        }
    }

    protected final long m(long v) {
        return h.x + ((v & this.q) << h.y);
    }

    protected final long n(long[] arr_v, long v) {
        return N.a.getLongVolatile(arr_v, v);
    }

    protected final void o(long[] arr_v, long v, long v1) {
        N.a.putOrderedLong(arr_v, v, v1);
    }
}

