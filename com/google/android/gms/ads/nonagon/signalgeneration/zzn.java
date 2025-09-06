package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.AdRequest;
import java.util.concurrent.Callable;

public final class zzn implements Callable {
    public final zzo zza;
    public final AdRequest zzb;
    public final zzp zzc;

    public zzn(zzo zzo0, AdRequest adRequest0, zzp zzp0) {
        this.zza = zzo0;
        this.zzb = adRequest0;
        this.zzc = zzp0;
    }

    @Override
    public final Object call() {
        return this.zza.zza(this.zzb, this.zzc);
    }
}

