package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@RequiresApi(30)
public final class NetworkRequest30 {
    @l
    public static final NetworkRequest30 a;

    static {
        NetworkRequest30.a = new NetworkRequest30();
    }

    @m
    public final NetworkSpecifier a(@l NetworkRequest networkRequest0) {
        L.p(networkRequest0, "request");
        return networkRequest0.getNetworkSpecifier();
    }
}

