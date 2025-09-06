package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;

public final class zzz implements Runnable {
    public final zzdsb zza;
    public final String zzb;
    public final Pair[] zzc;

    public zzz(zzdsb zzdsb0, zzdrq zzdrq0, String s, Pair[] arr_pair) {
        this.zza = zzdsb0;
        this.zzb = s;
        this.zzc = arr_pair;
    }

    @Override
    public final void run() {
        zzaa.zze(this.zza, null, this.zzb, this.zzc);
    }
}

