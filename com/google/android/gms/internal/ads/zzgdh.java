package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class zzgdh extends zzgcp {
    final zzgdi zza;
    private final Callable zzb;

    zzgdh(zzgdi zzgdi0, Callable callable0) {
        this.zza = zzgdi0;
        super();
        callable0.getClass();
        this.zzb = callable0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final String zzb() {
        return this.zzb.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final void zzd(Throwable throwable0) {
        this.zza.zzd(throwable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final void zze(Object object0) {
        this.zza.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zza.isDone();
    }
}

