package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzevb implements zzetr {
    private final zzbzm zza;
    private final ScheduledExecutorService zzb;
    private final zzgcs zzc;

    zzevb(String s, zzbam zzbam0, zzbzm zzbzm0, ScheduledExecutorService scheduledExecutorService0, zzgcs zzgcs0) {
        this.zza = zzbzm0;
        this.zzb = scheduledExecutorService0;
        this.zzc = zzgcs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 43;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzcX)).booleanValue() && ((Boolean)zzbe.zzc().zza(zzbcl.zzdc)).booleanValue()) {
            t0 t00 = zzgch.zzn(zzfrj.zza(Tasks.forResult(null), null), new zzeuz(), this.zzc);
            if(((Boolean)zzbdy.zza.zze()).booleanValue()) {
                t00 = zzgch.zzo(t00, ((long)(((Long)zzbdy.zzb.zze()))), TimeUnit.MILLISECONDS, this.zzb);
            }
            zzeva zzeva0 = (Exception exception0) -> {
                this.zza.zzw(exception0, "AppSetIdInfoGmscoreSignal");
                return new zzevc(null, -1);
            };
            return zzgch.zze(t00, Exception.class, zzeva0, this.zzc);
        }
        return zzgch.zzh(new zzevc(null, -1));
    }

    // 检测为 Lambda 实现
    final zzevc zzc(Exception exception0) [...]
}

