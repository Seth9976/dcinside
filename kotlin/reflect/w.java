package kotlin.reflect;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.1")
public enum w {
    PUBLIC,
    PROTECTED,
    INTERNAL,
    PRIVATE;

    private static final w[] e;
    private static final a f;

    static {
        w.e = arr_w;
        L.p(arr_w, "entries");
        w.f = new d(arr_w);
    }

    private static final w[] a() [...] // Inlined contents

    @l
    public static a b() {
        return w.f;
    }
}

