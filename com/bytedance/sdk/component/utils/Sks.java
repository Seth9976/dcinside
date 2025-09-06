package com.bytedance.sdk.component.utils;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

public class Sks {
    private static String PjT;

    private static String PjT() {
        if(Build.VERSION.SDK_INT >= 28) {
            try {
                return Application.getProcessName();
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
    }

    public static boolean PjT(Context context0) {
        return context0 == null || context0.getApplicationContext() == null ? false : TextUtils.equals("com.dcinside.app.android", Sks.Zh(context0));
    }

    private static String ReZ(Context context0) {
        if(context0 == null) {
            return null;
        }
        int v = Process.myPid();
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        if(activityManager0 != null) {
            List list0 = activityManager0.getRunningAppProcesses();
            if(list0 != null) {
                for(Object object0: list0) {
                    ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                    if(activityManager$RunningAppProcessInfo0.pid == v) {
                        return activityManager$RunningAppProcessInfo0.processName;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return null;
    }

    private static String Zh() {
        try {
            Method method0 = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName");
            method0.setAccessible(true);
            Object object0 = method0.invoke(null, null);
            return object0 instanceof String ? ((String)object0) : null;
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static String Zh(Context context0) {
        if(!TextUtils.isEmpty(Sks.PjT)) {
            return Sks.PjT;
        }
        String s = Sks.PjT();
        Sks.PjT = s;
        if(!TextUtils.isEmpty(s)) {
            return Sks.PjT;
        }
        String s1 = Sks.Zh();
        Sks.PjT = s1;
        if(!TextUtils.isEmpty(s1)) {
            return Sks.PjT;
        }
        String s2 = Sks.ReZ(context0);
        Sks.PjT = s2;
        return s2;
    }
}

