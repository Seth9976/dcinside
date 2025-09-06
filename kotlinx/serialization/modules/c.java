package kotlinx.serialization.modules;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import kotlinx.serialization.i;
import kotlinx.serialization.z;

public final class c {
    public static final void a(b b0, d d0) {
        L.p(b0, "<this>");
        L.p(d0, "clazz");
        L.y(6, "T");
        i i0 = z.h(null);
        L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b0.d(d0, i0);
    }

    public static final void b(b b0, i i0) {
        L.p(b0, "<this>");
        L.p(i0, "serializer");
        L.y(4, "T");
        b0.d(m0.d(Object.class), i0);
    }
}

