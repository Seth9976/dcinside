package kotlinx.serialization.encoding;

import A3.p;
import java.util.Collection;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import y4.l;

public final class h {
    public static final void a(@l g g0, @l f f0, int v, @l Function1 function10) {
        L.p(g0, "<this>");
        L.p(f0, "descriptor");
        L.p(function10, "block");
        d d0 = g0.z(f0, v);
        function10.invoke(d0);
        d0.c(f0);
    }

    public static final void b(@l g g0, @l f f0, @l Collection collection0, @l p p0) {
        L.p(g0, "<this>");
        L.p(f0, "descriptor");
        L.p(collection0, "collection");
        L.p(p0, "block");
        d d0 = g0.z(f0, collection0.size());
        int v = 0;
        for(Object object0: collection0) {
            if(v < 0) {
                u.Z();
            }
            p0.invoke(d0, v, object0);
            ++v;
        }
        d0.c(f0);
    }

    public static final void c(@l g g0, @l f f0, @l Function1 function10) {
        L.p(g0, "<this>");
        L.p(f0, "descriptor");
        L.p(function10, "block");
        d d0 = g0.b(f0);
        function10.invoke(d0);
        d0.c(f0);
    }
}

