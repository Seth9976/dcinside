package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

public final class zzeye implements zzgbo {
    public final zzfef zza;
    public final zzcsd zzb;

    public zzeye(zzeyg zzeyg0, zzfef zzfef0, zzcsd zzcsd0) {
        this.zza = zzfef0;
        this.zzb = zzcsd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        this.zza.zzb = (zzfca)object0;
        boolean z = false;
        for(Object object1: ((zzfca)object0).zzb.zza) {
            for(Object object2: ((zzfbo)object1).zza) {
                if(!((String)object2).contains("FirstPartyRenderer")) {
                    return zzgch.zzh(null);
                }
                z = true;
            }
        }
        if(z) {
            t0 t00 = zzgch.zzh(((zzfca)object0));
            return this.zzb.zzh(t00);
        }
        return zzgch.zzh(null);
    }
}

