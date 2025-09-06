package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.g.a;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

final class MutableMapEntry extends MapEntry implements a, Map.Entry {
    @l
    private final PersistentHashMapBuilderEntriesIterator c;
    private Object d;

    public MutableMapEntry(@l PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator0, Object object0, Object object1) {
        L.p(persistentHashMapBuilderEntriesIterator0, "parentIterator");
        super(object0, object1);
        this.c = persistentHashMapBuilderEntriesIterator0;
        this.d = object1;
    }

    public void a(Object object0) {
        this.d = object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public Object getValue() {
        return this.d;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry
    public Object setValue(Object object0) {
        this.a(object0);
        this.c.b(this.getKey(), object0);
        return this.getValue();
    }
}

