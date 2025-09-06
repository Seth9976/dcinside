package kotlinx.serialization.json.internal;

import java.util.Map;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import y4.l;
import y4.m;

public final class x {
    public static final class a {
    }

    @l
    private final Map a;

    public x() {
        this.a = w.a(1);
    }

    @m
    public final Object a(@l f f0, @l a x$a0) {
        L.p(f0, "descriptor");
        L.p(x$a0, "key");
        Map map0 = (Map)this.a.get(f0);
        Object object0 = map0 == null ? null : map0.get(x$a0);
        return object0 == null ? null : object0;
    }

    @l
    public final Object b(@l f f0, @l a x$a0, @l A3.a a0) {
        L.p(f0, "descriptor");
        L.p(x$a0, "key");
        L.p(a0, "defaultValue");
        Object object0 = this.a(f0, x$a0);
        if(object0 != null) {
            return object0;
        }
        Object object1 = a0.invoke();
        this.c(f0, x$a0, object1);
        return object1;
    }

    public final void c(@l f f0, @l a x$a0, @l Object object0) {
        L.p(f0, "descriptor");
        L.p(x$a0, "key");
        L.p(object0, "value");
        Map map0 = this.a;
        Map map1 = map0.get(f0);
        if(map1 == null) {
            map1 = w.a(1);
            map0.put(f0, map1);
        }
        map1.put(x$a0, object0);
    }
}

