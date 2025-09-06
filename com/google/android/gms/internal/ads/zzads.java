package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzads {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzads(int v, byte[] arr_b, int v1, int v2) {
        this.zza = v;
        this.zzb = arr_b;
        this.zzc = v1;
        this.zzd = v2;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzads.class == class0 && this.zza == ((zzads)object0).zza && this.zzc == ((zzads)object0).zzc && this.zzd == ((zzads)object0).zzd && Arrays.equals(this.zzb, ((zzads)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzb);
        return ((this.zza * 0x1F + v) * 0x1F + this.zzc) * 0x1F + this.zzd;
    }
}

