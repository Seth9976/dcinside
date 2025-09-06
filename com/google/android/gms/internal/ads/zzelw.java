package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.t0;

public final class zzelw implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;

    zzelw(zzgcs zzgcs0, zzfcj zzfcj0, zzfcy zzfcy0) {
        this.zza = zzgcs0;
        this.zzb = zzfcj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 5;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzelv zzelv0 = () -> // 去混淆评级： 低(20)
        new zzelx((!((Boolean)zzbe.zzc().zza(zzbcl.zzgR)).booleanValue() || !"requester_type_2".equals(zzaa.zzc(this.zzb.zzd)) ? null : zzfcy.zza()));
        return this.zza.zzb(zzelv0);
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    final zzelx zzc() throws Exception [...]
}

