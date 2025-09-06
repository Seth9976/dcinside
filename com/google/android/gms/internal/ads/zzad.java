package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j..util.Objects;

public final class zzad {
    @Nullable
    public final String zza;
    public final String zzb;

    static {
    }

    public zzad(@Nullable String s, String s1) {
        this.zza = zzei.zzE(s);
        this.zzb = s1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzad.class == class0 && Objects.equals(this.zza, ((zzad)object0).zza) && Objects.equals(this.zzb, ((zzad)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.zzb.hashCode();
        return this.zza == null ? v * 0x1F : v * 0x1F + this.zza.hashCode();
    }
}

