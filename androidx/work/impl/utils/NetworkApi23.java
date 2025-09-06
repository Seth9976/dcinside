package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.i;

@RequiresApi(23)
@i(name = "NetworkApi23")
public final class NetworkApi23 {
    @m
    public static final Network a(@l ConnectivityManager connectivityManager0) {
        L.p(connectivityManager0, "<this>");
        return connectivityManager0.getActiveNetwork();
    }
}

