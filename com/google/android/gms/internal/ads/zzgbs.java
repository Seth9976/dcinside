package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzgbs extends zzgbt {
    final zzgbu zza;
    private final Callable zzc;

    zzgbs(zzgbu zzgbu0, Callable callable0, Executor executor0) {
        this.zza = zzgbu0;
        super(zzgbu0, executor0);
        this.zzc = callable0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final String zzb() {
        return this.zzc.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzgbt
    final void zzc(Object object0) {
        this.zza.zzc(object0);
    }
}

