package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzeux implements zzetr {
    private final Executor zza;
    private final String zzb;

    public zzeux(zzbzd zzbzd0, Executor executor0, String s, @Nullable PackageInfo packageInfo0, int v) {
        this.zza = executor0;
        this.zzb = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 41;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        t0 t00 = zzgch.zzm(zzgch.zzh(this.zzb), new zzeuv(), this.zza);
        zzeuw zzeuw0 = (Throwable throwable0) -> zzgch.zzh(new zzeuy(this.zzb));
        return zzgch.zzf(t00, Throwable.class, zzeuw0, this.zza);
    }

    // 检测为 Lambda 实现
    final t0 zzc(Throwable throwable0) throws Exception [...]
}

