package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapKeys extends i implements ImmutableSet {
    @l
    private final PersistentOrderedMap b;

    public PersistentOrderedMapKeys(@l PersistentOrderedMap persistentOrderedMap0) {
        L.p(persistentOrderedMap0, "map");
        super();
        this.b = persistentOrderedMap0;
    }

    @Override  // kotlin.collections.a
    public int a() {
        return this.b.size();
    }

    @Override  // kotlin.collections.a
    public boolean contains(Object object0) {
        return this.b.containsKey(object0);
    }

    @Override  // kotlin.collections.i
    @l
    public Iterator iterator() {
        return new PersistentOrderedMapKeysIterator(this.b);
    }
}

