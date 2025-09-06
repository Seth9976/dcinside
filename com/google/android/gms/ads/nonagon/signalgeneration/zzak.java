package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbyy;
import java.util.concurrent.Callable;

public final class zzak implements Callable {
    public final zzau zza;
    public final zzbyy zzb;
    public final int zzc;
    public final Bundle zzd;

    public zzak(zzau zzau0, zzbyy zzbyy0, int v, Bundle bundle0) {
        this.zza = zzau0;
        this.zzb = zzbyy0;
        this.zzc = v;
        this.zzd = bundle0;
    }

    @Override
    public final Object call() {
        return this.zza.zzq(this.zzb, this.zzc, this.zzd);
    }
}

