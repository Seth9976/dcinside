package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzlx implements Runnable {
    private final zzo zza;
    private final boolean zzb;
    private final zzon zzc;
    private final zzls zzd;

    zzlx(zzls zzls0, zzo zzo0, boolean z, zzon zzon0) {
        this.zza = zzo0;
        this.zzb = z;
        this.zzc = zzon0;
        this.zzd = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzd.zzb;
        if(zzgb0 == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zza(zzgb0, (this.zzb ? null : this.zzc), this.zza);
        this.zzd.zzar();
    }
}

