package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzlm implements Runnable {
    private final Bundle zza;
    private final zzlk zzb;
    private final zzlk zzc;
    private final long zzd;
    private final zzlj zze;

    zzlm(zzlj zzlj0, Bundle bundle0, zzlk zzlk0, zzlk zzlk1, long v) {
        this.zza = bundle0;
        this.zzb = zzlk0;
        this.zzc = zzlk1;
        this.zzd = v;
        this.zze = zzlj0;
        super();
    }

    @Override
    public final void run() {
        zzlj.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}

