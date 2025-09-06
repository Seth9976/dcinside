package androidx.work.impl.utils;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

@RequiresApi(24)
@i(name = "NetworkApi24")
public final class NetworkApi24 {
    public static final void a(@l ConnectivityManager connectivityManager0, @l ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0) {
        L.p(connectivityManager0, "<this>");
        L.p(connectivityManager$NetworkCallback0, "networkCallback");
        connectivityManager0.registerDefaultNetworkCallback(connectivityManager$NetworkCallback0);
    }
}

