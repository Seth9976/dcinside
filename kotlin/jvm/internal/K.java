package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.U;
import y4.l;

final class k extends U {
    @l
    private final long[] a;
    private int b;

    public k(@l long[] arr_v) {
        L.p(arr_v, "array");
        super();
        this.a = arr_v;
    }

    @Override  // kotlin.collections.U
    public long b() {
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

