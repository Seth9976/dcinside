package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.collections.i;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashMapKeys extends i implements ImmutableSet {
    @l
    private final PersistentHashMap b;

    public PersistentHashMapKeys(@l PersistentHashMap persistentHashMap0) {
        L.p(persistentHashMap0, "map");
        super();
        this.b = persistentHashMap0;
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
        return new PersistentHashMapKeysIterator(this.b.r());
    }
}

