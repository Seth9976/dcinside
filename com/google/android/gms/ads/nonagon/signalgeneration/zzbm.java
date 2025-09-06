package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzdee;

public final class zzbm implements zzdee {
    private final zzb zza;
    private final int zzb;
    @Nullable
    private final String zzc;

    @VisibleForTesting
    public zzbm(zzb zzb0, int v, @Nullable String s) {
        this.zza = zzb0;
        this.zzb = v;
        this.zzc = s;
    }

    // 检测为 Lambda 实现
    final void zza(zzbk zzbk0) [...]

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbk0) {
        if(zzbk0 != null && this.zzb == 2 && !TextUtils.isEmpty(this.zzc)) {
            zzs.zzh(() -> this.zza.zzd(this.zzc, zzbk0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String s) {
    }
}

