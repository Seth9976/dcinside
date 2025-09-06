package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.os.UserManagerCompat;
import com.google.common.util.concurrent.t0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

public final class PackageManagerCompat {
    @RequiresApi(30)
    static class Api30Impl {
        static boolean a(Context context0) {
            return !context0.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface UnusedAppRestrictionsStatus {
    }

    @RestrictTo({Scope.a})
    public static final String a = "PackageManagerCompat";
    @SuppressLint({"ActionValue"})
    public static final String b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    // 去混淆评级： 中等(80)
    @RestrictTo({Scope.a})
    public static boolean a(PackageManager packageManager0) {
        return Build.VERSION.SDK_INT >= 30 || Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT < 30 && PackageManagerCompat.b(packageManager0) != null;
    }

    @RestrictTo({Scope.a})
    public static String b(PackageManager packageManager0) {
        String s = null;
        for(Object object0: packageManager0.queryIntentActivities(new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String s1 = ((ResolveInfo)object0).activityInfo.packageName;
            if(packageManager0.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", s1) == 0) {
                if(s != null) {
                    return s;
                }
                s = s1;
            }
        }
        return s;
    }

    public static t0 c(Context context0) {
        t0 t00 = ResolvableFuture.w();
        if(!UserManagerCompat.a(context0)) {
            ((ResolvableFuture)t00).r(0);
            Log.e("PackageManagerCompat", "User is in locked direct boot mode");
            return t00;
        }
        if(!PackageManagerCompat.a(context0.getPackageManager())) {
            ((ResolvableFuture)t00).r(1);
            return t00;
        }
        int v = Build.VERSION.SDK_INT;
        int v1 = 2;
        if(v >= 0x1F) {
            if(Api30Impl.a(context0)) {
                ((ResolvableFuture)t00).r(5);
                return t00;
            }
            ((ResolvableFuture)t00).r(2);
            return t00;
        }
        if(v == 30) {
            if(Api30Impl.a(context0)) {
                v1 = 4;
            }
            ((ResolvableFuture)t00).r(v1);
            return t00;
        }
        UnusedAppRestrictionsBackportServiceConnection unusedAppRestrictionsBackportServiceConnection0 = new UnusedAppRestrictionsBackportServiceConnection(context0);
        ((AbstractResolvableFuture)t00).addListener(new x(unusedAppRestrictionsBackportServiceConnection0), Executors.newSingleThreadExecutor());
        unusedAppRestrictionsBackportServiceConnection0.a(((ResolvableFuture)t00));
        return t00;
    }
}

