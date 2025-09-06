package com.google.android.gms.internal.ads;

public final class zzuo implements Runnable {
    public final zzdb zza;
    public final zzur zzb;

    public zzuo(zzdb zzdb0, zzur zzur0) {
        this.zza = zzdb0;
        this.zzb = zzur0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

