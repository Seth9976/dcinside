package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzesi implements zzetq {
    @Nullable
    private final Bundle zza;

    public zzesi(@Nullable Bundle bundle0) {
        this.zza = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
        Bundle bundle0 = this.zza;
        if(bundle0 != null) {
            ((zzcuv)object0).zzb.putAll(bundle0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = this.zza;
        if(bundle0 != null) {
            ((zzcuv)object0).zza.putAll(bundle0);
        }
    }
}

