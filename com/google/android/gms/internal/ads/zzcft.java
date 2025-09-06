package com.google.android.gms.internal.ads;

public final class zzcft implements Runnable {
    public final zzcfw zza;
    public final String zzb;

    public zzcft(zzcfw zzcfw0, String s) {
        this.zza = zzcfw0;
        this.zzb = s;
    }

    @Override
    public final void run() {
        this.zza.zzaV(this.zzb);
    }
}

