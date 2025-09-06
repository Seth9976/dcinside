package kotlin.io;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum u {
    SKIP,
    TERMINATE;

    private static final u[] c;
    private static final a d;

    static {
        u.c = arr_u;
        L.p(arr_u, "entries");
        u.d = new d(arr_u);
    }

    private static final u[] a() [...] // Inlined contents

    @l
    public static a b() {
        return u.d;
    }
}

