package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidStoreDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStoreDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidStoreDataSource\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,32:1\n11335#2:33\n11670#2,3:34\n766#3:37\n857#3,2:38\n*S KotlinDebug\n*F\n+ 1 AndroidStoreDataSource.kt\ncom/unity3d/ads/core/data/datasource/AndroidStoreDataSource\n*L\n14#1:33\n14#1:34,3\n16#1:37\n16#1:38,2\n*E\n"})
public final class AndroidStoreDataSource implements StoreDataSource {
    @l
    private final Context context;

    public AndroidStoreDataSource(@l Context context0) {
        L.p(context0, "context");
        super();
        this.context = context0;
    }

    @Override  // com.unity3d.ads.core.data.datasource.StoreDataSource
    @l
    public List fetchStores(@l List list0) {
        PackageInfo packageInfo0;
        L.p(list0, "additionalStores");
        AndroidKnownStore[] arr_androidKnownStore = AndroidKnownStore.values();
        ArrayList arrayList0 = new ArrayList(arr_androidKnownStore.length);
        for(int v = 0; v < arr_androidKnownStore.length; ++v) {
            arrayList0.add(arr_androidKnownStore[v].getPackageName());
        }
        List list1 = u.a2(u.D4(arrayList0, list0));
        PackageManager packageManager0 = this.context.getPackageManager();
        List list2 = new ArrayList();
        for(Object object0: list1) {
            String s = (String)object0;
            try {
                packageInfo0 = Build.VERSION.SDK_INT >= 33 ? packageManager0.getPackageInfo(s, PackageManager.PackageInfoFlags.of(0L)) : packageManager0.getPackageInfo(s, 0);
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                continue;
            }
            if(packageInfo0 != null) {
                list2.add(object0);
            }
        }
        return list2;
    }
}

