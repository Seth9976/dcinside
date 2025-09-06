package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.serialization.i;
import kotlinx.serialization.z;
import y4.l;

public final class s {
    @l
    private static final String a = "    ";
    @l
    private static final String b = "type";

    @l
    public static final b a(@l b b0, @l Function1 function10) {
        L.p(b0, "from");
        L.p(function10, "builderAction");
        f f0 = new f(b0);
        function10.invoke(f0);
        return new r(f0.a(), f0.m());
    }

    public static b b(b b0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            b0 = b.d;
        }
        return s.a(b0, function10);
    }

    public static final Object c(b b0, kotlinx.serialization.json.l l0) {
        L.p(b0, "<this>");
        L.p(l0, "json");
        L.y(6, "T");
        i i0 = z.k(b0.a(), null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return b0.f(i0, l0);
    }

    public static final kotlinx.serialization.json.l d(b b0, Object object0) {
        L.p(b0, "<this>");
        L.y(6, "T");
        i i0 = z.k(b0.a(), null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return b0.g(i0, object0);
    }
}

