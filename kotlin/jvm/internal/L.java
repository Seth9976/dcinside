package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.o0;

final class l extends o0 {
    @y4.l
    private final short[] a;
    private int b;

    public l(@y4.l short[] arr_v) {
        L.p(arr_v, "array");
        super();
        this.a = arr_v;
    }

    @Override  // kotlin.collections.o0
    public short b() {
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
    public boolean hasNext() {
        return this.b < this.a.length;
    }
}

