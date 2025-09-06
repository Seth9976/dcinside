package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkManager;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nProcessUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessUtils.kt\nandroidx/work/impl/utils/ProcessUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
@i(name = "ProcessUtils")
public final class ProcessUtils {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-ProcessUtils", "tagWithPrefix(\"ProcessUtils\")");
        ProcessUtils.a = "WM-ProcessUtils";
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    private static final String a(Context context0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.a.a();
        }
        try {
            Method method0 = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
            method0.setAccessible(true);
            Object object0 = method0.invoke(null, null);
            L.m(object0);
            if(object0 instanceof String) {
                return (String)object0;
            }
        }
        catch(Throwable throwable0) {
            Logger.e().b("WM-ProcessUtils", "Unable to check ActivityThread for processName", throwable0);
        }
        int v = Process.myPid();
        Object object1 = context0.getSystemService("activity");
        L.n(object1, "null cannot be cast to non-null type android.app.ActivityManager");
        List list0 = ((ActivityManager)object1).getRunningAppProcesses();
        if(list0 != null) {
            for(Object object2: list0) {
                if(((ActivityManager.RunningAppProcessInfo)object2).pid == v) {
                    return ((ActivityManager.RunningAppProcessInfo)object2) == null ? null : ((ActivityManager.RunningAppProcessInfo)object2).processName;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean b(@l Context context0, @l Configuration configuration0) {
        L.p(context0, "context");
        L.p(configuration0, "configuration");
        String s = ProcessUtils.a(context0);
        String s1 = configuration0.c();
        return s1 == null || s1.length() == 0 ? L.g(s, context0.getApplicationInfo().processName) : L.g(s, configuration0.c());
    }
}

