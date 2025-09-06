package com.google.android.gms.internal.ads;

final class zzefz implements zzgcd {
    final zzfbo zza;
    final zzega zzb;

    zzefz(zzega zzega0, zzfbo zzfbo0) {
        this.zza = zzfbo0;
        this.zzb = zzega0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        synchronized(this.zzb) {
            this.zzb.zzh.zzb(throwable0, this.zza);
            zzfbo zzfbo0 = this.zzb.zzh.zza();
            if(this.zza.zzav) {
                while(zzfbo0 != null) {
                    this.zzb.zze(zzfbo0);
                    zzfbo0 = this.zzb.zzh.zza();
                }
            }
            else if(zzfbo0 != null) {
                this.zzb.zze(zzfbo0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        synchronized(this.zzb) {
            this.zzb.zzh.zzc(((zzegr)object0), this.zza);
            zzfbo zzfbo0 = this.zzb.zzh.zza();
            if(zzfbo0 != null) {
                this.zzb.zze(zzfbo0);
            }
        }
    }
}

