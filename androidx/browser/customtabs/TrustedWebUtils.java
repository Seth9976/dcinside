package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.core.content.FileProvider;
import java.io.File;

public class TrustedWebUtils {
    public static final String a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
    @RestrictTo({Scope.a})
    public static final String b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    public static boolean a(@NonNull Context context0, @NonNull String s, @NonNull String s1) {
        Intent intent0 = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(s);
        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent0, 0x40);
        if(resolveInfo0 != null) {
            return resolveInfo0.filter == null ? false : resolveInfo0.filter.hasCategory(s1);
        }
        return false;
    }

    @Deprecated
    public static void b(@NonNull Context context0, @NonNull CustomTabsIntent customTabsIntent0, @NonNull Uri uri0) {
        if(customTabsIntent0.a.getExtras().getBinder("android.support.customtabs.extra.SESSION") == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        customTabsIntent0.a.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        customTabsIntent0.t(context0, uri0);
    }

    @RestrictTo({Scope.a})
    public static void c(@NonNull Context context0, @NonNull CustomTabsSession customTabsSession0, @NonNull Uri uri0) {
        Intent intent0 = new Intent("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
        intent0.setPackage(customTabsSession0.h().getPackageName());
        intent0.setData(uri0);
        Bundle bundle0 = new Bundle();
        bundle0.putBinder("android.support.customtabs.extra.SESSION", customTabsSession0.g());
        intent0.putExtras(bundle0);
        PendingIntent pendingIntent0 = customTabsSession0.i();
        if(pendingIntent0 != null) {
            intent0.putExtra("android.support.customtabs.extra.SESSION_ID", pendingIntent0);
        }
        context0.startActivity(intent0);
    }

    @WorkerThread
    public static boolean d(@NonNull Context context0, @NonNull File file0, @NonNull String s, @NonNull String s1, @NonNull CustomTabsSession customTabsSession0) {
        Uri uri0 = FileProvider.h(context0, s, file0);
        context0.grantUriPermission(s1, uri0, 1);
        return customTabsSession0.m(uri0, 1, null);
    }
}

