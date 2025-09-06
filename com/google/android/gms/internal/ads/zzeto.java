package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.common.util.concurrent.t0;

public final class zzeto implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    zzeto(zzgcs zzgcs0, Context context0) {
        this.zza = zzgcs0;
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 37;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzetm zzetm0 = () -> {
            String s = (String)zzbe.zzc().zza(zzbcl.zzfX);
            return new zzetn(zzad.zzb(this.zzb, s));
        };
        return this.zza.zzb(zzetm0);
    }

    // 检测为 Lambda 实现
    final zzetn zzc() throws Exception [...]
}

