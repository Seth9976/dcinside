package androidx.core.app;

import android.app.ActivityManager;
import androidx.annotation.ReplaceWith;

public final class ActivityManagerCompat {
    @ReplaceWith(expression = "activityManager.isLowRamDevice()")
    @Deprecated
    public static boolean a(ActivityManager activityManager0) {
        return activityManager0.isLowRamDevice();
    }
}

