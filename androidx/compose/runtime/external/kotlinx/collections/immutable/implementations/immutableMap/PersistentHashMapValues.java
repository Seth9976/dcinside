package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.collections.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashMapValues extends a implements ImmutableCollection {
    @l
    private final PersistentHashMap a;

    public PersistentHashMapValues(@l PersistentHashMap persistentHashMap0) {
        L.p(persistentHashMap0, "map");
        super();
        this.a = persistentHashMap0;
    }

    @Override  // kotlin.collections.a
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.a
    public boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override  // kotlin.collections.a
    @l
    public Iterator iterator() {
        return new PersistentHashMapValuesIterator(this.a.r());
    }
}

