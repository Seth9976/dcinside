package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

public final class zzemo implements zzetq {
    private final Bundle zza;

    @VisibleForTesting
    zzemo(Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        if(!this.zza.isEmpty()) {
            ((zzcuv)object0).zza.putBundle("installed_adapter_data", this.zza);
        }
    }
}

