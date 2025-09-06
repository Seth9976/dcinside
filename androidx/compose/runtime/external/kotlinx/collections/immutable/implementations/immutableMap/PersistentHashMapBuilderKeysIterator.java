package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashMapBuilderKeysIterator extends PersistentHashMapBuilderBaseIterator {
    public PersistentHashMapBuilderKeysIterator(@l PersistentHashMapBuilder persistentHashMapBuilder0) {
        L.p(persistentHashMapBuilder0, "builder");
        TrieNodeBaseIterator[] arr_trieNodeBaseIterator = new TrieNodeBaseIterator[8];
        for(int v = 0; v < 8; ++v) {
            arr_trieNodeBaseIterator[v] = new TrieNodeKeysIterator();
        }
        super(persistentHashMapBuilder0, arr_trieNodeBaseIterator);
    }
}

