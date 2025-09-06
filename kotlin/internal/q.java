package kotlin.internal;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.2")
public enum q {
    LANGUAGE_VERSION,
    COMPILER_VERSION,
    API_VERSION;

    private static final q[] d;
    private static final a e;

    static {
        q.d = arr_q;
        L.p(arr_q, "entries");
        q.e = new d(arr_q);
    }

    private static final q[] a() [...] // Inlined contents

    @l
    public static a b() {
        return q.e;
    }
}

