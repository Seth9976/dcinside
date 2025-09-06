package r0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.L;
import y4.l;

public final class b implements a {
    @l
    private final byte[] a;

    public b(@l byte[] arr_b) {
        L.p(arr_b, "bytes");
        super();
        this.a = arr_b;
    }

    @Override  // r0.a
    @l
    public InputStream a() throws IOException {
        return new ByteArrayInputStream(this.a);
    }

    @Override  // r0.a
    @l
    public byte[] read() {
        return this.a;
    }

    @Override  // r0.a
    public long size() {
        return (long)this.a.length;
    }
}

