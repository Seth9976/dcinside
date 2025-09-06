package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.t0;

public final class zzeoe implements zzetr {
    @Nullable
    private final zzeym zza;

    zzeoe(@Nullable zzeym zzeym0) {
        this.zza = zzeym0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 15;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeym zzeym0 = this.zza;
        if(zzeym0 == null) {
            return zzgch.zzh(new zzeod(null));
        }
        String s = zzeym0.zza();
        return Strings.isEmptyOrWhitespace(s) ? zzgch.zzh(new zzeod(null)) : zzgch.zzh(new zzeod(s));
    }
}

