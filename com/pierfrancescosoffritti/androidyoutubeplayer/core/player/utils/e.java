package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;

public final class e {
    private static final boolean b(Context context0) {
        Object object0 = context0.getSystemService("connectivity");
        L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        if(Build.VERSION.SDK_INT >= 24) {
            NetworkCapabilities networkCapabilities0 = ((ConnectivityManager)object0).getNetworkCapabilities(((ConnectivityManager)object0).getActiveNetwork());
            return networkCapabilities0 == null ? false : e.c(networkCapabilities0);
        }
        NetworkInfo networkInfo0 = ((ConnectivityManager)object0).getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    // 去混淆评级： 低(30)
    @RequiresApi(21)
    private static final boolean c(NetworkCapabilities networkCapabilities0) {
        return networkCapabilities0.hasTransport(1) || networkCapabilities0.hasTransport(0) || networkCapabilities0.hasTransport(3);
    }
}

