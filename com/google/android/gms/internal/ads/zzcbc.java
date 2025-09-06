package com.google.android.gms.internal.ads;

public final class zzcbc implements Runnable {
    public final zzcbg zza;
    public final boolean zzb;

    public zzcbc(zzcbg zzcbg0, boolean z) {
        this.zza = zzcbg0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzq(this.zzb);
    }
}

