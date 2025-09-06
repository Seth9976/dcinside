package kotlin;

import A3.a;
import kotlin.internal.f;
import kotlin.jvm.internal.L;

class k0 extends j0 {
    @f
    private static final Object l(Object object0, a a0) {
        L.p(object0, "lock");
        L.p(a0, "block");
        synchronized(object0) {
            return a0.invoke();
        }
    }
}

