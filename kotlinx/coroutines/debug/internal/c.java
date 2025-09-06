package kotlinx.coroutines.debug.internal;

import kotlin.jvm.internal.L;
import kotlinx.coroutines.internal.V;
import y4.l;

public final class c {
    private static final int a = -1640531527;
    private static final int b = 16;
    @l
    private static final V c;
    @l
    private static final kotlinx.coroutines.debug.internal.l d;
    @l
    private static final kotlinx.coroutines.debug.internal.l e;

    static {
        c.c = new V("REHASH");
        c.d = new kotlinx.coroutines.debug.internal.l(null);
        c.e = new kotlinx.coroutines.debug.internal.l(Boolean.TRUE);
    }

    private static final kotlinx.coroutines.debug.internal.l d(Object object0) {
        if(object0 == null) {
            return c.d;
        }
        return L.g(object0, Boolean.TRUE) ? c.e : new kotlinx.coroutines.debug.internal.l(object0);
    }

    private static final Void e() {
        throw new UnsupportedOperationException("not implemented");
    }
}

