package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.apm.insight.a;
import com.apm.insight.b.d;
import com.apm.insight.b.f;
import com.apm.insight.c;
import com.apm.insight.e;
import com.apm.insight.h.b;
import com.apm.insight.l.j;
import java.io.File;

public class NativeImpl {
    private static volatile boolean a = false;
    private static volatile boolean b = false;
    private static boolean c = true;

    static {
    }

    public static int a(int v) {
        return -1;
    }

    public static String a(String s) {
        return null;
    }

    public static void a(int v, String s) {
    }

    public static void a(long v) {
    }

    public static void a(File file0) {
    }

    public static void a(String s, String s1, String s2) {
    }

    public static void a(boolean z) {
        NativeImpl.c = z;
    }

    public static boolean a() {
        if(NativeImpl.b) {
            return false;
        }
        NativeImpl.b = true;
        NativeImpl.a = a.b("apminsighta");
        return false;
    }

    public static boolean a(@NonNull Context context0) {
        String s1;
        boolean z = NativeImpl.a();
        if(z) {
            String s = j.j(context0) + "/apminsight";
            if(new File(context0.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                s1 = context0.getApplicationInfo().nativeLibraryDir;
            }
            else {
                s1 = b.a();
                b.b("apminsightb");
            }
            NativeImpl.doStart(Build.VERSION.SDK_INT, s1, s, "92b83005efadb802U", 0);
        }
        return z;
    }

    public static int b() {
        return -1;
    }

    public static void b(int v) {
    }

    public static void b(long v) {
    }

    public static void b(String s) {
    }

    public static int c(String s) {
        return -1;
    }

    public static void c() {
    }

    public static void d() {
    }

    public static void d(String s) {
    }

    @Keep
    private static native boolean doCheckNativeCrash() {
    }

    @Keep
    private static native void doCloseFile(int arg0) {
    }

    @Keep
    private static native int doCreateCallbackThread() {
    }

    @Keep
    private static native void doDump(String arg0) {
    }

    @Keep
    private static native void doDumpFds(String arg0) {
    }

    @Keep
    private static native void doDumpHprof(String arg0) {
    }

    @Keep
    private static native void doDumpLogcat(String arg0, String arg1, String arg2) {
    }

    @Keep
    private static native void doDumpMaps(String arg0) {
    }

    @Keep
    private static native void doDumpMemInfo(String arg0) {
    }

    @Keep
    private static native void doDumpThreads(String arg0) {
    }

    @Keep
    private static native long doGetAppCpuTime() {
    }

    @Keep
    private static native long doGetChildCpuTime() {
    }

    @Keep
    private static native String doGetCrashHeader(String arg0) {
    }

    @Keep
    private static native long doGetDeviceCpuTime() {
    }

    @Keep
    private static native int doGetFDCount() {
    }

    @Keep
    private static native String[] doGetFdDump(int arg0, int arg1, int[] arg2, String[] arg3) {
    }

    @Keep
    private static native long doGetFreeMemory() {
    }

    @Keep
    private static native long doGetThreadCpuTime(int arg0) {
    }

    @Keep
    private static native int doGetThreadsCount() {
    }

    @Keep
    private static native long doGetTotalMemory() {
    }

    @Keep
    private static native long doGetVMSize() {
    }

    @Keep
    private static native void doInitThreadDump() {
    }

    @Keep
    private static native int doLock(String arg0, int arg1) {
    }

    @Keep
    private static native int doOpenFile(String arg0) {
    }

    @Keep
    private static native void doRebuildTombstone(String arg0, String arg1, String arg2) {
    }

    @Keep
    private static native void doSetAlogConfigPath(String arg0) {
    }

    @Keep
    private static native void doSetAlogFlushAddr(long arg0) {
    }

    @Keep
    private static native void doSetAlogLogDirAddr(long arg0) {
    }

    @Keep
    private static native void doSetResendSigQuit(int arg0) {
    }

    @Keep
    private static native void doSetUploadEnd() {
    }

    @Keep
    private static native void doSignalMainThread() {
    }

    @Keep
    private static native int doStart(int arg0, String arg1, String arg2, String arg3, int arg4) {
    }

    @Keep
    private static native void doStartAnrMonitor(int arg0) {
    }

    @Keep
    private static native void doWriteFile(int arg0, String arg1, int arg2) {
    }

    public static void e(String s) {
    }

    public static boolean e() {
        return false;
    }

    public static void f(String s) {
    }

    public static boolean f() {
        return false;
    }

    public static void g() {
        new Thread(new Runnable() {
            @Override
            public final void run() {
                try {
                    NativeImpl.l();
                }
                catch(Throwable throwable0) {
                    try {
                        c.a(throwable0, "NPTH_ANR_MONITOR_ERROR");
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
        }, "NPTH-AnrMonitor").start();
    }

    public static void g(String s) {
    }

    public static int h(String s) {
        return -1;
    }

    public static boolean h() [...] // 潜在的解密器

    @Keep
    private static void handleNativeCrash(String s) {
        NativeCrashCollector.onNativeCrash(s);
    }

    public static void i() {
    }

    public static void i(String s) {
    }

    @Keep
    private static native boolean is64Bit() {
    }

    public static void j() {
    }

    public static void k() {
    }

    static void l() {
    }

    @Keep
    private static void reportEventForAnrMonitor() {
        try {
            d.c();
            f.a(e.g()).a().e();
        }
        catch(Throwable unused_ex) {
        }
    }
}

