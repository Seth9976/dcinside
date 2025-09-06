package com.apm.insight.l;

import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

public final class l {
    private static final CharSequence a;
    private static final CharSequence b;

    static {
        l.a = "amigo";
        l.b = "funtouch";
    }

    public static String a() {
        String s = "";
        if(d.b()) {
            return d.b() ? "miui_" + l.a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL : "";
        }
        if(d.c()) {
            String s1 = Build.DISPLAY;
            return s1 == null || !s1.toLowerCase(Locale.getDefault()).contains("flyme") ? "" : s1;
        }
        if(l.b()) {
            return l.b() ? "coloros_" + l.a("ro.build.version.opporom") + "_" + Build.DISPLAY : "";
        }
        String s2 = d.a();
        String s3 = s2 == null || !s2.toLowerCase(Locale.getDefault()).contains("emotionui") ? "" : s2 + "_" + Build.DISPLAY;
        if(!TextUtils.isEmpty(s3)) {
            return s3;
        }
        String s4 = l.a("ro.vivo.os.build.display.id");
        if(!TextUtils.isEmpty(s4) && s4.toLowerCase(Locale.getDefault()).contains(l.b)) {
            return l.a("ro.vivo.os.build.display.id") + "_" + l.a("ro.vivo.product.version");
        }
        String s5 = Build.DISPLAY;
        if(!TextUtils.isEmpty(s5) && s5.toLowerCase(Locale.getDefault()).contains(l.a)) {
            return s5 + "_" + l.a("ro.gn.sv.version");
        }
        String s6 = Build.MANUFACTURER + Build.BRAND;
        if(!TextUtils.isEmpty(s6)) {
            String s7 = s6.toLowerCase(Locale.getDefault());
            if(s7.contains("360") || s7.contains("qiku")) {
                return l.a("ro.build.uiversion") + "_" + s5;
            }
        }
        if(!TextUtils.isEmpty(l.a("ro.letv.release.version"))) {
            s = "eui_" + l.a("ro.letv.release.version") + "_" + s5;
        }
        return TextUtils.isEmpty(s) ? s5 : s;
    }

    private static String a(String s) {
        BufferedReader bufferedReader0;
        String s1 = "";
        try {
            Process process0 = Runtime.getRuntime().exec("getprop " + s);
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(new InputStreamReader(process0.getInputStream()), 0x400);
            s1 = bufferedReader0.readLine();
            process0.destroy();
        }
        catch(Throwable unused_ex) {
            a.a(bufferedReader0);
            return s1;
        }
        a.a(bufferedReader0);
        return s1;
    }

    private static boolean b() {
        String s = Build.MANUFACTURER;
        return TextUtils.isEmpty(s) ? false : s.toLowerCase(Locale.getDefault()).contains("oppo");
    }
}

