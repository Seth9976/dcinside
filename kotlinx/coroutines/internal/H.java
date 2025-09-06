package kotlinx.coroutines.internal;

import A3.o;
import java.util.concurrent.atomic.AtomicReference;
import y4.l;

public final class h {
    public static final Object a(@l AtomicReference atomicReference0) {
        return atomicReference0.get();
    }

    public static void b(AtomicReference atomicReference0) {
    }

    public static final void c(@l AtomicReference atomicReference0, @l o o0) {
        while(true) {
            o0.invoke(atomicReference0, h.a(atomicReference0));
        }
    }

    public static final void d(@l AtomicReference atomicReference0, Object object0) {
        atomicReference0.set(object0);
    }
}

