package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

public final class zzbbb implements Runnable {
    public final zzcab zza;
    public final Future zzb;

    public zzbbb(zzcab zzcab0, Future future0) {
        this.zza = zzcab0;
        this.zzb = future0;
    }

    @Override
    public final void run() {
        if(this.zza.isCancelled()) {
            this.zzb.cancel(true);
        }
    }
}

