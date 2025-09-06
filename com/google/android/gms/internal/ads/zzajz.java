package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzajz {
    public static void zza(zzaka zzaka0, zzake zzake0, zzdb zzdb0) {
        for(int v = 0; v < zzaka0.zza(); ++v) {
            long v1 = zzaka0.zzb(v);
            List list0 = zzaka0.zzc(v1);
            if(!list0.isEmpty()) {
                if(v == zzaka0.zza() - 1) {
                    throw new IllegalStateException();
                }
                long v2 = zzaka0.zzb(v + 1) - zzaka0.zzb(v);
                if(v2 > 0L) {
                    zzdb0.zza(new zzajx(list0, v1, v2));
                }
            }
        }
    }
}

