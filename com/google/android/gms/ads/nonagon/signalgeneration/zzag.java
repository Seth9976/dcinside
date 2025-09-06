package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdnl;

public final class zzag implements Runnable {
    public final zzau zza;
    public final zzdnl[] zzb;

    public zzag(zzau zzau0, zzdnl[] arr_zzdnl) {
        this.zza = zzau0;
        this.zzb = arr_zzdnl;
    }

    @Override
    public final void run() {
        this.zza.zzJ(this.zzb);
    }
}

