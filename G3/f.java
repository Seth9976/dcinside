package g3;

import kotlin.jvm.internal.L;
import org.slf4j.a;
import org.slf4j.b;
import y4.l;

public final class f {
    @l
    private static final a a;

    static {
        a a0 = b.j("realm-logger");
        L.o(a0, "getLogger(\"realm-logger\")");
        f.a = a0;
    }

    @l
    public static final a a() {
        return f.a;
    }
}

