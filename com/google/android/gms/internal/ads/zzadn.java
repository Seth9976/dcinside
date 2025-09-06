package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzadn {
    public static final zzadn zza;
    public final long zzb;
    public final long zzc;

    static {
        zzadn.zza = new zzadn(0L, 0L);
    }

    public zzadn(long v, long v1) {
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzadn.class == class0 && this.zzb == ((zzadn)object0).zzb && this.zzc == ((zzadn)object0).zzc;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zzb) * 0x1F + ((int)this.zzc);
    }

    @Override
    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}

