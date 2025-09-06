package okio;

import java.util.zip.Inflater;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@i(name = "-InflaterSourceExtensions")
public final class h {
    @l
    public static final E a(@l o0 o00, @l Inflater inflater0) {
        L.p(o00, "<this>");
        L.p(inflater0, "inflater");
        return new E(o00, inflater0);
    }

    public static E b(o0 o00, Inflater inflater0, int v, Object object0) {
        if((v & 1) != 0) {
            inflater0 = new Inflater();
        }
        L.p(o00, "<this>");
        L.p(inflater0, "inflater");
        return new E(o00, inflater0);
    }
}

