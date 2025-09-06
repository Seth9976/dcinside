package com.apm.insight.l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.apm.insight.e;
import java.io.File;

public final class j {
    private static String a;
    private static File b;
    private static File c;

    static {
    }

    public static File a() {
        return j.b == null ? j.d(e.g()) : j.b;
    }

    public static File a(@NonNull Context context0) {
        return new File(j.j(context0), "apminsight/CrashLogJava");
    }

    public static File a(@NonNull Context context0, String s) {
        return new File(j.j(context0) + '/' + "apminsight/CrashCommonLog/" + s);
    }

    public static File a(File file0) {
        return new File(file0, "flog.txt");
    }

    public static File a(File file0, String s) {
        return new File(file0, file0.getName() + s);
    }

    public static String a(String s) [...] // 潜在的解密器

    public static File b(@NonNull Context context0) {
        return new File(j.j(context0), "apminsight/CrashLogSimple");
    }

    public static File b(File file0) {
        return new File(file0, "tombstone.txt");
    }

    public static File b(String s) {
        return new File(j.a(e.g(), s), "fds.txt");
    }

    // 去混淆评级： 低(40)
    public static String b() [...] // 潜在的解密器

    public static File c(@NonNull Context context0) {
        return new File(j.j(context0), "apminsight/RuntimeContext");
    }

    public static File c(File file0) {
        return new File(file0, "header.bin");
    }

    public static File c(String s) {
        return new File(j.a(e.g(), s), "threads.txt");
    }

    // 去混淆评级： 低(40)
    public static String c() [...] // 潜在的解密器

    public static File d(@NonNull Context context0) {
        if(j.b == null) {
            if(context0 == null) {
                context0 = e.g();
            }
            j.b = new File(j.j(context0), "apminsight/CrashLogNative");
        }
        return j.b;
    }

    public static File d(File file0) {
        return new File(j.a(e.g(), file0.getName()), "maps.txt");
    }

    public static File d(String s) {
        return new File(j.a(e.g(), s), "meminfo.txt");
    }

    public static File e(@NonNull Context context0) {
        if(j.c == null) {
            j.c = new File(j.j(context0) + '/' + "apminsight/CrashCommonLog/" + "bfbc1edabe6fd0c6U");
        }
        return j.c;
    }

    public static File e(File file0) {
        return new File(file0, "callback.json");
    }

    public static File e(String s) {
        return new File(j.a(e.g(), s), "pthreads.txt");
    }

    public static File f(Context context0) {
        return new File(j.j(context0), "apminsight/CrashCommonLog");
    }

    public static File f(File file0) {
        return new File(file0, "upload.json");
    }

    public static File f(String s) {
        return new File(j.a(e.g(), s), "rountines.txt");
    }

    public static File g(Context context0) {
        return new File(j.j(context0), "apminsight/issueCrashTimes");
    }

    public static File g(File file0) {
        return new File(file0, "javastack.txt");
    }

    public static File g(String s) {
        return new File(j.a(e.g(), s), "leakd_threads.txt");
    }

    public static File h(Context context0) {
        return new File(j.j(context0) + '/' + "apminsight/issueCrashTimes/current.times");
    }

    public static File h(File file0) {
        return new File(j.a(e.g(), file0.getName()), "logcat.txt");
    }

    public static File i(@NonNull Context context0) {
        return new File(j.j(context0), "apminsight/alogCrash");
    }

    public static File i(File file0) {
        return new File(j.a(e.g(), file0.getName()), "fds.txt");
    }

    public static File j(File file0) {
        return new File(j.a(e.g(), file0.getName()), "threads.txt");
    }

    public static String j(@NonNull Context context0) [...] // 潜在的解密器

    public static File k(File file0) {
        return new File(j.a(e.g(), file0.getName()), "meminfo.txt");
    }

    public static File l(File file0) {
        return new File(j.a(e.g(), file0.getName()), "pthreads.txt");
    }

    public static File m(File file0) {
        return new File(j.a(e.g(), file0.getName()), "rountines.txt");
    }

    public static File n(File file0) {
        return new File(j.a(e.g(), file0.getName()), "leakd_threads.txt");
    }

    public static File o(File file0) {
        return new File(file0, "abortmsg.txt");
    }
}

