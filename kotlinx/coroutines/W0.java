package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import y4.l;
import z3.i;

public final class w0 {
    @x0
    public static void a() {
    }

    @l
    public static final Executor b(@l K k0) {
        u0 u00 = k0 instanceof u0 ? ((u0)k0) : null;
        if(u00 != null) {
            Executor executor0 = u00.u1();
            if(executor0 != null) {
                return executor0;
            }
        }
        return new g0(k0);
    }

    @l
    @i(name = "from")
    public static final K c(@l Executor executor0) {
        g0 g00 = executor0 instanceof g0 ? ((g0)executor0) : null;
        if(g00 != null) {
            K k0 = g00.a;
            if(k0 != null) {
                return k0;
            }
        }
        return new v0(executor0);
    }

    @l
    @i(name = "from")
    public static final u0 d(@l ExecutorService executorService0) {
        return new v0(executorService0);
    }
}

