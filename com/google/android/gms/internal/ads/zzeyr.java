package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzeyr implements zzezf {
    private final zzfdw zza;
    private final Executor zzb;
    private final zzgcd zzc;

    public zzeyr(zzfdw zzfdw0, Executor executor0) {
        this.zzc = new zzeyp(this);
        this.zza = zzfdw0;
        this.zzb = executor0;
    }

    // 检测为 Lambda 实现
    final t0 zza(zzcuz zzcuz0, zzeyz zzeyz0) throws Exception [...]

    public final t0 zzb(zzezg zzezg0, zzeze zzeze0, zzcuz zzcuz0) {
        zzgby zzgby0 = (zzgby)zzgch.zzn(zzgby.zzu(new zzezb(this.zza, zzcuz0, this.zzb).zzc()), (zzeyz zzeyz0) -> {
            zzfeg zzfeg0 = zzeyz0.zzb;
            zzbvk zzbvk0 = zzeyz0.zza;
            zzfef zzfef0 = this.zza.zzb(zzfeg0);
            if(zzfef0 != null && zzbvk0 != null) {
                zzgch.zzr(zzcuz0.zzb().zzg(zzbvk0), this.zzc, this.zzb);
            }
            return zzgch.zzh(new zzeyq(zzfeg0, zzbvk0, zzfef0));
        }, this.zzb);
        zzeyo zzeyo0 = new zzeyo(this);
        return (zzgby)zzgch.zze(zzgby0, Exception.class, zzeyo0, this.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final t0 zzc(zzezg zzezg0, zzeze zzeze0, Object object0) {
        return this.zzb(zzezg0, zzeze0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzezf
    public final Object zzd() {
        return null;
    }
}

