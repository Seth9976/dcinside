package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import kotlin.collections.t;
import y4.l;

final class d extends t {
    @l
    private final char[] a;
    private int b;

    public d(@l char[] arr_c) {
        L.p(arr_c, "array");
        super();
        this.a = arr_c;
    }

    @Override  // kotlin.collections.t
    public char b() {
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

