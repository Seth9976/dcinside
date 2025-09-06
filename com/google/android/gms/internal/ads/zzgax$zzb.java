package com.google.android.gms.internal.ads;

import o3.a;

final class zzgax.zzb {
    @a
    static final zzgax.zzb zza;
    @a
    static final zzgax.zzb zzb;
    final boolean zzc;
    @a
    final Throwable zzd;

    static {
        if(zzgax.zzd) {
            zzgax.zzb.zzb = null;
            zzgax.zzb.zza = null;
            return;
        }
        zzgax.zzb.zzb = new zzgax.zzb(false, null);
        zzgax.zzb.zza = new zzgax.zzb(true, null);
    }

    zzgax.zzb(boolean z, @a Throwable throwable0) {
        this.zzc = z;
        this.zzd = throwable0;
    }
}

