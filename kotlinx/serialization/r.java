package kotlinx.serialization;

import kotlin.jvm.internal.L;
import kotlinx.serialization.internal.X;
import kotlinx.serialization.modules.f;
import y4.l;

public final class r {
    public static final Object a(a a0, byte[] arr_b) {
        L.p(a0, "<this>");
        L.p(arr_b, "bytes");
        f f0 = a0.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return a0.e(i0, arr_b);
    }

    public static final Object b(a a0, String s) {
        L.p(a0, "<this>");
        L.p(s, "hex");
        f f0 = a0.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return r.c(a0, i0, s);
    }

    public static final Object c(@l a a0, @l d d0, @l String s) {
        L.p(a0, "<this>");
        L.p(d0, "deserializer");
        L.p(s, "hex");
        return a0.e(d0, X.a.b(s));
    }

    public static final Object d(C c0, String s) {
        L.p(c0, "<this>");
        L.p(s, "string");
        f f0 = c0.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return c0.d(i0, s);
    }

    public static final byte[] e(a a0, Object object0) {
        L.p(a0, "<this>");
        f f0 = a0.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return a0.b(i0, object0);
    }

    public static final String f(a a0, Object object0) {
        L.p(a0, "<this>");
        f f0 = a0.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return r.g(a0, i0, object0);
    }

    @l
    public static final String g(@l a a0, @l w w0, Object object0) {
        L.p(a0, "<this>");
        L.p(w0, "serializer");
        byte[] arr_b = a0.b(w0, object0);
        return X.a.c(arr_b, true);
    }

    public static final String h(C c0, Object object0) {
        L.p(c0, "<this>");
        f f0 = c0.a();
        L.y(6, "T");
        i i0 = z.k(f0, null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return c0.c(i0, object0);
    }
}

