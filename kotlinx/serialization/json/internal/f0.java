package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.y;
import kotlinx.serialization.d;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.h;
import kotlinx.serialization.json.b;
import y4.l;

public final class f0 {
    @h
    @l
    public static final kotlinx.serialization.json.l a(@l b b0, @l d d0, @l String s) {
        L.p(b0, "<this>");
        L.p(d0, "deserializer");
        L.p(s, "source");
        i0 i00 = new i0(s);
        f f0 = d0.getDescriptor();
        kotlinx.serialization.json.l l0 = new e0(b0, n0.c, i00, f0, null).t();
        i00.w();
        return l0;
    }

    private static final Object b(a a0, String s, Function1 function10) {
        String s1 = a0.s();
        try {
            return function10.invoke(s1);
        }
        catch(IllegalArgumentException unused_ex) {
            a.y(a0, "Failed to parse type \'" + s + "\' for input \'" + s1 + '\'', 0, null, 6, null);
            throw new y();
        }
    }
}

