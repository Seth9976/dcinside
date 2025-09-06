package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.g.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

final class MutableMapEntry extends MapEntry implements a, Map.Entry {
    @l
    private final Map c;
    @l
    private LinkedValue d;

    public MutableMapEntry(@l Map map0, Object object0, @l LinkedValue linkedValue0) {
        L.p(map0, "mutableMap");
        L.p(linkedValue0, "links");
        super(object0, linkedValue0.e());
        this.c = map0;
        this.d = linkedValue0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public Object getValue() {
        return this.d.e();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public Object setValue(Object object0) {
        Object object1 = this.d.e();
        this.d = this.d.h(object0);
        this.c.put(this.getKey(), this.d);
        return object1;
    }
}

