package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.google.common.util.concurrent.t0;

public final class zzell implements zzetr {
    private final Context zza;

    zzell(Context context0) {
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        return ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0 ? zzgch.zzh(new zzelm(true)) : zzgch.zzh(new zzelm(false));
    }
}

