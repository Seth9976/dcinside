package u3;

import j..util.Map.-EL;
import java.util.Map;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import z3.i;

@i(name = "CollectionsJDK8Kt")
public final class a {
    @h0(version = "1.2")
    @f
    private static final Object a(Map map0, Object object0, Object object1) {
        L.p(map0, "<this>");
        return Map.-EL.getOrDefault(map0, object0, object1);
    }

    @h0(version = "1.2")
    @f
    private static final boolean b(Map map0, Object object0, Object object1) {
        L.p(map0, "<this>");
        return Map.-EL.remove(v0.k(map0), object0, object1);
    }
}

