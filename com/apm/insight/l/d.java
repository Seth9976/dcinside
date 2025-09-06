package com.apm.insight.l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.a;
import com.apm.insight.k.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {
    private static boolean a = false;
    private static int b = -1;
    private static final Pattern c;

    static {
        d.c = Pattern.compile("^0-([\\d]+)$");
    }

    public static String a() {
        return d.b("ro.build.version.emui");
    }

    public static boolean a(String s) {
        if(TextUtils.isEmpty(s)) {
            s = d.b("ro.build.version.emui");
        }
        return TextUtils.isEmpty(s) || !s.toLowerCase(Locale.getDefault()).startsWith("emotionui") ? d.e() : true;
    }

    private static String b(String s) {
        BufferedReader bufferedReader0;
        String s1 = null;
        try {
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + s).getInputStream()), 0x400);
            s1 = bufferedReader0.readLine();
            bufferedReader0.close();
        }
        catch(Throwable unused_ex) {
            a.a(bufferedReader0);
            return s1;
        }
        a.a(bufferedReader0);
        return s1;
    }

    public static boolean b() {
        if(!d.a) {
            try {
                Class.forName("miui.os.Build");
                e.a = true;
                d.a = true;
                return true;
            }
            catch(Exception unused_ex) {
                d.a = true;
            }
        }
        return e.a;
    }

    private static int c(String s) {
        int v;
        BufferedReader bufferedReader0 = null;
        try {
            bufferedReader0 = new BufferedReader(new InputStreamReader(new FileInputStream(s)));
            String s1 = bufferedReader0.readLine();
            if(s1 != null) {
                v = d.d(s1);
                goto label_8;
            }
        }
        catch(Throwable unused_ex) {
            if(bufferedReader0 == null) {
                return -1;
            }
        }
        goto label_10;
        try {
        label_8:
            bufferedReader0.close();
        }
        catch(IOException unused_ex) {
        }
        return v;
        try {
        label_10:
            bufferedReader0.close();
        }
        catch(IOException unused_ex) {
        }
        return -1;
    }

    // 去混淆评级： 中等(50)
    public static boolean c() {
        return Build.DISPLAY.contains("Flyme");
    }

    public static int d() {
        int v = d.b;
        if(v > 0) {
            return v;
        }
        int v1 = d.c("/sys/devices/system/cpu/possible");
        if(v1 <= 0) {
            v1 = d.c("/sys/devices/system/cpu/present");
        }
        if(v1 <= 0) {
            v1 = d.e("/sys/devices/system/cpu/");
        }
        if(v1 <= 0) {
            v1 = Runtime.getRuntime().availableProcessors();
        }
        if(v1 <= 0) {
            v1 = 1;
        }
        d.b = v1;
        return v1;
    }

    private static int d(String s) {
        Matcher matcher0 = d.c.matcher(s);
        if(matcher0.matches()) {
            String s1 = matcher0.group(1);
            try {
                return Integer.parseInt(s1) + 1;
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return -1;
    }

    private static int e(String s) {
        try {
            File[] arr_file = new File(s).listFiles(new FilenameFilter() {
                private final Pattern a;

                {
                    this.a = Pattern.compile("^cpu[\\d]+$");
                }

                @Override
                public final boolean accept(File file0, String s) {
                    return this.a.matcher(s).matches();
                }
            });
            if(arr_file != null && arr_file.length > 0) {
                return arr_file.length;
            }
        }
        catch(Throwable unused_ex) {
        }
        return -1;
    }

    private static boolean e() {
        try {
            String s = Build.BRAND;
            if(TextUtils.isEmpty(s) || !s.toLowerCase(Locale.getDefault()).startsWith("huawei")) {
                String s1 = Build.MANUFACTURER;
                return !TextUtils.isEmpty(s1) && s1.toLowerCase(Locale.getDefault()).startsWith("huawei");
            }
            return true;
        }
        catch(Throwable unused_ex) {
        }
        return false;
    }
}

