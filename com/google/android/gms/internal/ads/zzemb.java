package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class zzemb implements zzetr {
    private final t0 zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzemb(t0 t00, Executor executor0, ScheduledExecutorService scheduledExecutorService0) {
        this.zza = t00;
        this.zzb = executor0;
        this.zzc = scheduledExecutorService0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 6;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzelz zzelz0 = new zzelz();
        t0 t00 = zzgch.zzn(this.zza, zzelz0, this.zzb);
        zzbcc zzbcc0 = zzbcl.zzmp;
        if(((int)(((Integer)zzbe.zzc().zza(zzbcc0)))) > 0) {
            t00 = zzgch.zzo(t00, ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcc0)))))), TimeUnit.MILLISECONDS, this.zzc);
        }
        zzema zzema0 = new zzema();
        return zzgch.zzf(t00, Throwable.class, zzema0, this.zzb);
    }
}

