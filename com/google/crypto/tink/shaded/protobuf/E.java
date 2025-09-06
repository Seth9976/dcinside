package com.google.crypto.tink.shaded.protobuf;

final class e {
    private static boolean a;
    private static final Class b;
    private static final boolean c;

    static {
        e.b = e.a("libcore.io.Memory");
        e.c = e.a("org.robolectric.Robolectric") != null;
    }

    private static Class a(String s) {
        try {
            return Class.forName(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static Class b() {
        return e.b;
    }

    // 去混淆评级： 低(20)
    static boolean c() [...] // 潜在的解密器
}

