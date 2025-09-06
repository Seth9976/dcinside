package okio;

import java.util.zip.Deflater;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "-DeflaterSinkExtensions")
public final class b {
    @l
    public static final r a(@l m0 m00, @l Deflater deflater0) {
        L.p(m00, "<this>");
        L.p(deflater0, "deflater");
        return new r(m00, deflater0);
    }

    public static r b(m0 m00, Deflater deflater0, int v, Object object0) {
        if((v & 1) != 0) {
            deflater0 = new Deflater();
        }
        L.p(m00, "<this>");
        L.p(deflater0, "deflater");
        return new r(m00, deflater0);
    }
}

