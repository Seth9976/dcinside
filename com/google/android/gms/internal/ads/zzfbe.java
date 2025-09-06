package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

final class zzfbe implements zzelc {
    final zzfbf zza;

    zzfbe(zzfbf zzfbf0) {
        this.zza = zzfbf0;
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
            this.zza.zzi = (zzdoa)object0;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
                ((zzdoa)object0).zzd().zza = this.zza.zzd;
            }
            this.zza.zzi.zzk();
        }
    }
}

