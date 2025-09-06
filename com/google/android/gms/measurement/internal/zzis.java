package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzis implements Runnable {
    private final zzo zza;
    private final zzic zzb;

    zzis(zzic zzic0, zzo zzo0) {
        this.zza = zzo0;
        this.zzb = zzic0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr();
        zznv zznv0 = this.zzb.zza;
        zznv0.zzl().zzt();
        zznv0.zzs();
        Preconditions.checkNotEmpty(this.zza.zza);
        zznv0.zzg(this.zza);
        zznv0.zzf(this.zza);
    }
}

