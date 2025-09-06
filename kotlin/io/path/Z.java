package kotlin.io.path;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.8")
@r
public enum z {
    SKIP_SUBTREE,
    TERMINATE;

    private static final z[] c;
    private static final a d;

    static {
        z.c = arr_z;
        L.p(arr_z, "entries");
        z.d = new d(arr_z);
    }

    private static final z[] a() [...] // Inlined contents

    @l
    public static a b() {
        return z.d;
    }
}

