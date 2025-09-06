package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzega {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrc zzc;
    private final zzegq zzd;
    private final zzfiv zze;
    private final zzgdb zzf;
    private final AtomicBoolean zzg;
    private zzegb zzh;
    private zzfca zzi;

    zzega(Executor executor0, ScheduledExecutorService scheduledExecutorService0, zzcrc zzcrc0, zzegq zzegq0, zzfiv zzfiv0) {
        this.zzf = zzgdb.zze();
        this.zzg = new AtomicBoolean();
        this.zza = executor0;
        this.zzb = scheduledExecutorService0;
        this.zzc = zzcrc0;
        this.zzd = zzegq0;
        this.zze = zzfiv0;
    }

    public final t0 zzb(zzfca zzfca0) {
        synchronized(this) {
            if(!this.zzg.getAndSet(true)) {
                if(zzfca0.zzb.zza.isEmpty()) {
                    zzegu zzegu0 = new zzegu(3, zzegx.zzc(zzfca0));
                    this.zzf.zzd(zzegu0);
                }
                else {
                    this.zzi = zzfca0;
                    this.zzh = new zzegb(zzfca0, this.zzd, this.zzf);
                    this.zzd.zzk(zzfca0.zzb.zza);
                    for(zzfbo zzfbo0 = this.zzh.zza(); zzfbo0 != null; zzfbo0 = this.zzh.zza()) {
                        this.zze(zzfbo0);
                    }
                }
            }
            return this.zzf;
        }
    }

    private final t0 zzd(zzfbo zzfbo0) {
        synchronized(this) {
            for(Object object0: zzfbo0.zza) {
                zzecw zzecw0 = this.zzc.zza(zzfbo0.zzb, ((String)object0));
                if(zzecw0 != null && zzecw0.zzb(this.zzi, zzfbo0)) {
                    return zzgch.zzo(zzecw0.zza(this.zzi, zzfbo0), ((long)zzfbo0.zzR), TimeUnit.MILLISECONDS, this.zzb);
                }
                if(false) {
                    break;
                }
            }
            return zzgch.zzg(new zzdvy(3));
        }
    }

    private final void zze(@Nullable zzfbo zzfbo0) {
        t0 t00 = this.zzd(zzfbo0);
        this.zzd.zzf(this.zzi, zzfbo0, t00, this.zze);
        zzgch.zzr(t00, new zzefz(this, zzfbo0), this.zza);
    }
}

