package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.concurrent.Executor;

public final class zzeyb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;

    public zzeyb(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
        this.zzf = zzhfj5;
        this.zzg = zzhfj7;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzeya(((Context)this.zza.zzb()), ((Executor)this.zzb.zzb()), ((zzs)this.zzc.zzb()), ((zzcgx)this.zzd.zzb()), ((zzekn)this.zze.zzb()), ((zzekr)this.zzf.zzb()), new zzfch(), ((zzdar)this.zzg.zzb()));
    }
}

