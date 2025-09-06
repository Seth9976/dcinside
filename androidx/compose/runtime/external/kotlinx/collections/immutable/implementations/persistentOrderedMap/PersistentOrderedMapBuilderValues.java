package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapBuilderValues extends e implements b, Collection {
    @l
    private final PersistentOrderedMapBuilder a;

    public PersistentOrderedMapBuilderValues(@l PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        L.p(persistentOrderedMapBuilder0, "builder");
        super();
        this.a = persistentOrderedMapBuilder0;
    }

    @Override  // kotlin.collections.e
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.e
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    @l
    public Iterator iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.a);
    }
}

