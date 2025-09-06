package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzwo {
    public final long zza;
    public final long zzb;

    public zzwo(long v, long v1) {
        this.zza = v;
        this.zzb = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzwo ? this.zza == ((zzwo)object0).zza && this.zzb == ((zzwo)object0).zzb : false;
    }

    @Override
    public final int hashCode() {
        return ((int)this.zza) * 0x1F + ((int)this.zzb);
    }
}

