package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.ReplaceWith;

public final class NavUtils {
    private static final String a = "NavUtils";
    public static final String b = "android.support.PARENT_ACTIVITY";

    public static Intent a(Activity activity0) {
        Intent intent0 = activity0.getParentActivityIntent();
        if(intent0 != null) {
            return intent0;
        }
        String s = NavUtils.d(activity0);
        if(s == null) {
            return null;
        }
        ComponentName componentName0 = new ComponentName(activity0, s);
        try {
            return NavUtils.e(activity0, componentName0) == null ? Intent.makeMainActivity(componentName0) : new Intent().setComponent(componentName0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName \'" + s + "\' in manifest");
            return null;
        }
    }

    public static Intent b(Context context0, ComponentName componentName0) throws PackageManager.NameNotFoundException {
        String s = NavUtils.e(context0, componentName0);
        if(s == null) {
            return null;
        }
        ComponentName componentName1 = new ComponentName(componentName0.getPackageName(), s);
        return NavUtils.e(context0, componentName1) == null ? Intent.makeMainActivity(componentName1) : new Intent().setComponent(componentName1);
    }

    public static Intent c(Context context0, Class class0) throws PackageManager.NameNotFoundException {
        String s = NavUtils.e(context0, new ComponentName(context0, class0));
        if(s == null) {
            return null;
        }
        ComponentName componentName0 = new ComponentName(context0, s);
        return NavUtils.e(context0, componentName0) == null ? Intent.makeMainActivity(componentName0) : new Intent().setComponent(componentName0);
    }

    public static String d(Activity activity0) {
        try {
            return NavUtils.e(activity0, activity0.getComponentName());
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new IllegalArgumentException(packageManager$NameNotFoundException0);
        }
    }

    public static String e(Context context0, ComponentName componentName0) throws PackageManager.NameNotFoundException {
        int v1;
        PackageManager packageManager0 = context0.getPackageManager();
        int v = Build.VERSION.SDK_INT;
        if(v >= 29) {
            v1 = 0x100C0280;
        }
        else {
            v1 = v < 24 ? 640 : 0xC0280;
        }
        ActivityInfo activityInfo0 = packageManager0.getActivityInfo(componentName0, v1);
        String s = activityInfo0.parentActivityName;
        if(s != null) {
            return s;
        }
        Bundle bundle0 = activityInfo0.metaData;
        if(bundle0 == null) {
            return null;
        }
        String s1 = bundle0.getString("android.support.PARENT_ACTIVITY");
        if(s1 == null) {
            return null;
        }
        return s1.charAt(0) == 46 ? "com.dcinside.app.android" + s1 : s1;
    }

    public static void f(Activity activity0) {
        Intent intent0 = NavUtils.a(activity0);
        if(intent0 == null) {
            throw new IllegalArgumentException("Activity " + activity0.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        }
        NavUtils.g(activity0, intent0);
    }

    @ReplaceWith(expression = "sourceActivity.navigateUpTo(upIntent)")
    @Deprecated
    public static void g(Activity activity0, Intent intent0) {
        activity0.navigateUpTo(intent0);
    }

    @ReplaceWith(expression = "sourceActivity.shouldUpRecreateTask(targetIntent)")
    @Deprecated
    public static boolean h(Activity activity0, Intent intent0) {
        return activity0.shouldUpRecreateTask(intent0);
    }
}

