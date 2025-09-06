package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzvi {
    public final int zza;
    public final boolean zzb;

    public zzvi(int v, boolean z) {
        this.zza = v;
        this.zzb = z;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzvi.class == class0 && this.zza == ((zzvi)object0).zza && this.zzb == ((zzvi)object0).zzb;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza * 0x1F + this.zzb;
    }
}

