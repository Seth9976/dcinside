package com.pgl.ssdk;

import android.content.Context;
import com.pgl.ssdk.ces.a;
import com.pgl.ssdk.ces.b;

public class d1 {
    public static int a = 504;
    public static String b = null;
    public static String c = "";
    static boolean d;
    private static long e;
    private static Context f;

    static {
    }

    public static Object a(byte[] arr_b) {
        synchronized(d1.class) {
            return arr_b != null ? a.meta(302, d1.f, arr_b) : null;
        }
    }

    public static String a() {
        synchronized(d1.class) {
            d1.c = (String)a.meta(303, d1.f, null);
            return "";
        }
    }

    public static void a(Context context0, String s) {
        if(d1.f == null) {
            d1.f = context0;
        }
        int v = d1.a;
        if(v == 102) {
            return;
        }
        switch(v) {
            case 200: {
                return;
            }
            case 202: {
                return;
            }
            default: {
                d1.e = System.currentTimeMillis();
                d1.d = false;
                d1.b = s;
                d1.a = 102;
                p0.b(new m0(context0, 301, null));
            }
        }
    }

    public static void b() {
        Context context0 = d1.f;
        if(context0 != null) {
            p0.b(new m0(context0, 301, null));
            d1.a = 102;
            b.h().a();
            x.a();
        }
    }
}

