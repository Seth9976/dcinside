package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import y4.l;

public final class BufferIterator extends AbstractListIterator {
    @l
    private final Object[] c;

    public BufferIterator(@l Object[] arr_object, int v, int v1) {
        L.p(arr_object, "buffer");
        super(v, v1);
        this.c = arr_object;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.c();
        this.f(v + 1);
        return this.c[v];
    }

    @Override
    public Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f(this.c() - 1);
        return this.c[this.c()];
    }
}

