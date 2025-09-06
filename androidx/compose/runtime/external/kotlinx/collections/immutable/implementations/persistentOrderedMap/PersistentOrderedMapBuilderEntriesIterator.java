package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.d;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentOrderedMapBuilderEntriesIterator implements d, Iterator {
    @l
    private final PersistentOrderedMapBuilderLinksIterator a;

    public PersistentOrderedMapBuilderEntriesIterator(@l PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        L.p(persistentOrderedMapBuilder0, "map");
        super();
        this.a = new PersistentOrderedMapBuilderLinksIterator(persistentOrderedMapBuilder0.f(), persistentOrderedMapBuilder0);
    }

    @l
    public Map.Entry a() {
        LinkedValue linkedValue0 = this.a.h();
        return new MutableMapEntry(this.a.d().g(), this.a.g(), linkedValue0);
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
        this.a.remove();
    }
}

