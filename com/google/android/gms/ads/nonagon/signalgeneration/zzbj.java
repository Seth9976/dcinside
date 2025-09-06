package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdxa;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

public final class zzbj implements zzher {
    private final zzhfj zza;

    public zzbj(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj1;
    }

    public final zzbi zza() {
        return new zzbi(zzffh.zzc(), ((zzdxa)this.zza).zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

