package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.K;
import y4.l;

final class f extends K {
    @l
    private final float[] a;
    private int b;

    public f(@l float[] arr_f) {
        L.p(arr_f, "array");
        super();
        this.a = arr_f;
    }

    @Override  // kotlin.collections.K
    public float b() {
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

