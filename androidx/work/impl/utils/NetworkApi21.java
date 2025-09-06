package androidx.work.impl.utils;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

@RequiresApi(21)
@i(name = "NetworkApi21")
public final class NetworkApi21 {
    @m
    public static final NetworkCapabilities a(@l ConnectivityManager connectivityManager0, @m Network network0) {
        L.p(connectivityManager0, "<this>");
        return connectivityManager0.getNetworkCapabilities(network0);
    }

    public static final boolean b(@l NetworkCapabilities networkCapabilities0, int v) {
        L.p(networkCapabilities0, "<this>");
        return networkCapabilities0.hasCapability(v);
    }

    public static final void c(@l ConnectivityManager connectivityManager0, @l ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0) {
        L.p(connectivityManager0, "<this>");
        L.p(connectivityManager$NetworkCallback0, "networkCallback");
        connectivityManager0.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
    }
}

