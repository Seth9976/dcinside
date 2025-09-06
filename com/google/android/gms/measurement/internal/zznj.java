package com.google.android.gms.measurement.internal;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

final class zznj {
    final zznb zza;

    zznj(zznb zznb0) {
        this.zza = zznb0;
        super();
    }

    @WorkerThread
    final void zza() {
        this.zza.zzt();
        if(this.zza.zzk().zza(this.zza.zzb().currentTimeMillis())) {
            this.zza.zzk().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo0);
            if(activityManager$RunningAppProcessInfo0.importance == 100) {
                this.zza.zzj().zzp().zza("Detected application was in foreground");
                this.zzb(this.zza.zzb().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    final void zza(long v, boolean z) {
        this.zza.zzt();
        this.zza.zzab();
        if(this.zza.zzk().zza(v)) {
            this.zza.zzk().zzg.zza(true);
            this.zza.zzg().zzag();
        }
        this.zza.zzk().zzk.zza(v);
        if(this.zza.zzk().zzg.zza()) {
            this.zzb(v, z);
        }
    }

    @VisibleForTesting
    @WorkerThread
    private final void zzb(long v, boolean z) {
        this.zza.zzt();
        if(!this.zza.zzu.zzac()) {
            return;
        }
        this.zza.zzk().zzk.zza(v);
        long v1 = this.zza.zzb().elapsedRealtime();
        this.zza.zzj().zzp().zza("Session started, time", v1);
        this.zza.zzm().zza("auto", "_sid", ((long)(v / 1000L)), v);
        this.zza.zzk().zzl.zza(v / 1000L);
        this.zza.zzk().zzg.zza(false);
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_sid", v / 1000L);
        this.zza.zzm().zza("auto", "_s", v, bundle0);
        String s = this.zza.zzk().zzq.zza();
        if(!TextUtils.isEmpty(s)) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("_ffr", s);
            this.zza.zzm().zza("auto", "_ssr", v, bundle1);
        }
    }
}

