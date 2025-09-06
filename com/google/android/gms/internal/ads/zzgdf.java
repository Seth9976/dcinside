package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o3.a;

final class zzgdf extends zzgbx {
    @a
    private t0 zza;
    @a
    private ScheduledFuture zzb;

    private zzgdf(t0 t00) {
        t00.getClass();
        this.zza = t00;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    @a
    protected final String zza() {
        t0 t00 = this.zza;
        ScheduledFuture scheduledFuture0 = this.zzb;
        if(t00 != null) {
            String s = "inputFuture=[" + t00.toString() + "]";
            if(scheduledFuture0 != null) {
                long v = scheduledFuture0.getDelay(TimeUnit.MILLISECONDS);
                return v <= 0L ? s : s + ", remaining delay=[" + v + " ms]";
            }
            return s;
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        this.zzr(this.zza);
        ScheduledFuture scheduledFuture0 = this.zzb;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }

    static t0 zzf(t0 t00, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        t0 t01 = new zzgdf(t00);
        zzgdc zzgdc0 = new zzgdc(((zzgdf)t01));
        t01.zzb = scheduledExecutorService0.schedule(zzgdc0, v, timeUnit0);
        t00.addListener(zzgdc0, zzgbv.zza);
        return t01;
    }

    static void zzw(zzgdf zzgdf0, ScheduledFuture scheduledFuture0) {
        zzgdf0.zzb = null;
    }
}

