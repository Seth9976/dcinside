package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.F;
import y4.l;

final class e extends F {
    @l
    private final double[] a;
    private int b;

    public e(@l double[] arr_f) {
        L.p(arr_f, "array");
        super();
        this.a = arr_f;
    }

    @Override  // kotlin.collections.F
    public double b() {
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

