package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class TrieNodeMutableEntriesIterator extends TrieNodeBaseIterator {
    @l
    private final PersistentHashMapBuilderEntriesIterator d;

    public TrieNodeMutableEntriesIterator(@l PersistentHashMapBuilderEntriesIterator persistentHashMapBuilderEntriesIterator0) {
        L.p(persistentHashMapBuilderEntriesIterator0, "parentIterator");
        super();
        this.d = persistentHashMapBuilderEntriesIterator0;
    }

    @l
    public Map.Entry m() {
        this.l(this.d() + 2);
        return new MutableMapEntry(this.d, this.c()[this.d() - 2], this.c()[this.d() - 1]);
    }

    @Override
    public Object next() {
        return this.m();
    }
}

