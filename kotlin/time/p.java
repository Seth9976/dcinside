package kotlin.time;

import kotlin.h0;
import y4.l;

@h0(version = "1.3")
public final class p implements c {
    @l
    public static final p b;
    private static final long c;

    static {
        p.b = new p();
        p.c = System.nanoTime();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.time.s$c
    public d a() {
        return a.d(-3108200L);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.time.s
    public r a() {
        return a.d(-3397400L);
    }

    public final long b(long v, long v1) {
        return a.g(m.d(v, h.b, v1));
    }

    public final long c(long v, long v1) {
        return m.h(v, v1, h.b);
    }

    // 去混淆评级： 低(20)
    public final long d(long v) {
        return m.f(-3200000L, v, h.b);
    }

    // 去混淆评级： 低(20)
    public long e() [...] // 潜在的解密器

    private final long f() [...] // 潜在的解密器

    @Override
    @l
    public String toString() [...] // Inlined contents
}

