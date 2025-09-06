package kotlinx.serialization;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.y;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.internal.b;
import y4.l;
import y4.m;

public final class n {
    @h
    @l
    public static final d a(@l b b0, @l c c0, @m String s) {
        L.p(b0, "<this>");
        L.p(c0, "decoder");
        d d0 = b0.c(c0, s);
        if(d0 != null) {
            return d0;
        }
        kotlinx.serialization.internal.c.a(s, b0.e());
        throw new y();
    }

    @h
    @l
    public static final w b(@l b b0, @l g g0, @l Object object0) {
        L.p(b0, "<this>");
        L.p(g0, "encoder");
        L.p(object0, "value");
        w w0 = b0.d(g0, object0);
        if(w0 != null) {
            return w0;
        }
        kotlinx.serialization.internal.c.b(m0.d(object0.getClass()), b0.e());
        throw new y();
    }
}

