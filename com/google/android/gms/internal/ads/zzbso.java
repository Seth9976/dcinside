package com.google.android.gms.internal.ads;

final class zzbso extends zzbgz {
    final zzbsr zza;

    zzbso(zzbsr zzbsr0, zzbsq zzbsq0) {
        this.zza = zzbsr0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgq0, String s) {
        zzbsr zzbsr0 = this.zza;
        if(zzbsr0.zzb == null) {
            return;
        }
        zzbsr0.zzb.onCustomClick(zzbsr0.zzf(zzbgq0), s);
    }
}

