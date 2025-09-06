package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzcro {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final t0 zzc;
    private volatile boolean zzd;

    public zzcro(Executor executor0, ScheduledExecutorService scheduledExecutorService0, t0 t00) {
        this.zzd = true;
        this.zza = executor0;
        this.zzb = scheduledExecutorService0;
        this.zzc = t00;
    }

    // 检测为 Lambda 实现
    final t0 zza(zzgcd zzgcd0, t0 t00, zzcqz zzcqz0) throws Exception [...]

    static void zzb(zzcro zzcro0, List list0, zzgcd zzgcd0) {
        if(list0 != null && !list0.isEmpty()) {
            t0 t00 = zzgch.zzh(null);
            for(Object object0: list0) {
                zzcrk zzcrk0 = new zzcrk(zzgcd0);
                t00 = zzgch.zzn(zzgch.zzf(t00, Throwable.class, zzcrk0, zzcro0.zza), (zzcqz zzcqz0) -> {
                    if(zzcqz0 != null) {
                        zzgcd0.zzb(zzcqz0);
                    }
                    return zzgch.zzo(((t0)object0), ((long)(((Long)zzbey.zza.zze()))), TimeUnit.MILLISECONDS, zzcro0.zzb);
                }, zzcro0.zza);
            }
            zzgch.zzr(t00, new zzcrn(zzcro0, zzgcd0), zzcro0.zza);
            return;
        }
        zzcrj zzcrj0 = new zzcrj(zzgcd0);
        zzcro0.zza.execute(zzcrj0);
    }

    static void zzc(zzcro zzcro0) {
        zzcri zzcri0 = () -> zzcro0.zzd = false;
        zzbzw.zzf.execute(zzcri0);
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    public final void zze(zzgcd zzgcd0) {
        zzcrm zzcrm0 = new zzcrm(this, zzgcd0);
        zzgch.zzr(this.zzc, zzcrm0, this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}

