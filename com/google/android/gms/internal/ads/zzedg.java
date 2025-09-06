package com.google.android.gms.internal.ads;

public final class zzedg implements zzfuc {
    public final zzcex zza;
    public final zzfbo zzb;
    public final zzcnx zzc;

    public zzedg(zzedh zzedh0, zzcex zzcex0, zzfbo zzfbo0, zzcnx zzcnx0) {
        this.zza = zzcex0;
        this.zzb = zzfbo0;
        this.zzc = zzcnx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuc
    public final Object apply(Object object0) {
        zzcex zzcex0 = this.zza;
        if(this.zzb.zzM) {
            zzcex0.zzah();
        }
        zzcex0.zzab();
        zzcex0.onPause();
        return this.zzc.zza();
    }
}

