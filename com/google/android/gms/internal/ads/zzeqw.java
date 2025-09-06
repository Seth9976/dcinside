package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzeqw implements zzetq {
    @Nullable
    private final Integer zza;

    public zzeqw(@Nullable Integer integer0) {
        this.zza = integer0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Integer integer0 = this.zza;
        if(integer0 != null) {
            ((zzcuv)object0).zza.putInt("dspct", Math.min(((int)integer0), 20));
        }
    }
}

