package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public final class zzcoq implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;
    private final zzhfj zzj;

    public zzcoq(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5, zzhfj zzhfj6, zzhfj zzhfj7, zzhfj zzhfj8, zzhfj zzhfj9) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
        this.zzf = zzhfj5;
        this.zzg = zzhfj6;
        this.zzh = zzhfj7;
        this.zzi = zzhfj8;
        this.zzj = zzhfj9;
    }

    public final zzcop zza() {
        return new zzcop(((zzctf)this.zza).zza(), ((Context)this.zzb.zzb()), ((zzcow)this.zzc).zza(), ((zzcov)this.zzd).zza(), ((zzcpj)this.zze).zza(), ((zzcox)this.zzf).zza(), ((zzdgo)this.zzg).zza(), ((zzddu)this.zzh.zzb()), zzheq.zza(zzhfc.zza(this.zzi)), ((Executor)this.zzj.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }

    public static zzcop zzc(zzcqy zzcqy0, Context context0, zzfbp zzfbp0, View view0, @Nullable zzcex zzcex0, zzcqx zzcqx0, zzdiq zzdiq0, zzddu zzddu0, zzhel zzhel0, Executor executor0) {
        return new zzcop(zzcqy0, context0, zzfbp0, view0, zzcex0, zzcqx0, zzdiq0, zzddu0, zzhel0, executor0);
    }
}

