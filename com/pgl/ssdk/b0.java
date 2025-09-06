package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.provider.Settings.Secure;
import java.lang.reflect.Method;
import java.util.Locale;

public class b0 {
    private static double a = -1.0;

    static {
    }

    public static String a() {
        return Build.VERSION.SDK_INT < 24 ? Locale.getDefault().getLanguage() : LocaleList.getDefault().get(0).getLanguage();
    }

    public static String a(Context context0) {
        String s = null;
        try {
            s = Settings.Secure.getString(context0.getContentResolver(), "android_id");
        }
        catch(Throwable unused_ex) {
        }
        return s == null ? "" : s.trim();
    }

    public static String b() [...] // 潜在的解密器

    public static String b(Context context0) {
        double f = b0.a;
        double f1 = 0.0;
        if(f >= 0.0) {
            return Integer.toString(((int)f));
        }
        try {
            Class class0 = Class.forName("com.android.internal.os.PowerProfile");
            Object object0 = class0.getConstructor(Context.class).newInstance(context0);
            Method method0 = class0.getDeclaredMethod("getAveragePower", String.class);
            method0.setAccessible(true);
            f1 = (double)(((Double)method0.invoke(object0, "battery.capacity")));
        }
        catch(Throwable unused_ex) {
        }
        b0.a = f1;
        return Integer.toString(((int)f1));
    }

    public static String c() [...] // Inlined contents

    @SuppressLint({"MissingPermission"})
    public static String c(Context context0) [...] // Inlined contents
}

