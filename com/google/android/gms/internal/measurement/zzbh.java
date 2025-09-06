package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

final class zzbh implements Comparator {
    private final zzal zza;
    private final zzh zzb;

    zzbh(zzal zzal0, zzh zzh0) {
        this.zza = zzal0;
        this.zzb = zzh0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        zzal zzal0 = this.zza;
        zzh zzh0 = this.zzb;
        if(((zzaq)object0) instanceof zzax) {
            return ((zzaq)object1) instanceof zzax ? 0 : 1;
        }
        if(((zzaq)object1) instanceof zzax) {
            return -1;
        }
        return zzal0 == null ? ((zzaq)object0).zzf().compareTo(((zzaq)object1).zzf()) : ((int)zzg.zza(((double)zzal0.zza(zzh0, Arrays.asList(new zzaq[]{((zzaq)object0), ((zzaq)object1)})).zze())));
    }
}

