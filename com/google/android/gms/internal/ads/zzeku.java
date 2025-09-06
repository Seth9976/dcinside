package com.google.android.gms.internal.ads;

final class zzeku implements zzelc {
    final zzekv zza;

    zzeku(zzekv zzekv0) {
        this.zza = zzekv0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized(this.zza) {
            this.zza.zzj = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            this.zza.zzj = (zzdeq)object0;
            this.zza.zzj.zzk();
        }
    }
}

