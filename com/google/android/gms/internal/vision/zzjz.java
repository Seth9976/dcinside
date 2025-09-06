package com.google.android.gms.internal.vision;

import java.util.List;

final class zzjz extends zzju {
    private zzjz() {
        super(null);
    }

    zzjz(zzjx zzjx0) {
    }

    @Override  // com.google.android.gms.internal.vision.zzju
    final List zza(Object object0, long v) {
        List list0 = zzjz.zzc(object0, v);
        if(!((zzjl)list0).zza()) {
            int v1 = list0.size();
            list0 = ((zzjl)list0).zza((v1 == 0 ? 10 : v1 << 1));
            zzma.zza(object0, v, list0);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.vision.zzju
    final void zza(Object object0, Object object1, long v) {
        zzjl zzjl0 = zzjz.zzc(object0, v);
        zzjl zzjl1 = zzjz.zzc(object1, v);
        int v1 = zzjl0.size();
        int v2 = zzjl1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzjl0.zza()) {
                zzjl0 = zzjl0.zza(v2 + v1);
            }
            zzjl0.addAll(zzjl1);
        }
        if(v1 > 0) {
            zzjl1 = zzjl0;
        }
        zzma.zza(object0, v, zzjl1);
    }

    @Override  // com.google.android.gms.internal.vision.zzju
    final void zzb(Object object0, long v) {
        zzjz.zzc(object0, v).zzb();
    }

    private static zzjl zzc(Object object0, long v) {
        return (zzjl)zzma.zzf(object0, v);
    }
}

