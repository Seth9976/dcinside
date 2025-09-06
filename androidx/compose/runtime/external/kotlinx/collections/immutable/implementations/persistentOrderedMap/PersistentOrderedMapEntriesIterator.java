package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapEntriesIterator implements a, Iterator {
    @l
    private final PersistentOrderedMapLinksIterator a;

    public PersistentOrderedMapEntriesIterator(@l PersistentOrderedMap persistentOrderedMap0) {
        L.p(persistentOrderedMap0, "map");
        super();
        this.a = new PersistentOrderedMapLinksIterator(persistentOrderedMap0.q(), persistentOrderedMap0.r());
    }

    @l
    public Map.Entry a() {
        return new MapEntry(this.a.b(), this.a.c().e());
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override
    public Object next() {
        return this.a();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

