package kotlin;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum m {
    WARNING,
    ERROR,
    HIDDEN;

    private static final m[] d;
    private static final a e;

    static {
        m.d = arr_m;
        L.p(arr_m, "entries");
        m.e = new d(arr_m);
    }

    private static final m[] a() [...] // Inlined contents

    @l
    public static a b() {
        return m.e;
    }
}

