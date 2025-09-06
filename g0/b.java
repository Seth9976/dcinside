package g0;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import y4.l;

public enum b {
    MY_POST("I"),
    ARTICLE("U");

    @l
    private final String a;
    private static final b[] d;
    private static final a e;

    static {
        b.d = arr_b;
        L.p(arr_b, "entries");
        b.e = new d(arr_b);
    }

    private b(String s1) {
        this.a = s1;
    }

    private static final b[] a() [...] // Inlined contents

    @l
    public static a b() {
        return b.e;
    }

    @l
    public final String c() {
        return this.a;
    }
}

