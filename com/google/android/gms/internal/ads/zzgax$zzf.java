package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

final class zzgax.zzf implements Runnable {
    final zzgax zza;
    final t0 zzb;

    zzgax.zzf(zzgax zzgax0, t0 t00) {
        this.zza = zzgax0;
        this.zzb = t00;
    }

    @Override
    public final void run() {
        if(this.zza.value == this) {
            Object object0 = zzgax.zze(this.zzb);
            if(zzgax.zzbg.zzf(this.zza, this, object0)) {
                zzgax.zzp(this.zza, false);
            }
        }
    }
}

