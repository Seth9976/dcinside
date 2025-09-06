package s3;

import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum a {
    SOURCE,
    BINARY,
    RUNTIME;

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

