package kotlin.jvm.internal;

import B3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import y4.l;

final class h implements a, Iterator {
    @l
    private final Object[] a;
    private int b;

    public h(@l Object[] arr_object) {
        L.p(arr_object, "array");
        super();
        this.a = arr_object;
    }

    @l
    public final Object[] a() {
        return this.a;
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override
    public Object next() {
        try {
            int v = this.b;
            this.b = v + 1;
            return this.a[v];
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            --this.b;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException0.getMessage());
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

