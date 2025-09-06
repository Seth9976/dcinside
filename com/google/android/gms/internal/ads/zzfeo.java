package com.google.android.gms.internal.ads;

final class zzfeo implements zzgcd {
    final zzfer zza;
    final zzfes zzb;

    zzfeo(zzfes zzfes0, zzfer zzfer0) {
        this.zza = zzfer0;
        this.zzb = zzfes0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        synchronized(this.zzb) {
            zzfes.zzc(this.zzb, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        Void void0 = (Void)object0;
        synchronized(this.zzb) {
            zzfes.zzc(this.zzb, null);
            this.zzb.zzd.addFirst(this.zza);
            zzfes zzfes1 = this.zzb;
            if(zzfes1.zzf == 1) {
                zzfes1.zzh();
            }
        }
    }
}

