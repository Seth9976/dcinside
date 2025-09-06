package S0;

import java.util.concurrent.atomic.AtomicLong;
import y4.l;
import z3.n;

public final class w {
    @l
    public static final w a;
    @l
    private static final AtomicLong b;

    static {
        w.a = new w();
        w.b = new AtomicLong();
    }

    @n
    public static final long a() {
        return w.b.incrementAndGet();
    }

    @l
    @n
    public static final String b(long v) {
        return "v" + v;
    }
}

