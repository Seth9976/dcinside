package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

class p extends o {
    @l
    public static final k M(@l File file0, @l kotlin.io.l l0) {
        L.p(file0, "<this>");
        L.p(l0, "direction");
        return new k(file0, l0);
    }

    public static k N(File file0, kotlin.io.l l0, int v, Object object0) {
        if((v & 1) != 0) {
            l0 = kotlin.io.l.a;
        }
        return p.M(file0, l0);
    }

    @l
    public static final k O(@l File file0) {
        L.p(file0, "<this>");
        return p.M(file0, kotlin.io.l.b);
    }

    @l
    public static final k P(@l File file0) {
        L.p(file0, "<this>");
        return p.M(file0, kotlin.io.l.a);
    }
}

