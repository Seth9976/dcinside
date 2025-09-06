package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;

final class zzes extends zzce {
    final PreloadCallback zza;
    final zzex zzb;

    zzes(zzex zzex0, PreloadCallback preloadCallback0) {
        this.zza = preloadCallback0;
        this.zzb = zzex0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzft0) {
        zzex.zzk(this.zzb, zzft0).ifPresent(new zzeq(this.zza));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzft0) {
        zzex.zzk(this.zzb, zzft0).ifPresent(new zzer(this.zza));
    }
}

