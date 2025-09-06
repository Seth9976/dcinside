package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.jvm.internal.L;
import y4.l;

public final class TrieNodeIterator {
    @l
    private Object[] a;
    private int b;

    public TrieNodeIterator() {
        this.a = TrieNode.d.a().n();
    }

    public final Object a() {
        this.d();
        return this.a[this.b];
    }

    @l
    public final TrieNode b() {
        this.e();
        Object object0 = this.a[this.b];
        L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode)object0;
    }

    public final boolean c() {
        return this.b < this.a.length;
    }

    // 去混淆评级： 低(20)
    public final boolean d() {
        return this.c() && !(this.a[this.b] instanceof TrieNode);
    }

    // 去混淆评级： 低(20)
    public final boolean e() {
        return this.c() && this.a[this.b] instanceof TrieNode;
    }

    public final void f() {
        ++this.b;
    }

    public final Object g() {
        this.d();
        int v = this.b;
        this.b = v + 1;
        return this.a[v];
    }

    public final void h(@l Object[] arr_object, int v) {
        L.p(arr_object, "buffer");
        this.a = arr_object;
        this.b = v;
    }

    public static void i(TrieNodeIterator trieNodeIterator0, Object[] arr_object, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        trieNodeIterator0.h(arr_object, v);
    }
}

