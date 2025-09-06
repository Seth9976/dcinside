package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbyy;

public final class zza implements Runnable {
    public final zzb zza;
    public final String zzb;
    public final zzau zzc;
    public final zzbyy zzd;

    public zza(zzb zzb0, String s, zzau zzau0, zzbyy zzbyy0) {
        this.zza = zzb0;
        this.zzb = s;
        this.zzc = zzau0;
        this.zzd = zzbyy0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb, this.zzc, this.zzd);
    }
}

