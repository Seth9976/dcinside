package com.google.android.gms.vision;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public class L {
    @RecentlyNonNull
    @KeepForSdk
    public static final String TAG = "Vision";

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static int d(@RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        return Log.isLoggable("Vision", 3) ? Log.d("Vision", String.format(s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static int d(@RecentlyNonNull Throwable throwable0, @RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        return Log.isLoggable("Vision", 3) ? Log.d("Vision", String.format(s, arr_object), throwable0) : 0;
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static int e(@RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        return Log.isLoggable("Vision", 6) ? Log.e("Vision", String.format(s, arr_object)) : 0;
    }

    @SuppressLint({"LogTagMismatch"})
    @KeepForSdk
    public static int e(@RecentlyNonNull Throwable throwable0, @RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        if(Log.isLoggable("Vision", 6)) {
            return Log.isLoggable("Vision", 3) ? Log.e("Vision", String.format(s, arr_object), throwable0) : Log.e("Vision", String.format(s, arr_object) + ": " + throwable0);
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static int i(@RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        return Log.isLoggable("Vision", 4) ? Log.i("Vision", String.format(s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static int v(@RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        return Log.isLoggable("Vision", 2) ? Log.v("Vision", String.format(s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    @KeepForSdk
    public static int w(@RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        return Log.isLoggable("Vision", 5) ? Log.w("Vision", String.format(s, arr_object)) : 0;
    }

    @SuppressLint({"LogTagMismatch"})
    @KeepForSdk
    public static int w(@RecentlyNonNull Throwable throwable0, @RecentlyNonNull String s, @RecentlyNonNull Object[] arr_object) {
        if(Log.isLoggable("Vision", 5)) {
            return Log.isLoggable("Vision", 3) ? Log.w("Vision", String.format(s, arr_object), throwable0) : Log.w("Vision", String.format(s, arr_object) + ": " + throwable0);
        }
        return 0;
    }
}

