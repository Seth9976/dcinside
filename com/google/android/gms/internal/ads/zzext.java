package com.google.android.gms.internal.ads;

final class zzext implements zzelc {
    final zzexu zza;

    zzext(zzexu zzexu0) {
        this.zza = zzexu0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized(this.zza) {
            this.zza.zza = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzcog zzcog0 = this.zza.zza;
            if(zzcog0 != null) {
                zzcog0.zzb();
            }
            this.zza.zza = (zzcog)object0;
            ((zzcog)object0).zzc(this.zza);
            this.zza.zzg.zzk(new zzcoh(((zzcog)object0), this.zza, this.zza.zzg, this.zza.zzi));
            ((zzcog)object0).zzk();
        }
    }
}

