package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;

final class zzccv implements Runnable {
    final zzccw zza;

    zzccv(zzccw zzccw0) {
        this.zza = zzccw0;
        super();
    }

    @Override
    public final void run() {
        zzv.zzz().zzc(this.zza);
    }
}

