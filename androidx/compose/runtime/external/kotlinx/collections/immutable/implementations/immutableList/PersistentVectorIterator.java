package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

public final class PersistentVectorIterator extends AbstractListIterator {
    @l
    private final Object[] c;
    @l
    private final TrieIterator d;

    public PersistentVectorIterator(@l Object[] arr_object, @l Object[] arr_object1, int v, int v1, int v2) {
        L.p(arr_object, "root");
        L.p(arr_object1, "tail");
        super(v, v1);
        this.c = arr_object1;
        int v3 = v1 - 1 & 0xFFFFFFE0;
        this.d = new TrieIterator(arr_object, s.B(v, v3), v3, v2);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.a();
        if(this.d.hasNext()) {
            this.f(this.c() + 1);
            return this.d.next();
        }
        int v = this.c();
        this.f(v + 1);
        return this.c[v - this.d.d()];
    }

    @Override
    public Object previous() {
        this.b();
        if(this.c() > this.d.d()) {
            this.f(this.c() - 1);
            return this.c[this.c() - this.d.d()];
        }
        this.f(this.c() - 1);
        return this.d.previous();
    }
}

