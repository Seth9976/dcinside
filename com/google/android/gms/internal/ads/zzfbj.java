package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

final class zzfbj implements zzelc {
    final zzfbl zza;

    zzfbj(zzfbl zzfbl0) {
        this.zza = zzfbl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized(this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzelc
    public final void zzb(Object object0) {
        synchronized(this.zza) {
            this.zza.zzd = (zzdoa)object0;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
                ((zzdoa)object0).zzd().zza = this.zza.zzc;
            }
            this.zza.zzd.zzk();
        }
    }
}

