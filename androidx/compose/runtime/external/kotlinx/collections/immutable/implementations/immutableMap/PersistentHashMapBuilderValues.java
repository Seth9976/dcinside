package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashMapBuilderValues extends e implements b, Collection {
    @l
    private final PersistentHashMapBuilder a;

    public PersistentHashMapBuilderValues(@l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "builder");
        super();
        this.a = persistentHashMapBuilder0;
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
        return new PersistentHashMapBuilderValuesIterator(this.a);
    }
}

