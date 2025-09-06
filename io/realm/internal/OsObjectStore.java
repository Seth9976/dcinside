package io.realm.internal;

import io.realm.Q0;
import o3.h;

public class OsObjectStore {
    public static final long a = -1L;

    public static boolean a(Q0 q00, Runnable runnable0) {
        return OsObjectStore.nativeCallWithLock(q00.n(), runnable0);
    }

    public static boolean b(OsSharedRealm osSharedRealm0, String s) {
        return OsObjectStore.nativeDeleteTableForObject(osSharedRealm0.getNativePtr(), s);
    }

    @h
    public static String c(OsSharedRealm osSharedRealm0, String s) {
        return OsObjectStore.nativeGetPrimaryKeyForObject(osSharedRealm0.getNativePtr(), Util.j() + s);
    }

    public static long d(OsSharedRealm osSharedRealm0) {
        return OsObjectStore.nativeGetSchemaVersion(osSharedRealm0.getNativePtr());
    }

    public static void e(OsSharedRealm osSharedRealm0, String s, @h String s1) {
        String s2 = Util.j() + s;
        try {
            OsObjectStore.nativeSetPrimaryKeyForObject(osSharedRealm0.getNativePtr(), s2, s1);
        }
        catch(IllegalStateException illegalStateException0) {
            throw new IllegalArgumentException(illegalStateException0.getMessage());
        }
    }

    public static void f(OsSharedRealm osSharedRealm0, long v) {
        OsObjectStore.nativeSetSchemaVersion(osSharedRealm0.getNativePtr(), v);
    }

    private static native boolean nativeCallWithLock(String arg0, Runnable arg1) {
    }

    private static native boolean nativeDeleteTableForObject(long arg0, String arg1) {
    }

    @h
    private static native String nativeGetPrimaryKeyForObject(long arg0, String arg1) {
    }

    private static native long nativeGetSchemaVersion(long arg0) {
    }

    private static native void nativeSetPrimaryKeyForObject(long arg0, String arg1, @h String arg2) {
    }

    private static native void nativeSetSchemaVersion(long arg0, long arg1) {
    }
}

