package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final class zzmx implements Runnable {
    private zzmy zza;
    private zzgo zzb;
    private JobParameters zzc;

    public zzmx(zzmy zzmy0, zzgo zzgo0, JobParameters jobParameters0) {
        this.zza = zzmy0;
        this.zzb = zzgo0;
        this.zzc = jobParameters0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}

