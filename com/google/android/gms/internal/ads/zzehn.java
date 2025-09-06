package com.google.android.gms.internal.ads;

public final class zzehn implements zzfuc {
    public final zzcex zza;
    public final zzfbo zzb;
    public final zzdob zzc;

    public zzehn(zzeht zzeht0, zzcex zzcex0, zzfbo zzfbo0, zzdob zzdob0) {
        this.zza = zzcex0;
        this.zzb = zzfbo0;
        this.zzc = zzdob0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        zzcex zzcex0 = this.zza;
        if(this.zzb.zzM) {
            zzcex0.zzah();
        }
        zzcex0.zzab();
        zzcex0.onPause();
        return this.zzc.zzi();
    }
}

