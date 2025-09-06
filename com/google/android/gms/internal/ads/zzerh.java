package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzerh implements zzetq {
    @Nullable
    private final Boolean zza;

    public zzerh(@Nullable Boolean boolean0) {
        this.zza = boolean0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        Bundle bundle0 = ((zzcuv)object0).zza;
        Boolean boolean0 = this.zza;
        if(boolean0 == null) {
            bundle0.putInt("lft", -1);
            return;
        }
        if(boolean0.booleanValue()) {
            bundle0.putInt("lft", 1);
            return;
        }
        bundle0.putInt("lft", 0);
    }
}

