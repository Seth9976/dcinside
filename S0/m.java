package S0;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum m {
    VITO_V2,
    VITO_V1,
    DRAWEE,
    OTHER;

    private static final m[] e;
    private static final a f;

    static {
        m.e = arr_m;
        L.p(arr_m, "entries");
        m.f = new d(arr_m);
    }

    private static final m[] a() [...] // Inlined contents

    @l
    public static a b() {
        return m.f;
    }
}

