package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzdrw;

public final class zze implements Runnable {
    public final zzdrw zza;
    public final Long zzb;

    public zze(zzf zzf0, zzdrw zzdrw0, Long long0) {
        this.zza = zzdrw0;
        this.zzb = long0;
    }

    @Override
    public final void run() {
        zzf.zze(this.zza, this.zzb);
    }
}

