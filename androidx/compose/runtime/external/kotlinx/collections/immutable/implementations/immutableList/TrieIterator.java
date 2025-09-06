package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import y4.l;

public final class TrieIterator extends AbstractListIterator {
    private int c;
    @l
    private Object[] d;
    private boolean e;

    public TrieIterator(@l Object[] arr_object, int v, int v1, int v2) {
        L.p(arr_object, "root");
        super(v, v1);
        this.c = v2;
        Object[] arr_object1 = new Object[v2];
        this.d = arr_object1;
        int v3 = v == v1 ? 1 : 0;
        this.e = v3;
        arr_object1[0] = arr_object;
        this.i(v - v3, 1);
    }

    private final Object h() {
        Object object0 = this.d[this.c - 1];
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[])object0)[this.c() & 0x1F];
    }

    private final void i(int v, int v1) {
        int v2 = (this.c - v1) * 5;
        while(v1 < this.c) {
            Object[] arr_object = this.d;
            Object object0 = arr_object[v1 - 1];
            L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            arr_object[v1] = ((Object[])object0)[v >> v2 & 0x1F];
            v2 -= 5;
            ++v1;
        }
    }

    private final void j(int v) {
        int v1;
        for(v1 = 0; (this.c() >> v1 & 0x1F) == v; v1 += 5) {
        }
        if(v1 > 0) {
            this.i(this.c(), this.c - 1 - v1 / 5 + 1);
        }
    }

    public final void k(@l Object[] arr_object, int v, int v1, int v2) {
        L.p(arr_object, "root");
        this.f(v);
        this.g(v1);
        this.c = v2;
        if(this.d.length < v2) {
            this.d = new Object[v2];
        }
        int v3 = 0;
        this.d[0] = arr_object;
        if(v == v1) {
            v3 = 1;
        }
        this.e = v3;
        this.i(v - v3, 1);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.h();
        this.f(this.c() + 1);
        if(this.c() == this.d()) {
            this.e = true;
            return object0;
        }
        this.j(0);
        return object0;
    }

    @Override
    public Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f(this.c() - 1);
        if(this.e) {
            this.e = false;
            return this.h();
        }
        this.j(0x1F);
        return this.h();
    }
}

