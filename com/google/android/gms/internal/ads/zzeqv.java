package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.common.util.concurrent.t0;

public final class zzeqv implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzeqv(zzgcs zzgcs0, Context context0) {
        this.zzb = zzgcs0;
        this.zza = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 57;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzequ zzequ0 = () -> new zzeqw(zzs.zzt(this.zza));
        return this.zzb.zzb(zzequ0);
    }

    // 检测为 Lambda 实现
    final zzeqw zzc() throws Exception [...]
}

