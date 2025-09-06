package kotlinx.serialization.json.internal;

import kotlin.J;
import kotlin.jvm.internal.L;
import kotlinx.serialization.d;
import kotlinx.serialization.h;
import kotlinx.serialization.json.B;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.t;
import kotlinx.serialization.json.w;
import kotlinx.serialization.json.y;
import y4.l;

public final class l0 {
    @h
    public static final Object a(@l b b0, @l kotlinx.serialization.json.l l0, @l d d0) {
        L.p(b0, "<this>");
        L.p(l0, "element");
        L.p(d0, "deserializer");
        if(l0 instanceof y) {
            return new Q(b0, ((y)l0), null, null, 12, null).G(d0);
        }
        if(l0 instanceof c) {
            return new T(b0, ((c)l0)).G(d0);
        }
        if(!(l0 instanceof t ? true : L.g(l0, w.c))) {
            throw new J();
        }
        return new kotlinx.serialization.json.internal.L(b0, ((B)l0)).G(d0);
    }

    public static final Object b(@l b b0, @l String s, @l y y0, @l d d0) {
        L.p(b0, "<this>");
        L.p(s, "discriminator");
        L.p(y0, "element");
        L.p(d0, "deserializer");
        return new Q(b0, y0, s, d0.getDescriptor()).G(d0);
    }
}

