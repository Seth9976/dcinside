package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.d;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapBuilderKeysIterator implements d, Iterator {
    @l
    private final PersistentOrderedMapBuilderLinksIterator a;

    public PersistentOrderedMapBuilderKeysIterator(@l PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        L.p(persistentOrderedMapBuilder0, "map");
        super();
        this.a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder0.f(), persistentOrderedMapBuilder0);
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        this.a.h();
        return this.a.g();
    }

    @Override
    public void remove() {
        this.a.remove();
    }
}

