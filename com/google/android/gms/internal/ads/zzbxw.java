package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzbxw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzbxw(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzbxv(((Context)this.zza.zzb()), ((zzg)this.zzb.zzb()));
    }
}

