package com.apm.insight;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import com.apm.insight.nativecrash.b;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.g;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Random;

public final class e {
    private static Context a = null;
    private static Application b = null;
    private static long c = 0L;
    private static String d = "default";
    private static boolean e = false;
    @SuppressLint({"StaticFieldLeak"})
    private static b f;
    private static ConfigManager g;
    private static a h;
    private static volatile ConcurrentHashMap i;
    private static g j;
    private static volatile String k;
    private static Object l;
    private static volatile int m;
    private static volatile String n;
    private static int o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private static boolean s;

    static {
        e.g = new ConfigManager();
        e.h = new a();
        e.j = null;
        e.k = null;
        e.l = new Object();
        e.m = 0;
        e.o = 0;
        e.p = true;
        e.q = true;
        e.r = false;
        e.s = true;
    }

    public static b a() {
        if(e.f == null) {
            e.f = g.a(e.a);
        }
        return e.f;
    }

    public static String a(long v, CrashType crashType0, boolean z, boolean z1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(v);
        stringBuilder0.append("_");
        stringBuilder0.append(crashType0.getName());
        stringBuilder0.append('_');
        stringBuilder0.append("f6efbc3c286357e9U");
        stringBuilder0.append('_');
        String s = "normal_";
        stringBuilder0.append((z ? "oom_" : "normal_"));
        stringBuilder0.append(0L);
        stringBuilder0.append('_');
        if(z1) {
            s = "ignore_";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(Long.toHexString(new Random().nextLong()));
        stringBuilder0.append("G");
        return stringBuilder0.toString();
    }

    static void a(int v, String s) {
        if(e.i == null) {
            Class class0 = e.class;
            synchronized(class0) {
                if(e.i == null) {
                    e.i = new ConcurrentHashMap();
                }
            }
        }
        e.i.put(v, s);
    }

    public static void a(Application application0) {
        if(application0 != null) {
            e.b = application0;
        }
    }

    public static void a(Application application0, Context context0) {
        if(e.b == null) {
            e.c = System.currentTimeMillis();
            e.a = context0;
            e.b = application0;
            e.k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    static void a(Application application0, Context context0, ICommonParams iCommonParams0) {
        e.a(application0, context0);
        e.f = new b(e.a, iCommonParams0, e.a());
    }

    public static void a(b b0) {
        e.f = b0;
    }

    static void a(String s) {
        e.d = s;
    }

    public static void a(boolean z) {
        e.p = z;
    }

    public static a b() {
        return e.h;
    }

    static void b(int v, String s) {
        e.m = v;
        e.n = s;
    }

    public static void b(boolean z) {
        e.q = z;
    }

    public static g c() {
        if(e.j == null) {
            synchronized(e.class) {
                e.j = new g();
                return e.j;
            }
        }
        return e.j;
    }

    public static void c(boolean z) {
        e.r = z;
    }

    public static void d(boolean z) {
        e.s = z;
    }

    public static boolean d() {
        if(e.g.isDebugMode()) {
            Object object0 = e.a().a().get("channel");
            return (object0 == null ? "unknown" : String.valueOf(object0)).contains("local_test");
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static String e() [...] // 潜在的解密器

    public static String f() [...] // 潜在的解密器

    public static Context g() {
        return e.a;
    }

    public static Application h() {
        return e.b;
    }

    public static ConfigManager i() {
        return e.g;
    }

    public static long j() [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static String k() [...] // 潜在的解密器

    public static void l() {
        e.o = 1;
    }

    public static int m() [...] // 潜在的解密器

    public static boolean n() [...] // 潜在的解密器

    static void o() {
        e.e = true;
    }

    public static ConcurrentHashMap p() {
        return e.i;
    }

    public static int q() [...] // 潜在的解密器

    public static String r() {
        return e.n;
    }

    public static boolean s() [...] // 潜在的解密器

    public static boolean t() [...] // 潜在的解密器

    public static boolean u() [...] // 潜在的解密器

    public static boolean v() [...] // 潜在的解密器
}

