package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcwg extends zzdbj implements zzcvx {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwg(zzcwf zzcwf0, Set set0, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        super(set0);
        this.zzd = false;
        this.zzb = scheduledExecutorService0;
        super.zzo(zzcwf0, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zza(zze zze0) {
        this.zzq(new zzcvy(zze0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        this.zzq(new zzcvz());
    }

    @Override  // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(zzdgb zzdgb0) {
        if(this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture0 = this.zzc;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
        }
        this.zzq(new zzcwb(zzdgb0));
    }

    // 检测为 Lambda 实现
    final void zzd() [...]

    public final void zze() {
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.zzc;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
        }
    }

    public final void zzf() {
        int v = (int)(((Integer)zzbe.zzc().zza(zzbcl.zzkB)));
        zzcwa zzcwa0 = () -> synchronized(this) {
            zzo.zzg("Timeout waiting for show call succeed to be called.");
            this.zzc(new zzdgb("Timeout for show call succeed."));
            this.zzd = true;
        };
        this.zzc = this.zzb.schedule(zzcwa0, ((long)v), TimeUnit.MILLISECONDS);
    }
}

