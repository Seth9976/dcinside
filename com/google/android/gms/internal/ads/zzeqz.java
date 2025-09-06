package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.t0;

public final class zzeqz implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;

    zzeqz(zzgcs zzgcs0, zzfcj zzfcj0) {
        this.zza = zzgcs0;
        this.zzb = zzfcj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 21;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeqy zzeqy0 = () -> new zzera("requester_type_2".equals(zzaa.zzc(this.zzb.zzd)));
        return this.zza.zzb(zzeqy0);
    }

    // 检测为 Lambda 实现
    final zzera zzc() throws Exception [...]
}

