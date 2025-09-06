package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzei;

public final class zza implements Runnable {
    public final AdLoader zza;
    public final zzei zzb;

    public zza(AdLoader adLoader0, zzei zzei0) {
        this.zza = adLoader0;
        this.zzb = zzei0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

