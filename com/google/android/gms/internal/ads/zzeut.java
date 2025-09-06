package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class zzeut implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzeut(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6) {
        this.zza = zzhfj1;
        this.zzb = zzhfj2;
        this.zzc = zzhfj4;
        this.zzd = zzhfj5;
        this.zze = zzhfj6;
    }

    public static zzeur zza(zzbzd zzbzd0, Context context0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, int v, boolean z, boolean z1) {
        return new zzeur(zzbzd0, context0, scheduledExecutorService0, executor0, v, z, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzeur(zzckt.zza(), ((zzche)this.zza).zza(), ((ScheduledExecutorService)this.zzb.zzb()), zzffh.zzc(), ((int)((zzevz)this.zzc).zza()), ((zzewa)this.zzd).zza().booleanValue(), ((zzewc)this.zze).zza().booleanValue());
    }
}

