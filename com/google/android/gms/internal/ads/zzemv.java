package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

public final class zzemv implements zzetq {
    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzemv(@Nullable String s, boolean z) {
        this.zza = s;
        this.zzb = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zza(Object object0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzetq
    public final void zzb(Object object0) {
        String s = this.zza;
        if(s != null) {
            Bundle bundle0 = zzfcx.zza(((zzcuv)object0).zza, "pii");
            bundle0.putString("afai", s);
            bundle0.putBoolean("is_afai_lat", this.zzb);
        }
    }
}

