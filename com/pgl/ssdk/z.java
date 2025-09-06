package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager.AppTask;
import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Environment;
import android.text.TextUtils;
import com.pgl.ssdk.ces.a;
import j..util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.List;

public class z {
    private static int a = -1;
    private static int b = -1;

    static {
    }

    // 去混淆评级： 低(40)
    @SuppressLint({"PrivateApi"})
    public static Application a() {
        return ActivityThread.currentApplication();
    }

    private static boolean a(Context context0) {
        if(context0 == null) {
            return false;
        }
        List list0 = ((ActivityManager)context0.getSystemService("activity")).getAppTasks();
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                if(((ActivityManager.AppTask)object0).getTaskInfo() != null && z.a(((ActivityManager.AppTask)object0).getTaskInfo().baseIntent)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    private static boolean a(Intent intent0) {
        return intent0 == null ? false : (intent0.getFlags() & 0x800000) != 0;
    }

    public static String b() {
        String s = null;
        try {
            s = Environment.getDataDirectory().getPath();
        }
        catch(Throwable unused_ex) {
        }
        return s == null ? "" : s.trim();
    }

    public static void b(Context context0) {
        try {
            if(z.a == -1 || z.b == -1) {
                z.i(context0);
            }
            if(z.a(context0)) {
                ++z.a;
            }
            ++z.b;
            if(z.a != 0) {
                z.j(context0);
                a.meta(0xA0, null, new int[]{z.a, z.b});
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static String c() {
        String s = null;
        try {
            s = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        catch(Throwable unused_ex) {
        }
        return s == null ? "" : s.trim();
    }

    public static String c(Context context0) {
        String s = null;
        try {
            s = context0.getApplicationInfo().sourceDir;
        }
        catch(Throwable unused_ex) {
        }
        return s == null ? "" : s.trim();
    }

    public static String d(Context context0) {
        String s = null;
        try {
            s = context0.getFilesDir().getAbsolutePath();
        }
        catch(Throwable unused_ex) {
        }
        return s == null ? "" : s.trim();
    }

    public static String e(Context context0) {
        return "com.dcinside.app.android";
    }

    public static String f(Context context0) {
        String s = null;
        try {
            s = context0.getPackageResourcePath();
        }
        catch(Throwable unused_ex) {
        }
        return s == null ? "" : s.trim();
    }

    public static int g(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionCode;
        }
        catch(Throwable unused_ex) {
            return 0;
        }
    }

    public static boolean h(Context context0) {
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            Intent intent0 = new Intent("android.intent.action.MAIN", null);
            intent0.addCategory("android.intent.category.LAUNCHER");
            intent0.setPackage("com.dcinside.app.android");
            List list0 = packageManager0.queryIntentActivities(intent0, 0);
            if(list0 != null && !list0.isEmpty()) {
                ResolveInfo resolveInfo0 = (ResolveInfo)list0.get(0);
                if(resolveInfo0 != null) {
                    int v = packageManager0.getComponentEnabledSetting(new ComponentName(resolveInfo0.activityInfo.packageName, resolveInfo0.activityInfo.name));
                    return v == 0 || v == 1;
                }
            }
            return false;
        }
        catch(Throwable unused_ex) {
            return true;
        }
    }

    private static void i(Context context0) {
        String s = v0.a(context0, "hac_date", null);
        if(!TextUtils.isEmpty(s)) {
            new SimpleDateFormat("yyyy-MM-dd").setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            if(s.equals("2025-09-05")) {
                int v = v0.a(context0, "hac", -1);
                int v1 = v0.a(context0, "tac", -1);
                if(v != -1 && v1 != -1) {
                    z.a = v;
                    z.b = v1;
                    return;
                }
            }
        }
        z.a = 0;
        z.b = 0;
    }

    private static void j(Context context0) {
        new SimpleDateFormat("yyyy-MM-dd").setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        v0.b(context0, "hac_date", "2025-09-05");
        v0.b(context0, "hac", z.a);
        v0.b(context0, "tac", z.b);
    }
}

