package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzenc implements zzetr {
    private final Executor zza;
    private final zzbzm zzb;

    zzenc(Executor executor0, zzbzm zzbzm0) {
        this.zza = executor0;
        this.zzb = zzbzm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 10;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        return ((Boolean)zzbe.zzc().zza(zzbcl.zzcW)).booleanValue() ? zzgch.zzh(new zzend(null)) : zzgch.zzm(this.zzb.zzk(), new zzenb(), this.zza);
    }
}

