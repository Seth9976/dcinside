package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.s;
import y4.l;

final class c extends s {
    @l
    private final byte[] a;
    private int b;

    public c(@l byte[] arr_b) {
        L.p(arr_b, "array");
        super();
        this.a = arr_b;
    }

    @Override
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override  // kotlin.collections.s
    public byte nextByte() {
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
}

