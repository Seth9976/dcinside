package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class LruHashMap {
    @l
    private final LinkedHashMap a;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    public LruHashMap(int v, float f) {
        this.a = new LinkedHashMap(v, f, true);
    }

    public LruHashMap(int v, float f, int v1, w w0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        if((v1 & 2) != 0) {
            f = 0.75f;
        }
        this(v, f);
    }

    public LruHashMap(@l LruHashMap lruHashMap0) {
        L.p(lruHashMap0, "original");
        this(0, 0.0f, 3, null);
        for(Object object0: lruHashMap0.b()) {
            this.d(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @m
    public final Object a(@l Object object0) {
        L.p(object0, "key");
        return this.a.get(object0);
    }

    @l
    public final Set b() {
        Set set0 = this.a.entrySet();
        L.o(set0, "map.entries");
        return set0;
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    @m
    public final Object d(@l Object object0, @l Object object1) {
        L.p(object0, "key");
        L.p(object1, "value");
        return this.a.put(object0, object1);
    }

    @m
    public final Object e(@l Object object0) {
        L.p(object0, "key");
        return this.a.remove(object0);
    }
}

