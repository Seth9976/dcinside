package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;
import y4.l;

public final class y {
    public static final int a(@l AtomicInteger atomicInteger0) {
        return atomicInteger0.get();
    }

    public static final void b(@l AtomicInteger atomicInteger0, int v) {
        atomicInteger0.set(v);
    }
}

