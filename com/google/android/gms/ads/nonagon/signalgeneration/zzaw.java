package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzgcd;

final class zzaw implements zzgcd {
    final zzdeh zza;

    zzaw(zzdeh zzdeh0) {
        this.zza = zzdeh0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        this.zza.zzb(throwable0.getMessage());
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@Nullable Object object0) {
        this.zza.zza(((zzbk)object0));
    }
}

