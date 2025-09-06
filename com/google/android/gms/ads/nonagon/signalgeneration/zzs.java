package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdrq;
import java.util.ArrayDeque;

public final class zzs implements Runnable {
    public final zzv zza;
    public final zzdrq zzb;
    public final ArrayDeque zzc;
    public final ArrayDeque zzd;

    public zzs(zzv zzv0, zzdrq zzdrq0, ArrayDeque arrayDeque0, ArrayDeque arrayDeque1) {
        this.zza = zzv0;
        this.zzb = zzdrq0;
        this.zzc = arrayDeque0;
        this.zzd = arrayDeque1;
    }

    @Override
    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd);
    }
}

