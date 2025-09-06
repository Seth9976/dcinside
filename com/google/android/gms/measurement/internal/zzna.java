package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final class zzna implements Runnable {
    private zzmy zza;
    private int zzb;
    private zzgo zzc;
    private Intent zzd;

    public zzna(zzmy zzmy0, int v, zzgo zzgo0, Intent intent0) {
        this.zza = zzmy0;
        this.zzb = v;
        this.zzc = zzgo0;
        this.zzd = intent0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }
}

