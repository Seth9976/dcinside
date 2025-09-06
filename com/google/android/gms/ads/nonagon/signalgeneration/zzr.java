package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzche;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

public final class zzr implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzr(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzo(((zzche)this.zza).zza(), ((zzdsb)this.zzb.zzb()), zzffh.zzc());
    }
}

