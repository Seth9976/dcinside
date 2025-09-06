package com.google.android.gms.internal.ads;

public final class zzpl extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzab zzc;

    public zzpl(int v, zzab zzab0, boolean z) {
        super("AudioTrack write failed: " + v);
        this.zzb = z;
        this.zza = v;
        this.zzc = zzab0;
    }
}

