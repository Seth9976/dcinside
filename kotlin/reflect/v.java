package kotlin.reflect;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@h0(version = "1.1")
public enum v {
    INVARIANT,
    IN,
    OUT;

    private static final v[] d;
    private static final a e;

    static {
        v.d = arr_v;
        L.p(arr_v, "entries");
        v.e = new d(arr_v);
    }

    private static final v[] a() [...] // Inlined contents

    @l
    public static a b() {
        return v.e;
    }
}

