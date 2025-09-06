package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb;
    final int zzc;
    final Bundle zzd;

    zzs(int v, int v1, Bundle bundle0) {
        this.zzb = new TaskCompletionSource();
        this.zza = v;
        this.zzc = v1;
        this.zzd = bundle0;
    }

    @Override
    public final String toString() {
        return "Request { what=" + this.zzc + " id=" + this.zza + " oneWay=" + this.zzb() + "}";
    }

    abstract void zza(Bundle arg1);

    abstract boolean zzb();

    final void zzc(zzt zzt0) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + this.toString() + " with " + zzt0.toString());
        }
        this.zzb.setException(zzt0);
    }

    final void zzd(Object object0) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + this.toString() + " with " + object0);
        }
        this.zzb.setResult(object0);
    }
}

