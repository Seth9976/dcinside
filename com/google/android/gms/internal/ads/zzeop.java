package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

public final class zzeop implements zzetr {
    private final zzgcs zza;
    private final zzdpr zzb;
    private final String zzc;
    private final zzfcj zzd;

    public zzeop(zzgcs zzgcs0, zzdpr zzdpr0, zzfcj zzfcj0, String s) {
        this.zza = zzgcs0;
        this.zzb = zzdpr0;
        this.zzd = zzfcj0;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 17;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzeoo zzeoo0 = () -> new zzeoq(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
        return this.zza.zzb(zzeoo0);
    }

    // 检测为 Lambda 实现
    final zzeoq zzc() throws Exception [...]
}

