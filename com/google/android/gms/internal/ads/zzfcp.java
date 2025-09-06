package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import java.util.List;

public final class zzfcp {
    public static zzs zza(Context context0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            zzfbp zzfbp0 = (zzfbp)object0;
            if(zzfbp0.zzc) {
                arrayList0.add(AdSize.FLUID);
            }
            else {
                arrayList0.add(new AdSize(zzfbp0.zza, zzfbp0.zzb));
            }
        }
        return new zzs(context0, ((AdSize[])arrayList0.toArray(new AdSize[arrayList0.size()])));
    }

    // 去混淆评级： 低(20)
    public static zzfbp zzb(zzs zzs0) {
        return zzs0.zzi ? new zzfbp(-3, 0, true) : new zzfbp(zzs0.zze, zzs0.zzb, false);
    }
}

