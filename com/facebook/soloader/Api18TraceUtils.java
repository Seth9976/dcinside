package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import o3.h;

@TargetApi(18)
@f
class Api18TraceUtils {
    private static final int a = 0x7F;

    public static void a(String s, @h String s1, String s2) {
        Trace.beginSection(((s + s1 + s2).length() <= 0x7F || s1 == null ? s + s1 + s2 : s + s1.substring(0, 0x7F - s.length() - s2.length()) + s2));
    }

    public static void b() {
        Trace.endSection();
    }
}

