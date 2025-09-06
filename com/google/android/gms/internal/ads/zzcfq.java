package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

public final class zzcfq implements Runnable {
    public final zzcfw zza;
    public final String zzb;
    public final ValueCallback zzc;

    public zzcfq(zzcfw zzcfw0, String s, ValueCallback valueCallback0) {
        this.zza = zzcfw0;
        this.zzb = s;
        this.zzc = valueCallback0;
    }

    @Override
    public final void run() {
        this.zza.zzaU(this.zzb, this.zzc);
    }
}

