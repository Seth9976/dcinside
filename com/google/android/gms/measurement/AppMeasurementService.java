package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzmy;
import com.google.android.gms.measurement.internal.zznc;

public final class AppMeasurementService extends Service implements zznc {
    private zzmy zza;

    @Override  // android.app.Service
    @MainThread
    @Nullable
    public final IBinder onBind(@NonNull Intent intent0) {
        return this.zza().zza(intent0);
    }

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

    @Override  // android.app.Service
    @MainThread
    public final int onStartCommand(@NonNull Intent intent0, int v, int v1) {
        return this.zza().zza(intent0, v, v1);
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
    public final void zza(@NonNull JobParameters jobParameters0, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.measurement.internal.zznc
    public final void zza(@NonNull Intent intent0) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent0);
    }

    @Override  // com.google.android.gms.measurement.internal.zznc
    public final boolean zza(int v) {
        return this.stopSelfResult(v);
    }
}

