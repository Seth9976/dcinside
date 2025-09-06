package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.a;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapKeysIterator implements a, Iterator {
    @l
    private final PersistentOrderedMapLinksIterator a;

    public PersistentOrderedMapKeysIterator(@l PersistentOrderedMap persistentOrderedMap0) {
        L.p(persistentOrderedMap0, "map");
        super();
        this.a = new PersistentOrderedMapLinksIterator(persistentOrderedMap0.q(), persistentOrderedMap0.r());
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        this.a.c();
        return this.a.b();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

