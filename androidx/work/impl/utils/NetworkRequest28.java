package androidx.work.impl.utils;

import android.net.NetworkRequest.Builder;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.n;

@RequiresApi(28)
@s0({"SMAP\nNetworkRequestCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequest28\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,145:1\n13600#2,2:146\n13600#2,2:148\n*S KotlinDebug\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequest28\n*L\n109#1:146,2\n122#1:148,2\n*E\n"})
public final class NetworkRequest28 {
    @l
    public static final NetworkRequest28 a;

    static {
        NetworkRequest28.a = new NetworkRequest28();
    }

    @l
    @n
    public static final NetworkRequest a(@l int[] arr_v, @l int[] arr_v1) {
        L.p(arr_v, "capabilities");
        L.p(arr_v1, "transports");
        NetworkRequest.Builder networkRequest$Builder0 = new NetworkRequest.Builder();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            try {
                networkRequest$Builder0.addCapability(v2);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                Logger.e().m("WM-NetworkRequestCompat", "Ignoring adding capability \'" + v2 + '\'', illegalArgumentException0);
            }
        }
        for(int v = 0; v < arr_v1.length; ++v) {
            networkRequest$Builder0.addTransportType(arr_v1[v]);
        }
        NetworkRequest networkRequest0 = networkRequest$Builder0.build();
        L.o(networkRequest0, "networkRequest.build()");
        return networkRequest0;
    }

    @l
    public final NetworkRequestCompat b(@l int[] arr_v, @l int[] arr_v1) {
        L.p(arr_v, "capabilities");
        L.p(arr_v1, "transports");
        return new NetworkRequestCompat(NetworkRequest28.a(arr_v, arr_v1));
    }

    public final boolean c(@l NetworkRequest networkRequest0, int v) {
        L.p(networkRequest0, "request");
        return networkRequest0.hasCapability(v);
    }

    public final boolean d(@l NetworkRequest networkRequest0, int v) {
        L.p(networkRequest0, "request");
        return networkRequest0.hasTransport(v);
    }
}

