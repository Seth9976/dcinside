package com.google.protobuf;

final class c {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class MEMORY_CLASS;

    static {
        c.MEMORY_CLASS = c.getClassForName("libcore.io.Memory");
        c.IS_ROBOLECTRIC = c.getClassForName("org.robolectric.Robolectric") != null;
    }

    private static Class getClassForName(String s) {
        try {
            return Class.forName(s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    static Class getMemoryClass() {
        return c.MEMORY_CLASS;
    }

    // 去混淆评级： 低(20)
    static boolean isOnAndroidDevice() [...] // 潜在的解密器
}

