package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzcta implements zzcxh, zzdbg {
    private final Clock zza;
    private final zzctc zzb;
    private final zzfcj zzc;
    private final String zzd;

    zzcta(Clock clock0, zzctc zzctc0, zzfcj zzfcj0, String s) {
        this.zza = clock0;
        this.zzb = zzctc0;
        this.zzc = zzfcj0;
        this.zzd = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbg
    public final void zza() {
        long v = this.zza.elapsedRealtime();
        this.zzb.zze(this.zzd, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        long v = this.zza.elapsedRealtime();
        this.zzb.zzd(this.zzc.zzf, this.zzd, v);
    }
}

