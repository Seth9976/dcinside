package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import java.util.Iterator;
import kotlin.collections.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapValues extends a implements ImmutableCollection {
    @l
    private final PersistentOrderedMap a;

    public PersistentOrderedMapValues(@l PersistentOrderedMap persistentOrderedMap0) {
        L.p(persistentOrderedMap0, "map");
        super();
        this.a = persistentOrderedMap0;
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
        return new PersistentOrderedMapValuesIterator(this.a);
    }
}

