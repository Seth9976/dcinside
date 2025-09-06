package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o3.a;

final class zzgdc implements Runnable {
    @a
    zzgdf zza;

    zzgdc(zzgdf zzgdf0) {
        this.zza = zzgdf0;
    }

    @Override
    public final void run() {
        zzgdf zzgdf0 = this.zza;
        if(zzgdf0 != null) {
            t0 t00 = zzgdf0.zza;
            if(t00 != null) {
                this.zza = null;
                if(t00.isDone()) {
                    zzgdf0.zzs(t00);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture0 = zzgdf0.zzb;
                    zzgdf.zzw(zzgdf0, null);
                    String s = "Timed out";
                    if(scheduledFuture0 != null) {
                        try {
                            long v1 = Math.abs(scheduledFuture0.getDelay(TimeUnit.MILLISECONDS));
                            if(v1 > 10L) {
                                s = "Timed out (timeout delayed by " + v1 + " ms after scheduled time)";
                            }
                            goto label_21;
                        }
                        catch(Throwable throwable0) {
                        }
                        zzgdf0.zzd(new zzgdd("Timed out", null));
                        throw throwable0;
                    }
                label_21:
                    zzgdf0.zzd(new zzgdd(s + ": " + t00.toString(), null));
                }
                finally {
                    t00.cancel(true);
                }
            }
        }
    }
}

