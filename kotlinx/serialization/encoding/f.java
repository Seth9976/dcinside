package kotlinx.serialization.encoding;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class f {
    public static final Object a(@l e e0, @l kotlinx.serialization.descriptors.f f0, @l Function1 function10) {
        L.p(e0, "<this>");
        L.p(f0, "descriptor");
        L.p(function10, "block");
        c c0 = e0.b(f0);
        Object object0 = function10.invoke(c0);
        c0.c(f0);
        return object0;
    }
}

