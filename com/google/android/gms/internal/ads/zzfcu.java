package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

final class zzfcu implements zzgcd {
    final zzfcv zza;
    final int zzb;

    zzfcu(zzfcv zzfcv0, int v) {
        this.zzb = v;
        this.zza = zzfcv0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzv.zzp().zzw(throwable0, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zza.zzb(((String)object0), this.zzb);
    }
}

