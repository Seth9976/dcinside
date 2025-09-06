package kotlin.io.encoding;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

class h {
    @h0(version = "1.8")
    @f
    @l
    public static final InputStream a(@l InputStream inputStream0, @l a a0) {
        L.p(inputStream0, "<this>");
        L.p(a0, "base64");
        return new d(inputStream0, a0);
    }

    @h0(version = "1.8")
    @f
    @l
    public static final OutputStream b(@l OutputStream outputStream0, @l a a0) {
        L.p(outputStream0, "<this>");
        L.p(a0, "base64");
        return new e(outputStream0, a0);
    }
}

