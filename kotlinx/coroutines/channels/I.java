package kotlinx.coroutines.channels;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum i {
    SUSPEND,
    DROP_OLDEST,
    DROP_LATEST;

    private static final i[] d;
    private static final a e;

    static {
        i.d = arr_i;
        L.p(arr_i, "entries");
        i.e = new d(arr_i);
    }

    private static final i[] a() [...] // Inlined contents

    @l
    public static a b() {
        return i.e;
    }
}

