package kotlin.collections;

import java.util.Map;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.reflect.o;
import z3.i;

@i(name = "MapAccessorsKt")
public final class V {
    @f
    private static final Object a(Map map0, Object object0, o o0) {
        L.p(map0, "<this>");
        L.p(o0, "property");
        return Z.a(map0, o0.getName());
    }

    @f
    @i(name = "getVar")
    private static final Object b(Map map0, Object object0, o o0) {
        L.p(map0, "<this>");
        L.p(o0, "property");
        return Z.a(map0, o0.getName());
    }

    @f
    private static final void c(Map map0, Object object0, o o0, Object object1) {
        L.p(map0, "<this>");
        L.p(o0, "property");
        map0.put(o0.getName(), object1);
    }
}

