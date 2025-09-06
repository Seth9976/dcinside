package kotlin.random;

import java.util.Random;
import kotlin.h0;
import kotlin.internal.m;
import kotlin.jvm.internal.L;
import y4.l;

public final class e {
    @h0(version = "1.3")
    @l
    public static final Random a(@l f f0) {
        L.p(f0, "<this>");
        a a0 = f0 instanceof a ? ((a)f0) : null;
        if(a0 != null) {
            Random random0 = a0.r();
            if(random0 != null) {
                return random0;
            }
        }
        return new c(f0);
    }

    @h0(version = "1.3")
    @l
    public static final f b(@l Random random0) {
        L.p(random0, "<this>");
        c c0 = random0 instanceof c ? ((c)random0) : null;
        if(c0 != null) {
            f f0 = c0.a();
            if(f0 != null) {
                return f0;
            }
        }
        return new d(random0);
    }

    @kotlin.internal.f
    private static final f c() {
        return m.a.b();
    }

    public static final double d(int v, int v1) {
        return ((double)((((long)v) << 27) + ((long)v1))) / 9007199254740992.0;
    }
}

