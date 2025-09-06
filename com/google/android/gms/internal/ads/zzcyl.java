package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class zzcyl extends zzdbj {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    @Nullable
    private ScheduledFuture zzi;
    @Nullable
    private ScheduledFuture zzj;

    public zzcyl(ScheduledExecutorService scheduledExecutorService0, Clock clock0) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService0;
        this.zzc = clock0;
    }

    public final void zza() {
        synchronized(this) {
            this.zzh = false;
            this.zzf(0L);
        }
    }

    public final void zzb() {
        synchronized(this) {
            if(!this.zzh) {
                if(this.zzi == null || this.zzi.isCancelled()) {
                    this.zzf = -1L;
                }
                else {
                    this.zzi.cancel(false);
                    this.zzf = this.zzd - this.zzc.elapsedRealtime();
                }
                if(this.zzj == null || this.zzj.isCancelled()) {
                    this.zzg = -1L;
                }
                else {
                    this.zzj.cancel(false);
                    this.zzg = this.zze - this.zzc.elapsedRealtime();
                }
                this.zzh = true;
            }
        }
    }

    public final void zzc() {
        synchronized(this) {
            if(this.zzh) {
                if(this.zzf > 0L && (this.zzi != null && this.zzi.isCancelled())) {
                    this.zzf(this.zzf);
                }
                if(this.zzg > 0L && (this.zzj != null && this.zzj.isCancelled())) {
                    this.zzg(this.zzg);
                }
                this.zzh = false;
            }
        }
    }

    public final void zzd(int v) {
        synchronized(this) {
            if(v > 0) {
                long v2 = TimeUnit.SECONDS.toMillis(((long)v));
                if(this.zzh) {
                    long v3 = this.zzf;
                    if(v3 <= 0L || v2 >= v3) {
                        v2 = v3;
                    }
                    this.zzf = v2;
                    return;
                }
                long v4 = this.zzc.elapsedRealtime();
                if(v4 > this.zzd || this.zzd - v4 > v2) {
                    this.zzf(v2);
                }
            }
        }
    }

    public final void zze(int v) {
        synchronized(this) {
            if(v > 0) {
                long v2 = TimeUnit.SECONDS.toMillis(((long)v));
                if(this.zzh) {
                    long v3 = this.zzg;
                    if(v3 <= 0L || v2 >= v3) {
                        v2 = v3;
                    }
                    this.zzg = v2;
                    return;
                }
                long v4 = this.zzc.elapsedRealtime();
                if(v4 > this.zze || this.zze - v4 > v2) {
                    this.zzg(v2);
                }
            }
        }
    }

    private final void zzf(long v) {
        synchronized(this) {
            if(this.zzi != null && !this.zzi.isDone()) {
                this.zzi.cancel(false);
            }
            this.zzd = this.zzc.elapsedRealtime() + v;
            zzcyi zzcyi0 = new zzcyi(this, null);
            this.zzi = this.zzb.schedule(zzcyi0, v, TimeUnit.MILLISECONDS);
        }
    }

    private final void zzg(long v) {
        synchronized(this) {
            if(this.zzj != null && !this.zzj.isDone()) {
                this.zzj.cancel(false);
            }
            this.zze = this.zzc.elapsedRealtime() + v;
            zzcyj zzcyj0 = new zzcyj(this, null);
            this.zzj = this.zzb.schedule(zzcyj0, v, TimeUnit.MILLISECONDS);
        }
    }
}

