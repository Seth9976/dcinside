package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzpi extends Exception {
    public final int zza;
    public final boolean zzb;

    public zzpi(int v, int v1, int v2, int v3, zzab zzab0, boolean z, @Nullable Exception exception0) {
        super("AudioTrack init failed " + v + " Config(" + v1 + ", " + v2 + ", " + v3 + ") " + zzab0 + (z ? " (recoverable)" : ""), exception0);
        this.zza = v;
        this.zzb = z;
    }
}

