package kotlinx.coroutines;

import kotlin.b0;
import kotlinx.coroutines.internal.G;
import kotlinx.coroutines.internal.Y;
import y4.l;

public final class W {
    private static final boolean a;
    @l
    private static final Z b;

    static {
        W.a = Y.f("kotlinx.coroutines.main.delay", false);
        W.b = W.c();
    }

    @l
    public static final Z a() {
        return W.b;
    }

    @b0
    public static void b() {
    }

    private static final Z c() {
        if(!W.a) {
            return V.h;
        }
        U0 u00 = h0.e();
        return !G.d(u00) && u00 instanceof Z ? ((Z)u00) : V.h;
    }
}

