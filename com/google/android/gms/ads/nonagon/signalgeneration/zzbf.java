package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzddk;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzgcs;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

public final class zzbf implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzbf(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzw zzw0 = (zzw)this.zza.zzb();
        zzbm zzbm0 = (zzbm)this.zzb.zzb();
        zzgcs zzgcs0 = zzffh.zzc();
        if(((int)(((Integer)this.zzc.zzb()))) == 2) {
            zzw0 = zzbm0;
        }
        return new zzddk(zzw0, zzgcs0);
    }
}

