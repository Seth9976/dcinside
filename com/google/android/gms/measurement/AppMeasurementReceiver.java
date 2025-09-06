package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzhj.zza;
import com.google.android.gms.measurement.internal.zzhj;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zza {
    private zzhj zza;

    @NonNull
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return this.goAsync();
    }

    @Override  // com.google.android.gms.measurement.internal.zzhj$zza
    @MainThread
    public final void doStartService(@NonNull Context context0, @NonNull Intent intent0) {
        WakefulBroadcastReceiver.startWakefulService(context0, intent0);
    }

    @Override  // android.content.BroadcastReceiver
    @MainThread
    public final void onReceive(@NonNull Context context0, @NonNull Intent intent0) {
        if(this.zza == null) {
            this.zza = new zzhj(this);
        }
        this.zza.zza(context0, intent0);
    }
}

