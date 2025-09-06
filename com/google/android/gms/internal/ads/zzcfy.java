package com.google.android.gms.internal.ads;

public final class zzcfy implements Runnable {
    public final zzcfz zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final boolean zze;

    public zzcfy(zzcfz zzcfz0, int v, int v1, boolean z, boolean z1) {
        this.zza = zzcfz0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = z1;
    }

    @Override
    public final void run() {
        this.zza.zzd(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

