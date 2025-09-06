package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzaps {
    @Nullable
    public final Object zza;
    @Nullable
    public final zzaov zzb;
    @Nullable
    public final zzapv zzc;
    public boolean zzd;

    private zzaps(zzapv zzapv0) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapv0;
    }

    private zzaps(@Nullable Object object0, @Nullable zzaov zzaov0) {
        this.zzd = false;
        this.zza = object0;
        this.zzb = zzaov0;
        this.zzc = null;
    }

    public static zzaps zza(zzapv zzapv0) {
        return new zzaps(zzapv0);
    }

    public static zzaps zzb(@Nullable Object object0, @Nullable zzaov zzaov0) {
        return new zzaps(object0, zzaov0);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}

