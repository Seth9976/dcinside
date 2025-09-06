package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi23;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import y4.l;

public final class NetworkStateTrackerKt {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-NetworkStateTracker", "tagWithPrefix(\"NetworkStateTracker\")");
        NetworkStateTrackerKt.a = "WM-NetworkStateTracker";
    }

    @RestrictTo({Scope.b})
    @l
    public static final ConstraintTracker a(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        return Build.VERSION.SDK_INT >= 24 ? new NetworkStateTracker24(context0, taskExecutor0) : new NetworkStateTrackerPre24(context0, taskExecutor0);
    }

    // 去混淆评级： 低(20)
    public static final String b() [...] // 潜在的解密器

    @l
    public static final NetworkState c(@l ConnectivityManager connectivityManager0) {
        L.p(connectivityManager0, "<this>");
        NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        boolean z = false;
        boolean z1 = networkInfo0 != null && networkInfo0.isConnected();
        boolean z2 = NetworkStateTrackerKt.f(connectivityManager0);
        boolean z3 = ConnectivityManagerCompat.c(connectivityManager0);
        if(networkInfo0 != null && !networkInfo0.isRoaming()) {
            z = true;
        }
        return new NetworkState(z1, z2, z3, z);
    }

    @RequiresApi(28)
    @l
    public static final NetworkState d(@l NetworkCapabilities networkCapabilities0) {
        L.p(networkCapabilities0, "<this>");
        return new NetworkState(networkCapabilities0.hasCapability(12), networkCapabilities0.hasCapability(16), !networkCapabilities0.hasCapability(11), networkCapabilities0.hasCapability(18));
    }

    public static void e(ConnectivityManager connectivityManager0) {
    }

    public static final boolean f(@l ConnectivityManager connectivityManager0) {
        L.p(connectivityManager0, "<this>");
        if(Build.VERSION.SDK_INT >= 23) {
            try {
                NetworkCapabilities networkCapabilities0 = NetworkApi21.a(connectivityManager0, NetworkApi23.a(connectivityManager0));
                if(networkCapabilities0 != null) {
                    return NetworkApi21.b(networkCapabilities0, 16);
                }
            }
            catch(SecurityException securityException0) {
                Logger.e().d("WM-NetworkStateTracker", "Unable to validate active network", securityException0);
            }
        }
        return false;
    }
}

