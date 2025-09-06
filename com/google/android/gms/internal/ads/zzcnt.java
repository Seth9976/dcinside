package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcnt implements zzazd {
    private final ScheduledExecutorService zza;
    private final Clock zzb;
    @Nullable
    private ScheduledFuture zzc;
    private long zzd;
    private long zze;
    private Runnable zzf;
    private boolean zzg;

    public zzcnt(ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = null;
        this.zzg = false;
        this.zza = scheduledExecutorService0;
        this.zzb = clock0;
        zzv.zzb().zzc(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzazd
    public final void zza(boolean z) {
        if(z) {
            this.zzc();
            return;
        }
        this.zzb();
    }

    @VisibleForTesting
    final void zzb() {
        synchronized(this) {
            if(!this.zzg) {
                if(this.zzc == null || this.zzc.isDone()) {
                    this.zze = -1L;
                }
                else {
                    this.zzc.cancel(true);
                    this.zze = this.zzd - this.zzb.elapsedRealtime();
                }
                this.zzg = true;
            }
        }
    }

    @VisibleForTesting
    final void zzc() {
        synchronized(this) {
            if(this.zzg) {
                if(this.zze > 0L && (this.zzc != null && this.zzc.isCancelled())) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        }
    }

    public final void zzd(int v, Runnable runnable0) {
        synchronized(this) {
            this.zzf = runnable0;
            this.zzd = this.zzb.elapsedRealtime() + ((long)v);
            this.zzc = this.zza.schedule(runnable0, ((long)v), TimeUnit.MILLISECONDS);
        }
    }
}

