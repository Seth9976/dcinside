package kotlin.text;

import kotlin.enums.a;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public enum t implements i {
    IGNORE_CASE(2, 0, 2, null),
    MULTILINE(8, 0, 2, null),
    LITERAL(16, 0, 2, null),
    UNIX_LINES(1, 0, 2, null),
    COMMENTS(4, 0, 2, null),
    DOT_MATCHES_ALL(0x20, 0, 2, null),
    CANON_EQ(0x80, 0, 2, null);

    private final int a;
    private final int b;
    private static final t[] j;
    private static final a k;

    static {
        t.j = arr_t;
        L.p(arr_t, "entries");
        t.k = new d(arr_t);
    }

    private t(int v1, int v2) {
        this.a = v1;
        this.b = v2;
    }

    t(int v1, int v2, int v3, w w0) {
        if((v3 & 2) != 0) {
            v2 = v1;
        }
        this(v1, v2);
    }

    @Override  // kotlin.text.i
    public int a() {
        return this.b;
    }

    private static final t[] b() [...] // Inlined contents

    @l
    public static a c() {
        return t.k;
    }

    @Override  // kotlin.text.i
    public int getValue() {
        return this.a;
    }
}

