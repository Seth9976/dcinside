package com.bykv.vk.openvk.preload.geckox.utils;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;
import java.util.List;

public final class a {
    private static String a;

    private static String a() {
        if(Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
        return null;
    }

    public static String a(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionName;
        }
        catch(Exception exception0) {
            GeckoLogger.w("gecko-debug-tag", "getVersion:", exception0);
            return "null";
        }
    }

    public static void a(Throwable throwable0) {
        GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", throwable0);
    }

    private static String b() {
        try {
            Method method0 = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName");
            method0.setAccessible(true);
            Object object0 = method0.invoke(null, null);
            if(object0 instanceof String) {
                return (String)object0;
            }
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
        }
        return null;
    }

    public static String b(Context context0) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.dcinside.app.android", 0);
            return applicationInfo0 == null ? "" : applicationInfo0.loadLabel(packageManager0).toString();
        }
        catch(Throwable throwable0) {
            GeckoLogger.w("gecko-debug-tag", "getApplicationName:", throwable0);
            return "";
        }
    }

    public static String c(Context context0) {
        if(!TextUtils.isEmpty(a.a)) {
            return a.a;
        }
        String s = a.a();
        a.a = s;
        if(!TextUtils.isEmpty(s)) {
            return a.a;
        }
        String s1 = null;
        String s2 = a.b();
        a.a = s2;
        if(!TextUtils.isEmpty(s2)) {
            return a.a;
        }
        if(context0 != null) {
            int v = Process.myPid();
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            if(activityManager0 != null) {
                List list0 = activityManager0.getRunningAppProcesses();
                if(list0 != null) {
                    for(Object object0: list0) {
                        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                        if(activityManager$RunningAppProcessInfo0.pid == v) {
                            s1 = activityManager$RunningAppProcessInfo0.processName;
                            break;
                        }
                    }
                }
            }
        }
        a.a = s1;
        return s1;
    }
}

