package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzor {
    public static final zzor zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    static {
        zzor.zza = new zzop().zzd();
    }

    zzor(zzop zzop0, zzoq zzoq0) {
        this.zzb = zzop0.zza;
        this.zzc = zzop0.zzb;
        this.zzd = zzop0.zzc;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzor.class == class0 && this.zzb == ((zzor)object0).zzb && this.zzc == ((zzor)object0).zzc && this.zzd == ((zzor)object0).zzd;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return (this.zzb << 2) + (this.zzc + this.zzc) + this.zzd;
    }
}

