package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzmy {
    private final Context zza;

    public zzmy(Context context0) {
        Preconditions.checkNotNull(context0);
        this.zza = context0;
    }

    private final void zza(Runnable runnable0) {
        zznv zznv0 = zznv.zza(this.zza);
        zznv0.zzl().zzb(new zzmz(this, zznv0, runnable0));
    }

    @MainThread
    public final int zza(Intent intent0, int v, int v1) {
        zzgo zzgo0 = zzhy.zza(this.zza, null, null).zzj();
        if(intent0 == null) {
            zzgo0.zzu().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String s = intent0.getAction();
        zzgo0.zzp().zza("Local AppMeasurementService called. startId, action", v1, s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zza(() -> if(((zznc)this.zza).zza(v1)) {
                zzgo0.zzp().zza("Local AppMeasurementService processed last upload request. StartId", v1);
                this.zzc().zzp().zza("Completed wakeful intent.");
                ((zznc)this.zza).zza(intent0);
            });
        }
        return 2;
    }

    @MainThread
    public final IBinder zza(Intent intent0) {
        if(intent0 == null) {
            this.zzc().zzg().zza("onBind called with null intent");
            return null;
        }
        String s = intent0.getAction();
        if("com.google.android.gms.measurement.START".equals(s)) {
            return new zzic(zznv.zza(this.zza));
        }
        this.zzc().zzu().zza("onBind received unknown action", s);
        return null;
    }

    @MainThread
    public final void zza() {
        zzhy.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is starting up");
    }

    // 检测为 Lambda 实现
    final void zza(int v, zzgo zzgo0, Intent intent0) [...]

    // 检测为 Lambda 实现
    final void zza(zzgo zzgo0, JobParameters jobParameters0) [...]

    @TargetApi(24)
    @MainThread
    public final boolean zza(JobParameters jobParameters0) {
        zzgo zzgo0 = zzhy.zza(this.zza, null, null).zzj();
        String s = jobParameters0.getExtras().getString("action");
        zzgo0.zzp().zza("Local AppMeasurementJobService called. action", s);
        if("com.google.android.gms.measurement.UPLOAD".equals(s)) {
            this.zza(() -> {
                zzgo0.zzp().zza("AppMeasurementJobService processed last upload request.");
                ((zznc)this.zza).zza(jobParameters0, false);
            });
        }
        return true;
    }

    @MainThread
    public final void zzb() {
        zzhy.zza(this.zza, null, null).zzj().zzp().zza("Local AppMeasurementService is shutting down");
    }

    @MainThread
    public final void zzb(Intent intent0) {
        if(intent0 == null) {
            this.zzc().zzg().zza("onRebind called with null intent");
            return;
        }
        String s = intent0.getAction();
        this.zzc().zzp().zza("onRebind called. action", s);
    }

    private final zzgo zzc() {
        return zzhy.zza(this.zza, null, null).zzj();
    }

    @MainThread
    public final boolean zzc(Intent intent0) {
        if(intent0 == null) {
            this.zzc().zzg().zza("onUnbind called with null intent");
            return true;
        }
        String s = intent0.getAction();
        this.zzc().zzp().zza("onUnbind called for intent. action", s);
        return true;
    }
}

