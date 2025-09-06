package androidx.compose.ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.ranges.s;

public final class ConstraintsKt {
    @Stable
    public static final long a(int v, int v1, int v2, int v3) {
        if(v1 < v) {
            throw new IllegalArgumentException(("maxWidth(" + v1 + ") must be >= than minWidth(" + v + ')').toString());
        }
        if(v3 < v2) {
            throw new IllegalArgumentException(("maxHeight(" + v3 + ") must be >= than minHeight(" + v2 + ')').toString());
        }
        if(v < 0 || v2 < 0) {
            throw new IllegalArgumentException(("minWidth(" + v + ") and minHeight(" + v2 + ") must be >= 0").toString());
        }
        return Constraints.b.b(v, v1, v2, v3);
    }

    public static long b(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = 0;
        }
        if((v4 & 2) != 0) {
            v1 = 0x7FFFFFFF;
        }
        if((v4 & 4) != 0) {
            v2 = 0;
        }
        if((v4 & 8) != 0) {
            v3 = 0x7FFFFFFF;
        }
        return ConstraintsKt.a(v, v1, v2, v3);
    }

    private static final int c(int v, int v1) {
        return v == 0x7FFFFFFF ? 0x7FFFFFFF : s.u(v + v1, 0);
    }

    @Stable
    public static final long d(long v, long v1) {
        return IntSizeKt.a(s.I(((int)(v1 >> 0x20)), Constraints.r(v), Constraints.p(v)), s.I(((int)(v1 & 0xFFFFFFFFL)), Constraints.q(v), Constraints.o(v)));
    }

    public static final long e(long v, long v1) {
        return ConstraintsKt.a(s.I(Constraints.r(v1), Constraints.r(v), Constraints.p(v)), s.I(Constraints.p(v1), Constraints.r(v), Constraints.p(v)), s.I(Constraints.q(v1), Constraints.q(v), Constraints.o(v)), s.I(Constraints.o(v1), Constraints.q(v), Constraints.o(v)));
    }

    @Stable
    public static final int f(long v, int v1) {
        return s.I(v1, Constraints.q(v), Constraints.o(v));
    }

    @Stable
    public static final int g(long v, int v1) {
        return s.I(v1, Constraints.r(v), Constraints.p(v));
    }

    @Stable
    public static final boolean h(long v, long v1) {
        return Constraints.r(v) <= ((int)(v1 >> 0x20)) && ((int)(v1 >> 0x20)) <= Constraints.p(v) && (Constraints.q(v) <= ((int)(v1 & 0xFFFFFFFFL)) && ((int)(v1 & 0xFFFFFFFFL)) <= Constraints.o(v));
    }

    @Stable
    public static final long i(long v, int v1, int v2) {
        return ConstraintsKt.a(s.u(Constraints.r(v) + v1, 0), ConstraintsKt.c(Constraints.p(v), v1), s.u(Constraints.q(v) + v2, 0), ConstraintsKt.c(Constraints.o(v), v2));
    }

    public static long j(long v, int v1, int v2, int v3, Object object0) {
        if((v3 & 1) != 0) {
            v1 = 0;
        }
        if((v3 & 2) != 0) {
            v2 = 0;
        }
        return ConstraintsKt.i(v, v1, v2);
    }
}

