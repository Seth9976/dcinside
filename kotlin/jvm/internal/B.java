package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.r;
import y4.l;

final class b extends r {
    @l
    private final boolean[] a;
    private int b;

    public b(@l boolean[] arr_z) {
        L.p(arr_z, "array");
        super();
        this.a = arr_z;
    }

    @Override  // kotlin.collections.r
    public boolean b() {
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

