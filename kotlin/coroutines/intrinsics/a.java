package kotlin.coroutines.intrinsics;

import kotlin.b0;
import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

@b0
@h0(version = "1.3")
public enum a {
    COROUTINE_SUSPENDED,
    UNDECIDED,
    RESUMED;

    private static final a[] d;
    private static final kotlin.enums.a e;

    static {
        a.d = arr_a;
        L.p(arr_a, "entries");
        a.e = new d(arr_a);
    }

    private static final a[] a() [...] // Inlined contents

    @l
    public static kotlin.enums.a b() {
        return a.e;
    }
}

