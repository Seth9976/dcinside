package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({Scope.b})
public class l {
    private static final String a = "lge";
    private static final String b = "samsung";
    private static final String c = "meizu";

    @NonNull
    private static String a() {
        return Build.MANUFACTURER == null ? "" : Build.MANUFACTURER.toLowerCase(Locale.ENGLISH);
    }

    // 去混淆评级： 低(20)
    public static boolean b() {
        return l.c() || l.e();
    }

    public static boolean c() {
        return l.a().equals("lge");
    }

    public static boolean d() {
        return l.a().equals("meizu");
    }

    public static boolean e() {
        return l.a().equals("samsung");
    }
}

