package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.t0;

public final class zzetx implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    zzetx(Context context0, zzgcs zzgcs0) {
        this.zza = context0;
        this.zzb = zzgcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 59;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        if(((Boolean)zzbed.zzb.zze()).booleanValue()) {
            zzetw zzetw0 = () -> new zzety(zzbbv.zzb(this.zza), zzbbv.zza(this.zza));
            return this.zzb.zzb(zzetw0);
        }
        return zzgch.zzh(new zzety(-1, -1));
    }

    // 检测为 Lambda 实现
    final zzety zzc() throws Exception [...]
}

