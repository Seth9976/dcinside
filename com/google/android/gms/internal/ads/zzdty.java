package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import o3.h;

final class zzdty implements zzgcd {
    final zzdua zza;

    zzdty(zzdua zzdua0) {
        this.zza = zzdua0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        synchronized(this) {
            zzdua.zzi(this.zza, true);
            long v1 = zzv.zzC().elapsedRealtime();
            this.zza.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", ((int)(v1 - this.zza.zzd)));
            this.zza.zze.zzd(new Exception());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@h Object object0) {
        synchronized(this) {
            zzdua.zzi(this.zza, true);
            long v1 = zzv.zzC().elapsedRealtime();
            this.zza.zzv("com.google.android.gms.ads.MobileAds", true, "", ((int)(v1 - this.zza.zzd)));
            this.zza.zzi.execute(new zzdtx(this, ((String)object0)));
        }
    }
}

