package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;

public final class AppOpsManagerCompat {
    @RequiresApi(23)
    static class Api23Impl {
        static Object a(Context context0, Class class0) {
            return context0.getSystemService(class0);
        }

        static int b(AppOpsManager appOpsManager0, String s, String s1) {
            return appOpsManager0.noteProxyOp(s, s1);
        }

        static int c(AppOpsManager appOpsManager0, String s, String s1) {
            return appOpsManager0.noteProxyOpNoThrow(s, s1);
        }

        static String d(String s) {
            return AppOpsManager.permissionToOp(s);
        }
    }

    @RequiresApi(29)
    static class Api29Impl {
        static int a(AppOpsManager appOpsManager0, String s, int v, String s1) {
            return appOpsManager0 == null ? 1 : appOpsManager0.checkOpNoThrow(s, v, s1);
        }

        static String b(Context context0) {
            return context0.getOpPackageName();
        }

        static AppOpsManager c(Context context0) {
            return (AppOpsManager)context0.getSystemService(AppOpsManager.class);
        }
    }

    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    public static int a(Context context0, int v, String s, String s1) {
        if(Build.VERSION.SDK_INT >= 29) {
            AppOpsManager appOpsManager0 = Api29Impl.c(context0);
            int v1 = Api29Impl.a(appOpsManager0, s, Binder.getCallingUid(), s1);
            return v1 == 0 ? Api29Impl.a(appOpsManager0, s, v, Api29Impl.b(context0)) : v1;
        }
        return AppOpsManagerCompat.e(context0, s, s1);
    }

    public static int b(Context context0, String s, int v, String s1) {
        return ((AppOpsManager)context0.getSystemService("appops")).noteOp(s, v, s1);
    }

    public static int c(Context context0, String s, int v, String s1) {
        return ((AppOpsManager)context0.getSystemService("appops")).noteOpNoThrow(s, v, s1);
    }

    public static int d(Context context0, String s, String s1) {
        return Build.VERSION.SDK_INT < 23 ? 1 : Api23Impl.b(((AppOpsManager)Api23Impl.a(context0, AppOpsManager.class)), s, s1);
    }

    public static int e(Context context0, String s, String s1) {
        return Build.VERSION.SDK_INT < 23 ? 1 : Api23Impl.c(((AppOpsManager)Api23Impl.a(context0, AppOpsManager.class)), s, s1);
    }

    public static String f(String s) {
        return Build.VERSION.SDK_INT < 23 ? null : Api23Impl.d(s);
    }
}

