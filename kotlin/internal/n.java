package kotlin.internal;

import kotlin.b0;

public final class n {
    private static final int a(int v, int v1, int v2) {
        return n.e(n.e(v, v2) - n.e(v1, v2), v2);
    }

    private static final long b(long v, long v1, long v2) {
        return n.f(n.f(v, v2) - n.f(v1, v2), v2);
    }

    @b0
    public static final int c(int v, int v1, int v2) {
        if(v2 > 0) {
            return v >= v1 ? v1 : v1 - n.a(v1, v, v2);
        }
        if(v2 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        return v <= v1 ? v1 : v1 + n.a(v, v1, -v2);
    }

    @b0
    public static final long d(long v, long v1, long v2) {
        int v3 = Long.compare(v2, 0L);
        if(v3 > 0) {
            return v >= v1 ? v1 : v1 - n.b(v1, v, v2);
        }
        if(v3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        return v <= v1 ? v1 : v1 + n.b(v, v1, -v2);
    }

    private static final int e(int v, int v1) {
        int v2 = v % v1;
        return v2 >= 0 ? v2 : v2 + v1;
    }

    private static final long f(long v, long v1) {
        long v2 = v % v1;
        return v2 >= 0L ? v2 : v2 + v1;
    }
}

