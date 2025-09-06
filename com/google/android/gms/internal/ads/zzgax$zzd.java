package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import o3.a;

final class zzgax.zzd {
    @a
    zzgax.zzd next;
    static final zzgax.zzd zza;
    @a
    final Runnable zzb;
    @a
    final Executor zzc;

    static {
        zzgax.zzd.zza = new zzgax.zzd();
    }

    zzgax.zzd() {
        this.zzb = null;
        this.zzc = null;
    }

    zzgax.zzd(Runnable runnable0, Executor executor0) {
        this.zzb = runnable0;
        this.zzc = executor0;
    }
}

