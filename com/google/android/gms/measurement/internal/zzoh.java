package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

final class zzoh implements Runnable {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;
    private final zzof zzd;

    zzoh(zzof zzof0, String s, String s1, Bundle bundle0) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = bundle0;
        this.zzd = zzof0;
        super();
    }

    @Override
    public final void run() {
        zzos zzos0 = this.zzd.zza.zzq();
        long v = this.zzd.zza.zzb().currentTimeMillis();
        zzbf zzbf0 = (zzbf)Preconditions.checkNotNull(zzos0.zza(this.zza, this.zzb, this.zzc, "auto", v, false, true));
        this.zzd.zza.zza(zzbf0, this.zza);
    }
}

