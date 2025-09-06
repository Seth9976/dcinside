package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcuo implements zzayk, zzcvt, zzcwj, zzdan, zzdcx {
    private final zzcwl zza;
    private final zzfbo zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzgdb zze;
    private ScheduledFuture zzf;
    private final AtomicBoolean zzg;
    @Nullable
    private final String zzh;

    zzcuo(zzcwl zzcwl0, zzfbo zzfbo0, ScheduledExecutorService scheduledExecutorService0, Executor executor0, @Nullable String s) {
        this.zze = zzgdb.zze();
        this.zzg = new AtomicBoolean();
        this.zza = zzcwl0;
        this.zzb = zzfbo0;
        this.zzc = scheduledExecutorService0;
        this.zzd = executor0;
        this.zzh = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        if(this.zzb.zze == 3 || this.zzb.zzY != 0 && this.zzb.zzY != 1 || ((Boolean)zzbe.zzc().zza(zzbcl.zzlp)).booleanValue() && this.zzm()) {
            return;
        }
        this.zza.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlp)).booleanValue() && this.zzm() && zzayj0.zzj && this.zzg.compareAndSet(false, true) && this.zzb.zze != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvw0, String s, String s1) {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
    }

    // 检测为 Lambda 实现
    final void zzh() [...]

    @Override  // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdan
    public final void zzj() {
        synchronized(this) {
            if(this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.zzf;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            this.zze.zzc(Boolean.TRUE);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcx
    public final void zzk() {
        if(this.zzb.zze != 3 && ((Boolean)zzbe.zzc().zza(zzbcl.zzbE)).booleanValue()) {
            zzfbo zzfbo0 = this.zzb;
            if(zzfbo0.zzY == 2) {
                if(zzfbo0.zzq == 0) {
                    this.zza.zza();
                    return;
                }
                zzcun zzcun0 = new zzcun(this);
                zzgch.zzr(this.zze, zzcun0, this.zzd);
                zzcum zzcum0 = () -> synchronized(this) {
                    if(this.zze.isDone()) {
                        return;
                    }
                    this.zze.zzc(Boolean.TRUE);
                };
                this.zzf = this.zzc.schedule(zzcum0, ((long)this.zzb.zzq), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdcx
    public final void zzl() {
    }

    private final boolean zzm() {
        return this.zzh.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(com.google.android.gms.ads.internal.client.zze zze0) {
        synchronized(this) {
            if(this.zze.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture0 = this.zzf;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(true);
            }
            this.zze.zzd(new Exception());
        }
    }
}

