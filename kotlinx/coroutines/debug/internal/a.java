package kotlinx.coroutines.debug.internal;

import y4.l;

public final class a {
    @l
    public static final a a;
    private static boolean b;

    static {
        a.a = new a();
    }

    public final boolean a() [...] // 潜在的解密器

    public final void b(boolean z) {
        a.b = z;
    }
}

