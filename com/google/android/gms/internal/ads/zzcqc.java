package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzcqc implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcqc(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    public final zzcqb zza() {
        return new zzcqb(((zzcpj)this.zza).zza(), ((Executor)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

