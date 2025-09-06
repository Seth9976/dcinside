package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileLock {
    private static final Map a;
    private final int b;
    private final String c;

    static {
        FileLock.a = new HashMap();
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String s, int v) {
        this.c = s;
        this.b = v;
    }

    public static FileLock a(String s) {
        try {
            int v = FileLock.d(s);
            FileLock.nLockFile(v);
            return new FileLock(s, v);
        }
        catch(Exception exception0) {
            throw new RuntimeException("lock failed, file:" + s + ", pid:" + Process.myPid() + " caused by:" + exception0.getMessage());
        }
    }

    public static FileLock a(String s, int v) {
        try {
            int v1 = FileLock.d(s);
            FileLock.nLockFileSegment(v1, v);
            return new FileLock(s, v1);
        }
        catch(Exception exception0) {
            throw new RuntimeException("lock segment failed, file:" + s + " caused by:" + exception0.getMessage());
        }
    }

    public final void a() {
        try {
            FileLock.nUnlockFile(this.b);
        }
        catch(Exception unused_ex) {
            throw new RuntimeException("release lock failed，path:" + this.c);
        }
    }

    public static FileLock b(String s) {
        int v;
        try {
            v = FileLock.d(s);
            if(!FileLock.nTryLock(v)) {
                return null;
            }
        }
        catch(Exception exception0) {
            throw new RuntimeException("try lock failed, file:" + s + " caused by:" + exception0.getMessage());
        }
        return new FileLock(s, v);
    }

    public final void b() {
        Integer integer0;
        synchronized(FileLock.a) {
            integer0 = (Integer)FileLock.a.remove(this.c);
        }
        try {
            FileLock.nRelease(((int)integer0));
        }
        catch(Exception exception0) {
            throw new RuntimeException("release lock failed, file:" + this.c + " caused by:" + exception0.getMessage());
        }
    }

    public static FileLock c(String s) throws Exception {
        int v;
        try {
            v = FileLock.d(s);
            if(!FileLock.nTryLock(v)) {
                goto label_5;
            }
            return new FileLock(s, v);
        }
        catch(Exception exception0) {
            throw new RuntimeException("try lock failed, file:" + s + " caused by:" + exception0.getMessage());
        }
    label_5:
        new FileLock(s, v).b();
        return null;
    }

    private static int d(String s) throws Exception {
        Map map0 = FileLock.a;
        __monitor_enter(map0);
        try {
            Integer integer0 = (Integer)map0.get(s);
            if(integer0 == null) {
                new File(s).getParentFile().mkdirs();
                integer0 = FileLock.nGetFD(s);
                map0.put(s, integer0);
            }
            __monitor_exit(map0);
            return (int)integer0;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    private static native int nGetFD(String arg0) throws Exception {
    }

    private static native void nLockFile(int arg0) throws Exception {
    }

    private static native void nLockFileSegment(int arg0, int arg1) throws Exception {
    }

    private static native void nRelease(int arg0) throws Exception {
    }

    private static native boolean nTryLock(int arg0) throws Exception {
    }

    private static native void nUnlockFile(int arg0) throws Exception {
    }
}

