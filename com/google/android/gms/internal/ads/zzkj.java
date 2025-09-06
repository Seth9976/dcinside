package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzkj {
    public final long zza;
    public final float zzb;
    public final long zzc;

    zzkj(zzkh zzkh0, zzki zzki0) {
        this.zza = zzkh0.zza;
        this.zzb = zzkh0.zzb;
        this.zzc = zzkh0.zzc;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzkj ? this.zza == ((zzkj)object0).zza && this.zzb == ((zzkj)object0).zzb && this.zzc == ((zzkj)object0).zzc : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc});
    }

    public final zzkh zza() {
        return new zzkh(this, null);
    }
}

