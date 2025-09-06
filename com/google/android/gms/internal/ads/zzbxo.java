package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

final class zzbxo implements zzgcd {
    final t0 zza;

    zzbxo(zzbxp zzbxp0, t0 t00) {
        this.zza = t00;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        zzbxp.zzc.remove(this.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        Void void0 = (Void)object0;
        zzbxp.zzc.remove(this.zza);
    }
}

