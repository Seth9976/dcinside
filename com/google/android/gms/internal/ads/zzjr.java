package com.google.android.gms.internal.ads;

public final class zzjr implements Runnable {
    public final zzkc zza;
    public final int zzb;
    public final boolean zzc;

    public zzjr(zzkc zzkc0, int v, boolean z) {
        this.zza = zzkc0;
        this.zzb = v;
        this.zzc = z;
    }

    @Override
    public final void run() {
        this.zza.zzf(this.zzb, this.zzc);
    }
}

