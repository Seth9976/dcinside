package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zznc;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements zznc {
    private zzmy zza;

    @Override  // android.app.Service
    @MainThread
    public final void onCreate() {
        super.onCreate();
        this.zza().zza();
    }

    @Override  // android.app.Service
    @MainThread
    public final void onDestroy() {
        this.zza().zzb();
        super.onDestroy();
    }

    @Override  // android.app.Service
    @MainThread
    public final void onRebind(@NonNull Intent intent0) {
        this.zza().zzb(intent0);
    }

    @Override  // android.app.job.JobService
    public final boolean onStartJob(@NonNull JobParameters jobParameters0) {
        return this.zza().zza(jobParameters0);
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(@NonNull JobParameters jobParameters0) {
        return false;
    }

    @Override  // android.app.Service
    @MainThread
    public final boolean onUnbind(@NonNull Intent intent0) {
        return this.zza().zzc(intent0);
    }

    private final zzmy zza() {
        if(this.zza == null) {
            this.zza = new zzmy(this);
        }
        return this.zza;
    }

    @Override  // com.google.android.gms.measurement.internal.zznc
    @TargetApi(24)
    public final void zza(@NonNull JobParameters jobParameters0, boolean z) {
        this.jobFinished(jobParameters0, false);
    }

    @Override  // com.google.android.gms.measurement.internal.zznc
    public final void zza(@NonNull Intent intent0) {
    }

    @Override  // com.google.android.gms.measurement.internal.zznc
    public final boolean zza(int v) {
        throw new UnsupportedOperationException();
    }
}

