package com.iab.omid.library.bytedance2;

import android.content.Context;

public final class Omid {
    private static b INSTANCE;

    static {
        Omid.INSTANCE = new b();
    }

    public static void activate(Context context0) {
        Omid.INSTANCE.a(context0.getApplicationContext());
    }

    public static String getVersion() {
        return "1.4.12-Bytedance2";
    }

    public static boolean isActive() [...] // 潜在的解密器

    public static void updateLastActivity() {
        Omid.INSTANCE.c();
    }
}

