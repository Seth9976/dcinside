package com.google.android.gms.internal.ads;

final class zzekx implements zzelc {
    final zzeky zza;

    zzekx(zzeky zzeky0) {
        this.zza = zzeky0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized(this.zza) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            this.zza.zzc = ((zzcqz)object0).zzm();
            ((zzcqz)object0).zzk();
        }
    }
}

