package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.L;
import y4.l;

final class g extends ByteArrayOutputStream {
    public g(int v) {
        super(v);
    }

    @l
    public final byte[] a() {
        byte[] arr_b = this.buf;
        L.o(arr_b, "buf");
        return arr_b;
    }
}

