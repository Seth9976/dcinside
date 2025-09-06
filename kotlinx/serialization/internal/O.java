package kotlinx.serialization.internal;

import kotlin.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class o {
    private static final boolean a;

    static {
        Boolean boolean0 = ClassValue.class;
        if(e0.j(boolean0)) {
            Class class0 = (Class)boolean0;
            boolean0 = Boolean.TRUE;
        }
        o.a = (e0.i(boolean0) ? Boolean.FALSE : boolean0).booleanValue();
    }

    @l
    public static final I0 a(@l Function1 function10) {
        L.p(function10, "factory");
        return o.a ? new t(function10) : new z(function10);
    }

    @l
    public static final s0 b(@l A3.o o0) {
        L.p(o0, "factory");
        return o.a ? new v(o0) : new A(o0);
    }
}

