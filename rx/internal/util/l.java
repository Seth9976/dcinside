package rx.internal.util;

import android.os.Build.VERSION;

public final class l {
    public static final int a;
    private static final int b;
    private static final boolean c;

    static {
        int v = l.c();
        l.b = v;
        l.c = v != 0;
    }

    private l() {
        throw new IllegalStateException("No instances!");
    }

    public static int a() [...] // 潜在的解密器

    public static boolean b() [...] // 潜在的解密器

    // 去混淆评级： 低(40)
    private static int c() {
        return Build.VERSION.SDK_INT;
    }
}

