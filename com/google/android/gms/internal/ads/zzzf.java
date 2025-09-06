package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class zzzf implements zzzg {
    final Executor zza;
    final zzdb zzb;

    zzzf(Executor executor0, zzdb zzdb0) {
        this.zza = executor0;
        this.zzb = zzdb0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.zza.execute(runnable0);
    }

    @Override  // com.google.android.gms.internal.ads.zzzg
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}

