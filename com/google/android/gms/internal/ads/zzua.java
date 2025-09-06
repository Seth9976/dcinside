package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

@VisibleForTesting
public final class zzua extends zzbq {
    private final zzar zzb;

    public zzua(zzar zzar0) {
        this.zzb = zzar0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object object0) {
        return object0 == zztz.zzc ? 0 : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return 1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int v, zzbo zzbo0, boolean z) {
        Object object0 = null;
        Integer integer0 = z ? 0 : null;
        if(z) {
            object0 = zztz.zzc;
        }
        zzbo0.zzi(integer0, object0, 0, 0x8000000000000001L, 0L, zzb.zza, true);
        return zzbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int v, zzbp zzbp0, long v1) {
        zzbp0.zza(zzbp.zza, this.zzb, null, 0x8000000000000001L, 0x8000000000000001L, 0x8000000000000001L, false, true, null, 0L, 0x8000000000000001L, 0, 0, 0L);
        zzbp0.zzk = true;
        return zzbp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int v) {
        return zztz.zzc;
    }
}

