package com.google.android.gms.internal.ads;

public final class zzdtq implements Runnable {
    public final zzdua zza;
    public final Object zzb;
    public final zzcab zzc;
    public final String zzd;
    public final long zze;
    public final zzfgw zzf;

    public zzdtq(zzdua zzdua0, Object object0, zzcab zzcab0, String s, long v, zzfgw zzfgw0) {
        this.zza = zzdua0;
        this.zzb = object0;
        this.zzc = zzcab0;
        this.zzd = s;
        this.zze = v;
        this.zzf = zzfgw0;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}

