package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzgcs;

public final class zzal implements Runnable {
    public final zzau zza;
    public final zzgcs zzb;

    public zzal(zzau zzau0, zzgcs zzgcs0) {
        this.zza = zzau0;
        this.zzb = zzgcs0;
    }

    @Override
    public final void run() {
        this.zza.zzb(this.zzb);
    }
}

