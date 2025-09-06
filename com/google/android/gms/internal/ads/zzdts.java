package com.google.android.gms.internal.ads;

public final class zzdts implements Runnable {
    public final zzdua zza;
    public final zzcab zzb;

    public zzdts(zzdua zzdua0, zzcab zzcab0) {
        this.zza = zzdua0;
        this.zzb = zzcab0;
    }

    @Override
    public final void run() {
        this.zza.zzo(this.zzb);
    }
}

