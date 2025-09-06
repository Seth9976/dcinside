package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzesd implements zzetr {
    private final zzetr zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzesd(zzetr zzetr0, long v, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = zzetr0;
        this.zzb = v;
        this.zzc = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        t0 t00 = this.zza.zzb();
        TimeUnit timeUnit0 = ((Boolean)zzbe.zzc().zza(zzbcl.zzcr)).booleanValue() ? TimeUnit.MICROSECONDS : TimeUnit.MILLISECONDS;
        long v = this.zzb;
        if(v > 0L) {
            t00 = zzgch.zzo(t00, v, timeUnit0, this.zzc);
        }
        zzesc zzesc0 = (Throwable throwable0) -> {
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzcq)).booleanValue()) {
                zzv.zzp().zzw(throwable0, "OptionalSignalTimeout:" + this.zza.zza());
            }
            return zzgch.zzh(null);
        };
        return zzgch.zzf(t00, Throwable.class, zzesc0, zzbzw.zzg);
    }

    // 检测为 Lambda 实现
    final t0 zzc(Throwable throwable0) throws Exception [...]
}

