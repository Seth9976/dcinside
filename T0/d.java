package t0;

import java.io.Closeable;
import kotlin.jvm.internal.w;
import y4.m;

public final class d extends a {
    public d() {
        this(null, 1, null);
    }

    public d(@m Closeable closeable0) {
        super(closeable0, c.a);
    }

    public d(Closeable closeable0, int v, w w0) {
        if((v & 1) != 0) {
            closeable0 = null;
        }
        this(closeable0);
    }
}

