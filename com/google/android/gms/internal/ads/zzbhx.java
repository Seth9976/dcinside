package com.google.android.gms.internal.ads;

final class zzbhx extends zzbgz {
    final zzbia zza;

    zzbhx(zzbia zzbia0, zzbhz zzbhz0) {
        this.zza = zzbia0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgq0, String s) {
        zzbia zzbia0 = this.zza;
        if(zzbia0.zzb == null) {
            return;
        }
        zzbia0.zzb.zzb(zzbia0.zzf(zzbgq0), s);
    }
}

