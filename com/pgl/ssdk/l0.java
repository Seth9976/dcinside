package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;

public class l0 {
    public static int a = -1;
    public static String b = null;
    private static String c = "api16-access-ttp.tiktokpangle.us";
    public static final String[] d = null;
    private static int e = 0x80000000;

    static {
        l0.d = new String[]{"api16-access-ttp.tiktokpangle.us", "api16-access-ttp-b.tiktokpangle.us", "api16-access-ttp.tiktokpangle-b.us", "api16-access-ttp-b.tiktokpangle-b.us"};
    }

    // 去混淆评级： 低(30)
    public static String a() [...] // 潜在的解密器

    public static String a(Context context0) {
        if(!TextUtils.isEmpty(l0.b)) {
            return l0.b;
        }
        try {
            if(l0.e == 0x80000000) {
                l0.e = v0.a(context0, "domain_index", 0);
            }
            return "api16-access-ttp.tiktokpangle.us";
        }
        catch(Throwable unused_ex) {
            return "api16-access-ttp.tiktokpangle.us";
        }
    }

    public static void a(int v) {
        l0.a = v;
    }

    public static void a(String s) {
        if(!TextUtils.isEmpty(s)) {
            l0.b = s;
        }
    }

    public static void b(Context context0) {
        if(TextUtils.isEmpty(l0.b)) {
            int v = l0.e;
            if(v < 0x7FFFFFFF) {
                l0.e = v + 1;
                v0.b(context0, "domain_index", v + 1);
                return;
            }
            l0.e = 0;
        }
    }
}

