package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;

final class zzbrv implements Runnable {
    final AdOverlayInfoParcel zza;
    final zzbrw zzb;

    zzbrv(zzbrw zzbrw0, AdOverlayInfoParcel adOverlayInfoParcel0) {
        this.zza = adOverlayInfoParcel0;
        this.zzb = zzbrw0;
        super();
    }

    @Override
    public final void run() {
        zzn.zza(this.zzb.zza, this.zza, true, null);
    }
}

