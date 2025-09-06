package io.realm.log;

import android.util.Log;
import java.util.Locale;
import o3.h;

public final class RealmLog {
    private static String a = "REALM_JAVA";

    static {
    }

    public static void a(RealmLogger realmLogger0) {
        if(realmLogger0 == null) {
            throw new IllegalArgumentException("A non-null logger has to be provided");
        }
        RealmLog.nativeAddLogger(realmLogger0);
    }

    public static void b() {
        RealmLog.nativeClearLoggers();
    }

    public static void c(String s, Object[] arr_object) {
        RealmLog.e(null, s, arr_object);
    }

    public static void d(@h Throwable throwable0) {
        RealmLog.e(throwable0, null, new Object[0]);
    }

    public static void e(@h Throwable throwable0, @h String s, Object[] arr_object) {
        RealmLog.p(3, throwable0, s, arr_object);
    }

    public static void f(String s, Object[] arr_object) {
        RealmLog.h(null, s, arr_object);
    }

    public static void g(Throwable throwable0) {
        RealmLog.h(throwable0, null, new Object[0]);
    }

    public static void h(@h Throwable throwable0, @h String s, Object[] arr_object) {
        RealmLog.p(6, throwable0, s, arr_object);
    }

    public static void i(String s, Object[] arr_object) {
        RealmLog.k(null, s, arr_object);
    }

    public static void j(Throwable throwable0) {
        RealmLog.k(throwable0, null, new Object[0]);
    }

    public static void k(@h Throwable throwable0, @h String s, Object[] arr_object) {
        RealmLog.p(7, throwable0, s, arr_object);
    }

    public static int l() {
        return RealmLog.nativeGetLogLevel();
    }

    public static void m(String s, Object[] arr_object) {
        RealmLog.o(null, s, arr_object);
    }

    public static void n(Throwable throwable0) {
        RealmLog.o(throwable0, null, new Object[0]);
    }

    private static native void nativeAddLogger(RealmLogger arg0) {
    }

    private static native void nativeClearLoggers() {
    }

    static native void nativeCloseCoreLoggerBridge(long arg0) {
    }

    static native long nativeCreateCoreLoggerBridge(String arg0) {
    }

    private static native int nativeGetLogLevel() {
    }

    private static native void nativeLog(int arg0, String arg1, @h Throwable arg2, @h String arg3) {
    }

    static native void nativeLogToCoreLoggerBridge(long arg0, int arg1, String arg2) {
    }

    private static native void nativeRegisterDefaultLogger() {
    }

    private static native void nativeRemoveLogger(RealmLogger arg0) {
    }

    private static native void nativeSetLogLevel(int arg0) {
    }

    public static void o(@h Throwable throwable0, @h String s, Object[] arr_object) {
        RealmLog.p(4, throwable0, s, arr_object);
    }

    private static void p(int v, @h Throwable throwable0, @h String s, @h Object[] arr_object) {
        if(v < RealmLog.l()) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(s != null && arr_object != null && arr_object.length > 0) {
            s = String.format(Locale.US, s, arr_object);
        }
        if(throwable0 != null) {
            stringBuilder0.append(Log.getStackTraceString(throwable0));
        }
        if(s != null) {
            if(throwable0 != null) {
                stringBuilder0.append("\n");
            }
            stringBuilder0.append(s);
        }
        RealmLog.nativeLog(v, "REALM_JAVA", throwable0, stringBuilder0.toString());
    }

    public static void q() {
        RealmLog.nativeRegisterDefaultLogger();
    }

    public static boolean r(RealmLogger realmLogger0) {
        if(realmLogger0 == null) {
            throw new IllegalArgumentException("A non-null logger has to be provided");
        }
        RealmLog.nativeRemoveLogger(realmLogger0);
        return true;
    }

    public static void s(int v) {
        if(v < 1 || v > 8) {
            throw new IllegalArgumentException("Invalid log level: " + v);
        }
        RealmLog.nativeSetLogLevel(v);
    }

    public static void t(String s, Object[] arr_object) {
        RealmLog.v(null, s, arr_object);
    }

    public static void u(Throwable throwable0) {
        RealmLog.v(throwable0, null, new Object[0]);
    }

    public static void v(@h Throwable throwable0, @h String s, Object[] arr_object) {
        RealmLog.p(2, throwable0, s, arr_object);
    }

    public static void w(String s, Object[] arr_object) {
        RealmLog.y(null, s, arr_object);
    }

    public static void x(Throwable throwable0) {
        RealmLog.y(throwable0, null, new Object[0]);
    }

    public static void y(@h Throwable throwable0, @h String s, Object[] arr_object) {
        RealmLog.p(5, throwable0, s, arr_object);
    }
}

