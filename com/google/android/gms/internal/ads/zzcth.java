package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;

public final class zzcth implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcth(zzctg zzctg0, zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzb(((Context)this.zza.zzb()), ((zzbxu)this.zzb.zzb()), null);
    }
}

