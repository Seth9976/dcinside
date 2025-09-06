package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;

public final class b {
    private static final int a = 0x200;
    private static final int b = 0x180;

    // 去混淆评级： 低(20)
    public static boolean a(Uri uri0) {
        return b.c(uri0) && uri0.getPathSegments().contains("picker");
    }

    // 去混淆评级： 低(20)
    public static boolean b(Uri uri0) {
        return b.c(uri0) && !b.f(uri0);
    }

    // 去混淆评级： 低(20)
    public static boolean c(Uri uri0) {
        return uri0 != null && "content".equals(uri0.getScheme()) && "media".equals(uri0.getAuthority());
    }

    // 去混淆评级： 低(20)
    public static boolean d(Uri uri0) {
        return b.c(uri0) && b.f(uri0);
    }

    public static boolean e(int v, int v1) {
        return v != 0x80000000 && v1 != 0x80000000 && v <= 0x200 && v1 <= 0x180;
    }

    private static boolean f(Uri uri0) {
        return uri0.getPathSegments().contains("video");
    }
}

