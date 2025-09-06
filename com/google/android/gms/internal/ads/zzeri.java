package com.google.android.gms.internal.ads;

import android.content.Intent;

public final class zzeri implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzeri(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    public final zzerg zza() {
        return new zzerg(((zzche)this.zza).zza(), ((Intent)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

