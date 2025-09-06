package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

final class zzgbc extends zzgbe {
    zzgbc(t0 t00, zzgbo zzgbo0) {
        super(t00, zzgbo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgbe
    final Object zze(Object object0, Object object1) throws Exception {
        t0 t00 = ((zzgbo)object0).zza(object1);
        zzfun.zzd(t00, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ((zzgbo)object0));
        return t00;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbe
    final void zzf(Object object0) {
        this.zzs(((t0)object0));
    }
}

