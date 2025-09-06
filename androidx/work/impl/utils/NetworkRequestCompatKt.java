package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nNetworkRequestCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequestCompatKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,145:1\n3819#2:146\n4337#2,2:147\n3819#2:149\n4337#2,2:150\n*S KotlinDebug\n*F\n+ 1 NetworkRequestCompat.kt\nandroidx/work/impl/utils/NetworkRequestCompatKt\n*L\n53#1:146\n53#1:147,2\n94#1:149\n94#1:150,2\n*E\n"})
public final class NetworkRequestCompatKt {
    @RequiresApi(28)
    @l
    public static final int[] a(@l NetworkRequest networkRequest0) {
        L.p(networkRequest0, "<this>");
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return NetworkRequest31.a.a(networkRequest0);
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < 29; ++v) {
            int v1 = new int[]{17, 5, 2, 10, 29, 19, 3, 0x20, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9}[v];
            if(NetworkRequest28.a.c(networkRequest0, v1)) {
                arrayList0.add(v1);
            }
        }
        return u.U5(arrayList0);
    }

    @RequiresApi(28)
    @l
    public static final int[] b(@l NetworkRequest networkRequest0) {
        L.p(networkRequest0, "<this>");
        if(Build.VERSION.SDK_INT >= 0x1F) {
            return NetworkRequest31.a.b(networkRequest0);
        }
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < 9; ++v) {
            int v1 = new int[]{2, 0, 3, 6, 9, 8, 4, 1, 5}[v];
            if(NetworkRequest28.a.d(networkRequest0, v1)) {
                arrayList0.add(v1);
            }
        }
        return u.U5(arrayList0);
    }
}

