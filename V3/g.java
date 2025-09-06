package v3;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.internal.b;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.3")
@b
@f
public enum g {
    @b
    AT_MOST_ONCE,
    @b
    AT_LEAST_ONCE,
    @b
    EXACTLY_ONCE,
    @b
    UNKNOWN;

    private static final g[] e;
    private static final a f;

    static {
        g.e = arr_g;
        L.p(arr_g, "entries");
        g.f = new d(arr_g);
    }

    private static final g[] a() [...] // Inlined contents

    @l
    public static a b() {
        return g.f;
    }
}

