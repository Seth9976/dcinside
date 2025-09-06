package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zze;

final class zzav extends zzdk {
    final Context zza;
    final zzay zzb;

    zzav(zzay zzay0, Context context0) {
        this.zza = context0;
        this.zzb = zzay0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(@Nullable zze zze0) {
        if(zze0 == null) {
            return;
        }
        this.zzb.zzi(this.zza, zze0.zzb, true, true);
    }
}

