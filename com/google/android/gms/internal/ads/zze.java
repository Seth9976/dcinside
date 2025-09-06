package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zze {
    public static final zze zza;
    @Nullable
    private zzc zzb;

    static {
        zze.zza = new zze(0, 0, 1, 1, 0, null);
    }

    zze(int v, int v1, int v2, int v3, int v4, zzd zzd0) {
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(zze.class == class0) {
                zze zze0 = (zze)object0;
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return 0x1D02666F;
    }

    public final zzc zza() {
        if(this.zzb == null) {
            this.zzb = new zzc(this, null);
        }
        return this.zzb;
    }
}

