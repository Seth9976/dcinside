package androidx.core.net;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ConnectivityManagerCompat {
    @RequiresApi(24)
    static class Api24Impl {
        static int a(ConnectivityManager connectivityManager0) {
            return connectivityManager0.getRestrictBackgroundStatus();
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;

    @SuppressLint({"ReferencesDeprecated"})
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo a(ConnectivityManager connectivityManager0, Intent intent0) {
        NetworkInfo networkInfo0 = (NetworkInfo)intent0.getParcelableExtra("networkInfo");
        return networkInfo0 == null ? null : connectivityManager0.getNetworkInfo(networkInfo0.getType());
    }

    public static int b(ConnectivityManager connectivityManager0) {
        return Build.VERSION.SDK_INT < 24 ? 3 : Api24Impl.a(connectivityManager0);
    }

    @ReplaceWith(expression = "cm.isActiveNetworkMetered()")
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @Deprecated
    public static boolean c(ConnectivityManager connectivityManager0) {
        return connectivityManager0.isActiveNetworkMetered();
    }
}

