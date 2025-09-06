package kotlinx.coroutines.selects;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum r {
    SUCCESSFUL,
    REREGISTER,
    CANCELLED,
    ALREADY_SELECTED;

    private static final r[] e;
    private static final a f;

    static {
        r.e = arr_r;
        L.p(arr_r, "entries");
        r.f = new d(arr_r);
    }

    private static final r[] a() [...] // Inlined contents

    @l
    public static a b() {
        return r.f;
    }
}

