package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map.Entry;
import y4.l;

public final class TrieNodeEntriesIterator extends TrieNodeBaseIterator {
    @l
    public Map.Entry m() {
        this.l(this.d() + 2);
        return new MapEntry(this.c()[this.d() - 2], this.c()[this.d() - 1]);
    }

    @Override
    public Object next() {
        return this.m();
    }
}

