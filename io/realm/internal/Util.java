package io.realm.internal;

import android.os.Build;
import io.realm.X0;
import io.realm.d1;
import io.realm.internal.android.a;
import io.realm.log.RealmLog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import o3.h;

public class Util {
    private static Boolean a;
    private static Boolean b;

    public static void a(String s, Map map0, String s1) {
        if(!map0.containsKey(s)) {
            throw new IllegalArgumentException("Key \'" + s + "\' required in \'" + s1 + "\'.");
        }
    }

    public static void b(String s, String s1) {
        if(Util.l(s)) {
            throw new IllegalArgumentException("Non-empty \'" + s1 + "\' required.");
        }
    }

    public static void c(String s) {
        new a().c(s);
    }

    public static void d(String s) {
        if(new a().a()) {
            throw new IllegalStateException(s);
        }
    }

    public static void e(@h Object object0, String s) {
        if(object0 == null) {
            throw new IllegalArgumentException("Nonnull \'" + s + "\' required.");
        }
    }

    public static boolean f(String s, File file0, String s1) {
        boolean z;
        File file1 = new File(file0, s1 + ".management");
        File file2 = new File(s);
        File file3 = new File(s + ".note");
        File[] arr_file = file1.listFiles();
        if(arr_file != null) {
            for(int v = 0; v < arr_file.length; ++v) {
                File file4 = arr_file[v];
                if(!file4.delete()) {
                    RealmLog.w(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", file4.getAbsolutePath()), new Object[0]);
                }
            }
        }
        if(file1.exists() && !file1.delete()) {
            RealmLog.w(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", file1.getAbsolutePath()), new Object[0]);
        }
        if(file2.exists()) {
            z = file2.delete();
            if(!z) {
                RealmLog.w(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", file2.getAbsolutePath()), new Object[0]);
            }
        }
        else {
            z = true;
        }
        if(file3.exists() && !file3.delete()) {
            RealmLog.w(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", file3.getAbsolutePath()), new Object[0]);
        }
        return z;
    }

    public static Class g(String s) {
        try {
            return Class.forName(s);
        }
        catch(ClassNotFoundException unused_ex) {
            throw new IllegalArgumentException("Class \'" + s + "\' does not exist.");
        }
    }

    public static Class h(Class class0) {
        if(!class0.equals(X0.class)) {
            Class class1 = d1.class;
            if(!class0.equals(class1)) {
                Class class2 = class0.getSuperclass();
                return class2.equals(Object.class) || class2.equals(class1) ? class0 : class2;
            }
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }

    public static String i(Throwable throwable0) {
        StringWriter stringWriter0 = new StringWriter();
        throwable0.printStackTrace(new PrintWriter(stringWriter0, true));
        return stringWriter0.getBuffer().toString();
    }

    public static String j() {
        return Util.nativeGetTablePrefix();
    }

    public static boolean k() {
        synchronized(Util.class) {
            if(Util.b == null) {
                Util.b = Boolean.TRUE;
            }
            return Util.b.booleanValue();
        }
    }

    public static boolean l(@h String s) {
        return s == null || s.length() == 0;
    }

    // 去混淆评级： 中等(150)
    public static boolean m() {
        return Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic") || "google_sdk".equals(Build.PRODUCT);
    }

    public static boolean n() {
        synchronized(Util.class) {
            if(Util.a == null) {
                try {
                    Class.forName("io.reactivex.l");
                    Util.a = Boolean.TRUE;
                }
                catch(ClassNotFoundException unused_ex) {
                    Util.a = Boolean.FALSE;
                }
            }
            return Util.a.booleanValue();
        }
    }

    static native String nativeGetTablePrefix() {
    }

    public static Set o(Object[] arr_object) {
        if(arr_object == null) {
            return Collections.emptySet();
        }
        Set set0 = new LinkedHashSet();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 != null) {
                set0.add(object0);
            }
        }
        return set0;
    }
}

