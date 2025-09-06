package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.t0;

public final class zzenp implements zzetr {
    private final zzgcs zza;
    private final VersionInfoParcel zzb;

    zzenp(VersionInfoParcel versionInfoParcel0, zzgcs zzgcs0) {
        this.zzb = versionInfoParcel0;
        this.zza = zzgcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 54;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeno zzeno0 = () -> zzenq.zzc(this.zzb);
        return this.zza.zzb(zzeno0);
    }

    // 检测为 Lambda 实现
    final zzenq zzc() throws Exception [...]
}

