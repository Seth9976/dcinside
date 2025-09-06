package com.google.android.gms.internal.ads;

import android.os.IInterface;

public final class zzftk implements Runnable {
    public final zzftl zza;

    public zzftk(zzftl zzftl0) {
        this.zza = zzftl0;
    }

    @Override
    public final void run() {
        this.zza.zza.zzc.zzc("unlinkToDeath", new Object[0]);
        IInterface iInterface0 = this.zza.zza.zzj;
        iInterface0.getClass();
        iInterface0.asBinder().unlinkToDeath(this.zza.zza.zzh, 0);
        this.zza.zza.zzj = null;
        zzftn.zzf(this.zza.zza, false);
    }
}

