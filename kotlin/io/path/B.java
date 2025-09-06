package kotlin.io.path;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.8")
@r
public enum b {
    CONTINUE,
    SKIP_SUBTREE,
    TERMINATE;

    private static final b[] d;
    private static final a e;

    static {
        b.d = arr_b;
        L.p(arr_b, "entries");
        b.e = new d(arr_b);
    }

    private static final b[] a() [...] // Inlined contents

    @l
    public static a b() {
        return b.e;
    }
}

