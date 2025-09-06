package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(0x1F)
final class NetworkRequest31 {
    @l
    public static final NetworkRequest31 a;

    static {
        NetworkRequest31.a = new NetworkRequest31();
    }

    @l
    public final int[] a(@l NetworkRequest networkRequest0) {
        L.p(networkRequest0, "request");
        int[] arr_v = networkRequest0.getCapabilities();
        L.o(arr_v, "request.capabilities");
        return arr_v;
    }

    @l
    public final int[] b(@l NetworkRequest networkRequest0) {
        L.p(networkRequest0, "request");
        int[] arr_v = networkRequest0.getTransportTypes();
        L.o(arr_v, "request.transportTypes");
        return arr_v;
    }
}

