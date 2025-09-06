package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;

public final class zzbiq implements zzgbo {
    public final zzcmk zza;
    public final String zzb;

    public zzbiq(zzcmk zzcmk0, String s) {
        this.zza = zzcmk0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzjT)).booleanValue()) {
            return this.zza == null || !zzcmk.zzj(this.zzb) ? zzgch.zzh(((String)object0)) : this.zza.zzb(((String)object0), zzbc.zze());
        }
        return zzgch.zzh(((String)object0));
    }
}

