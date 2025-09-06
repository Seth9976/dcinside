package kotlin.internal;

import androidx.collection.b;
import kotlin.D0;
import kotlin.H0;
import kotlin.b0;
import kotlin.h0;
import kotlin.w0;
import kotlin.y0;

public final class r {
    private static final int a(int v, int v1, int v2) {
        int v3 = (int)((((long)v) & 0xFFFFFFFFL) % (((long)v2) & 0xFFFFFFFFL));
        int v4 = (int)((((long)v1) & 0xFFFFFFFFL) % (((long)v2) & 0xFFFFFFFFL));
        int v5 = v3 - v4;
        return y0.a(v3, v4) >= 0 ? v5 : v5 + v2;
    }

    private static final long b(long v, long v1, long v2) {
        long v3 = w0.a(v, v2);
        long v4 = w0.a(v1, v2);
        long v5 = v3 - v4;
        return b.a(v3, v4) >= 0 ? v5 : v5 + v2;
    }

    @b0
    @h0(version = "1.3")
    public static final long c(long v, long v1, long v2) {
        int v3 = Long.compare(v2, 0L);
        if(v3 > 0) {
            return b.a(v, v1) >= 0 ? v1 : H0.h(v1 - r.b(v1, v, v2));
        }
        if(v3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        return b.a(v, v1) <= 0 ? v1 : H0.h(v1 + r.b(v, v1, -v2));
    }

    @b0
    @h0(version = "1.3")
    public static final int d(int v, int v1, int v2) {
        if(v2 > 0) {
            return y0.a(v, v1) >= 0 ? v1 : D0.h(v1 - r.a(v1, v, v2));
        }
        if(v2 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        return y0.a(v, v1) <= 0 ? v1 : D0.h(v1 + r.a(v, v1, -v2));
    }
}

