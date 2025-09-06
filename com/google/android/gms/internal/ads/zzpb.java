package com.google.android.gms.internal.ads;

public final class zzpb implements Runnable {
    public final zzpe zza;
    public final boolean zzb;

    public zzpb(zzpe zzpe0, boolean z) {
        this.zza = zzpe0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzt(this.zzb);
    }
}

