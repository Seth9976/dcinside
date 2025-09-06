package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

final class zzgau extends zzgaw {
    zzgau(t0 t00, Class class0, zzgbo zzgbo0) {
        super(t00, class0, zzgbo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgaw
    final Object zze(Object object0, Throwable throwable0) throws Exception {
        t0 t00 = ((zzgbo)object0).zza(throwable0);
        zzfun.zzd(t00, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ((zzgbo)object0));
        return t00;
    }

    @Override  // com.google.android.gms.internal.ads.zzgaw
    final void zzf(Object object0) {
        this.zzs(((t0)object0));
    }
}

