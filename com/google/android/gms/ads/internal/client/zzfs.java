package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

public final class zzfs extends zzdq {
    @Nullable
    private final OnPaidEventListener zza;

    public zzfs(@Nullable OnPaidEventListener onPaidEventListener0) {
        this.zza = onPaidEventListener0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzu0) {
        OnPaidEventListener onPaidEventListener0 = this.zza;
        if(onPaidEventListener0 != null) {
            onPaidEventListener0.onPaidEvent(AdValue.zza(zzu0.zzb, zzu0.zzc, zzu0.zzd));
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() {
        return this.zza == null;
    }
}

