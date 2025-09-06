package dagger.internal;

import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Map;

public final class k {
    private final Map a;

    private k(int v) {
        this.a = d.d(v);
    }

    public Map a() {
        return this.a.size() == 0 ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.a);
    }

    public static k b(int v) {
        return new k(v);
    }

    public k c(Object object0, Object object1) {
        this.a.put(object0, object1);
        return this;
    }

    public k d(Map map0) {
        this.a.putAll(map0);
        return this;
    }
}

