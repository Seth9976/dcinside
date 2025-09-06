package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzkl implements zzkm {
    @Override  // com.google.android.gms.internal.measurement.zzkm
    public final List zza(Object object0, long v) {
        List list0 = zzkl.zzc(object0, v);
        if(!((zzkc)list0).zzc()) {
            int v1 = list0.size();
            list0 = ((zzkc)list0).zza((v1 == 0 ? 10 : v1 << 1));
            zzml.zza(object0, v, list0);
        }
        return list0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzkm
    public final void zza(Object object0, Object object1, long v) {
        zzkc zzkc0 = zzkl.zzc(object0, v);
        zzkc zzkc1 = zzkl.zzc(object1, v);
        int v1 = zzkc0.size();
        int v2 = zzkc1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzkc0.zzc()) {
                zzkc0 = zzkc0.zza(v2 + v1);
            }
            zzkc0.addAll(zzkc1);
        }
        if(v1 > 0) {
            zzkc1 = zzkc0;
        }
        zzml.zza(object0, v, zzkc1);
    }

    @Override  // com.google.android.gms.internal.measurement.zzkm
    public final void zzb(Object object0, long v) {
        zzkl.zzc(object0, v).zzb();
    }

    private static zzkc zzc(Object object0, long v) {
        return (zzkc)zzml.zze(object0, v);
    }
}

