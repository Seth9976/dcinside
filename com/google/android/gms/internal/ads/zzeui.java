package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

public final class zzeui implements Runnable {
    public final Throwable zza;

    public zzeui(Throwable throwable0) {
        this.zza = throwable0;
    }

    @Override
    public final void run() {
        boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzkn)).booleanValue();
        Throwable throwable0 = this.zza;
        if(z) {
            zzv.zzp().zzx(throwable0, "TopicsSignalUnsampled.fetchTopicsSignal");
            return;
        }
        zzv.zzp().zzv(throwable0, "TopicsSignal.fetchTopicsSignal");
    }
}

