package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

final class zzgdg extends zzgcp {
    final zzgdi zza;
    private final zzgbn zzb;

    zzgdg(zzgdi zzgdi0, zzgbn zzgbn0) {
        this.zza = zzgdi0;
        super();
        this.zzb = zzgbn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final Object zza() throws Exception {
        t0 t00 = this.zzb.zza();
        zzfun.zzd(t00, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return t00;
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
        this.zza.zzs(((t0)object0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgcp
    final boolean zzg() {
        return this.zza.isDone();
    }
}

