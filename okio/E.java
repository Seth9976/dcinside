package okio;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

@k(message = "changed in Okio 2.x")
public final class e {
    @l
    public static final e a;

    static {
        e.a = new e();
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@l String s) {
        L.p(s, "string");
        return r0.l(s, 0, 0, 3, null);
    }

    @k(level = m.b, message = "moved to extension function", replaceWith = @c0(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@l String s, int v, int v1) {
        L.p(s, "string");
        return r0.k(s, v, v1);
    }
}

