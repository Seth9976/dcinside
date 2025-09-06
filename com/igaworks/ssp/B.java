package com.igaworks.ssp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;

public abstract class b {
    static abstract class a {
    }

    static class com.igaworks.ssp.b.b {
        public String a;
        public String b;
        public int c;
        public String d;

        private com.igaworks.ssp.b.b() {
            this.a = null;
            this.b = null;
            this.c = 0;
            this.d = null;
        }

        com.igaworks.ssp.b.b(a b$a0) {
        }
    }

    private static boolean a = false;
    private static String b = "AdPopcornSSP";
    private static String c = null;
    private static boolean d = false;

    static {
    }

    static String a() [...] // Inlined contents

    private static ArrayList a(Thread thread0) {
        String s2;
        ArrayList arrayList0 = new ArrayList();
        StackTraceElement[] arr_stackTraceElement = thread0.getStackTrace();
        for(int v = 0; v < arr_stackTraceElement.length; ++v) {
            StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
            if(!stackTraceElement0.getClassName().contains("APSSPLogger") && stackTraceElement0.getClassName().contains(b.c)) {
                com.igaworks.ssp.b.b b$b0 = new com.igaworks.ssp.b.b(null);
                String s = stackTraceElement0.getClassName();
                String s1 = stackTraceElement0.getMethodName();
                int v1 = stackTraceElement0.getLineNumber();
                try {
                    s2 = s;
                    s2 = s.substring(s.lastIndexOf(".") + 1);
                }
                catch(Exception unused_ex) {
                }
                b$b0.a = s;
                b$b0.b = s1;
                b$b0.c = v1;
                b$b0.d = s2;
                arrayList0.add(b$b0);
            }
        }
        return arrayList0;
    }

    public static void a(Context context0, String s, boolean z) {
        b.d = z;
        b.c = "com.igaworks.ssp";
        if(B.a(context0, s, "f2459a5bc7308013f5494041fa1745eb2f4828f1a002f0e4464474d0a1ae6ce5")) {
            b.a = true;
            return;
        }
        try {
            ApplicationInfo applicationInfo0 = context0.getPackageManager().getApplicationInfo("com.dcinside.app.android", 0x80);
            if(applicationInfo0.metaData.containsKey("enable_ap_log")) {
                String s1 = applicationInfo0.metaData.getString("enable_ap_log");
                if(s1 != null && s1.contentEquals("enable")) {
                    b.a = true;
                    return;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        b.a = false;
    }

    public static void a(String s) {
        b.b = s;
    }

    private static void a(String s, String s1, int v) {
        if(s1 != null && s1.length() >= 800) {
            int v1 = 0;
            while(v1 <= s1.length() / 800) {
                int v2 = v1 * 800;
                ++v1;
                b.b(s, s1.substring(v2, (v1 * 800 <= s1.length() ? v1 * 800 : s1.length())), v);
            }
            return;
        }
        b.b(s, s1, v);
    }

    public static void a(Thread thread0, Exception exception0) {
    }

    public static void a(Thread thread0, String s) {
        b.a(thread0, "AdPopcornSSP", s);
    }

    public static void a(Thread thread0, String s, String s1) {
    }

    public static void a(boolean z) {
        b.a = z;
    }

    private static void b(String s, String s1, int v) {
        try {
            switch(v) {
                case 0: {
                    Log.e(s, s1);
                    break;
                }
                case 1: {
                    Log.w(s, s1);
                    return;
                }
                case 2: {
                    Log.i(s, s1);
                    return;
                }
                case 3: {
                    Log.d(s, s1);
                    return;
                }
                case 4: {
                    Log.v(s, s1);
                }
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public static void b(Thread thread0, String s) {
        b.b(thread0, "AdPopcornSSP", s);
    }

    public static void b(Thread thread0, String s, String s1) {
    }

    public static void c(Thread thread0, String s) [...] // 潜在的解密器

    public static void c(Thread thread0, String s, String s1) {
    }
}

