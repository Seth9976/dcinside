package dagger.internal;

import j..util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;
import r3.c;

abstract class a implements g {
    public static abstract class dagger.internal.a.a {
        final LinkedHashMap a;

        dagger.internal.a.a(int v) {
            this.a = d.d(v);
        }

        dagger.internal.a.a a(Object object0, c c0) {
            Object object1 = p.c(object0, "key");
            Object object2 = p.c(c0, "provider");
            this.a.put(object1, object2);
            return this;
        }

        dagger.internal.a.a b(c c0) {
            if(c0 instanceof e) {
                return this.b(((e)c0).a());
            }
            Map map0 = ((a)c0).a;
            this.a.putAll(map0);
            return this;
        }
    }

    private final Map a;

    a(Map map0) {
        this.a = DesugarCollections.unmodifiableMap(map0);
    }

    final Map b() {
        return this.a;
    }
}

