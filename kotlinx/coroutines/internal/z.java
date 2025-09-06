package kotlinx.coroutines.internal;

import y4.l;
import y4.m;

final class Z {
    private static final int a;

    static {
        Z.a = Runtime.getRuntime().availableProcessors();
    }

    public static final int a() [...] // 潜在的解密器

    @m
    public static final String b(@l String s) {
        try {
            return System.getProperty(s);
        }
        catch(SecurityException unused_ex) {
            return null;
        }
    }
}

