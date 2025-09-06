package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzbg {
    private final zzx zza;

    static {
        new zzbf().zze();
    }

    zzbg(zzx zzx0, zzbj zzbj0) {
        this.zza = zzx0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzbg ? this.zza.equals(((zzbg)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }
}

