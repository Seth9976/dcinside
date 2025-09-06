package io.realm.internal;

import android.content.Context;
import com.getkeepsafe.relinker.e;
import java.lang.reflect.Field;
import java.util.Locale;

public class r {
    private static final String a = null;
    private static final String b = null;
    private static final String c = null;
    private static final String d = "java.library.path";
    private static boolean e;

    // 去混淆评级： 低(32)
    static {
        r.a = "/";
        r.b = ";";
        r.c = "lib;../lib";
        r.e = false;
    }

    // 去混淆评级： 低(20)
    public static void a(String s) {
        try {
            System.setProperty("java.library.path", "/system/lib64:/system_ext/lib64;" + s + ";");
        }
        catch(Exception exception0) {
            throw new RuntimeException("Cannot set the library path!", exception0);
        }
    }

    private static String b(String[] arr_s) [...] // 潜在的解密器

    public static void c(Context context0) {
        synchronized(r.class) {
            if(r.e) {
                return;
            }
            e.d(context0, "realm-jni", "10.19.0");
            r.e = true;
        }
    }

    // 去混淆评级： 低(35)
    private static String d() {
        try {
            r.a("lib;../lib");
            r.f();
        }
        catch(Throwable unused_ex) {
        }
        System.out.println("!!! Realm debug version loaded. !!!\n");
        return "realm_jni32d";
    }

    // 去混淆评级： 低(20)
    public static boolean e() {
        return "Linux".toLowerCase(Locale.getDefault()).contains("win");
    }

    private static void f() {
        try {
            Field field0 = ClassLoader.class.getDeclaredField("sys_paths");
            field0.setAccessible(true);
            field0.set(null, null);
        }
        catch(Exception exception0) {
            throw new RuntimeException("Cannot reset the library path!", exception0);
        }
    }
}

