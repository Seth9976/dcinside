package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.NonNull;
import com.google.firebase.perf.logging.a;
import okhttp3.HttpUrl;

public class m {
    private static Boolean a;

    static {
    }

    public static int a(@NonNull byte[] arr_b) {
        int v1 = 0;
        for(int v = 0; v < 4 && v < arr_b.length; ++v) {
            v1 |= (arr_b[v] & 0xFF) << v * 8;
        }
        return v1;
    }

    public static void b(boolean z, String s) {
        if(!z) {
            throw new IllegalArgumentException(s);
        }
    }

    public static boolean c(@NonNull Context context0) {
        Boolean boolean0 = m.a;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        try {
            Boolean boolean1 = Boolean.valueOf(context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            m.a = boolean1;
            return boolean1.booleanValue();
        }
        catch(PackageManager.NameNotFoundException | NullPointerException packageManager$NameNotFoundException0) {
            a.e().a("No perf logcat meta data found " + packageManager$NameNotFoundException0.getMessage());
            return false;
        }
    }

    public static int d(long v) {
        if(v > 0x7FFFFFFFL) {
            return 0x7FFFFFFF;
        }
        return v >= 0xFFFFFFFF80000000L ? ((int)v) : 0x80000000;
    }

    // 去混淆评级： 低(20)
    public static String e(@NonNull String s) {
        return HttpUrl.parse(s) == null ? s : "///";
    }

    public static String f(String s, int v) {
        if(s.length() <= v) {
            return s;
        }
        if(s.charAt(v) == 0x2F) {
            return s.substring(0, v);
        }
        HttpUrl httpUrl0 = HttpUrl.parse(s);
        if(httpUrl0 == null) {
            return s.substring(0, v);
        }
        if(httpUrl0.encodedPath().lastIndexOf(0x2F) >= 0) {
            int v1 = s.lastIndexOf(0x2F, v - 1);
            return v1 < 0 ? s.substring(0, v) : s.substring(0, v1);
        }
        return s.substring(0, v);
    }
}

