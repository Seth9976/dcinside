package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.reflect.d;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.G0;
import y4.l;
import y4.m;

public final class b {
    @m
    public static final d a(@l f f0) {
        L.p(f0, "<this>");
        if(f0 instanceof c) {
            return ((c)f0).b;
        }
        return f0 instanceof G0 ? b.a(((G0)f0).j()) : null;
    }

    @kotlinx.serialization.f
    public static void b(f f0) {
    }

    @kotlinx.serialization.f
    @m
    public static final f c(@l kotlinx.serialization.modules.f f0, @l f f1) {
        L.p(f0, "<this>");
        L.p(f1, "descriptor");
        d d0 = b.a(f1);
        if(d0 != null) {
            i i0 = kotlinx.serialization.modules.f.d(f0, d0, null, 2, null);
            return i0 == null ? null : i0.getDescriptor();
        }
        return null;
    }

    @kotlinx.serialization.f
    @l
    public static final List d(@l kotlinx.serialization.modules.f f0, @l f f1) {
        L.p(f0, "<this>");
        L.p(f1, "descriptor");
        d d0 = b.a(f1);
        if(d0 == null) {
            return u.H();
        }
        Map map0 = (Map)((kotlinx.serialization.modules.d)f0).b.get(d0);
        Collection collection0 = map0 == null ? null : map0.values();
        if(collection0 == null) {
            collection0 = u.H();
        }
        List list0 = new ArrayList(u.b0(collection0, 10));
        for(Object object0: collection0) {
            list0.add(((i)object0).getDescriptor());
        }
        return list0;
    }

    @l
    public static final f e(@l f f0, @l d d0) {
        L.p(f0, "<this>");
        L.p(d0, "context");
        return new c(f0, d0);
    }
}

