package kotlinx.coroutines.scheduling;

import y4.l;

public final class h extends j {
    @l
    public static final h a;

    static {
        h.a = new h();
    }

    @Override  // kotlinx.coroutines.scheduling.j
    public long a() {
        return System.nanoTime();
    }
}

