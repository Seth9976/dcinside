package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.d;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashMapBuilderEntriesIterator implements d, Iterator {
    @l
    private final PersistentHashMapBuilderBaseIterator a;

    public PersistentHashMapBuilderEntriesIterator(@l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "builder");
        super();
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = new TrieNodeBaseIterator[8];
        for(int v = 0; v < 8; ++v) {
            arr_trieNodeBaseIterator[v] = new TrieNodeMutableEntriesIterator(this);
        }
        this.a = new PersistentHashMapBuilderBaseIterator(persistentHashMapBuilder0, arr_trieNodeBaseIterator);
    }

    @l
    public Map.Entry a() {
        return (Map.Entry)this.a.next();
    }

    public final void b(Object object0, Object object1) {
        this.a.m(object0, object1);
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

