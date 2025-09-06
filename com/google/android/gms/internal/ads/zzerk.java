package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;

public final class zzerk implements zzetr {
    private final zzgcs zza;
    private final zzduv zzb;

    zzerk(zzgcs zzgcs0, zzduv zzduv0) {
        this.zza = zzgcs0;
        this.zzb = zzduv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 23;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzerj zzerj0 = () -> new zzerl(this.zzb.zzc(), this.zzb.zzr(), zzv.zzt().zzl(), this.zzb.zzp(), this.zzb.zzs());
        return this.zza.zzb(zzerj0);
    }

    // 检测为 Lambda 实现
    final zzerl zzc() throws Exception [...]
}

