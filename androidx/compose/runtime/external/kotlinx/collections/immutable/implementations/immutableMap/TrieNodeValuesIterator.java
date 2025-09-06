package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

public final class TrieNodeValuesIterator extends TrieNodeBaseIterator {
    @Override
    public Object next() {
        this.l(this.d() + 2);
        return this.c()[this.d() - 1];
    }
}

