package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashMapEntriesIterator extends PersistentHashMapBaseIterator {
    public PersistentHashMapEntriesIterator(@l TrieNode trieNode0) {
        L.p(trieNode0, "node");
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = new TrieNodeBaseIterator[8];
        for(int v = 0; v < 8; ++v) {
            arr_trieNodeBaseIterator[v] = new TrieNodeEntriesIterator();
        }
        super(trieNode0, arr_trieNodeBaseIterator);
    }
}

