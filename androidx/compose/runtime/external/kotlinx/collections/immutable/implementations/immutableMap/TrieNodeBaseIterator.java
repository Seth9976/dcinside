package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.a;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class TrieNodeBaseIterator implements a, Iterator {
    @l
    private Object[] a;
    private int b;
    private int c;

    public TrieNodeBaseIterator() {
        this.a = TrieNode.e.a().s();
    }

    public final Object a() {
        return this.a[this.c];
    }

    @l
    public final TrieNode b() {
        this.g();
        Object object0 = this.a[this.c];
        L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode)object0;
    }

    @l
    protected final Object[] c() {
        return this.a;
    }

    protected final int d() {
        return this.c;
    }

    public final boolean f() {
        return this.c < this.b;
    }

    public final boolean g() {
        return this.c < this.a.length;
    }

    public final void h() {
        this.c += 2;
    }

    @Override
    public boolean hasNext() {
        return this.f();
    }

    public final void i() {
        this.g();
        ++this.c;
    }

    public final void j(@l Object[] arr_object, int v) {
        L.p(arr_object, "buffer");
        this.k(arr_object, v, 0);
    }

    public final void k(@l Object[] arr_object, int v, int v1) {
        L.p(arr_object, "buffer");
        this.a = arr_object;
        this.b = v;
        this.c = v1;
    }

    protected final void l(int v) {
        this.c = v;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

