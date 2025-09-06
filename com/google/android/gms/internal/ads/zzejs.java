package com.google.android.gms.internal.ads;

final class zzejs implements zzelc {
    final zzejt zza;

    zzejs(zzejt zzejt0) {
        this.zza = zzejt0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized(this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            zzejt zzejt1 = this.zza;
            if(zzejt1.zzi != null) {
                zzejt1.zzi.zzb();
            }
            this.zza.zzi = (zzcom)object0;
            this.zza.zzi.zzk();
        }
    }
}

