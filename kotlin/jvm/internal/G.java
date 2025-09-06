package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.T;
import y4.l;

final class g extends T {
    @l
    private final int[] a;
    private int b;

    public g(@l int[] arr_v) {
        L.p(arr_v, "array");
        super();
        this.a = arr_v;
    }

    @Override  // kotlin.collections.T
    public int b() {
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

