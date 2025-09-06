package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzadk {
    public final zzadn zza;
    public final zzadn zzb;

    public zzadk(zzadn zzadn0, zzadn zzadn1) {
        this.zza = zzadn0;
        this.zzb = zzadn1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzadk.class == class0 && this.zza.equals(((zzadk)object0).zza) && this.zzb.equals(((zzadk)object0).zzb);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() * 0x1F + this.zzb.hashCode();
    }

    @Override
    public final String toString() {
        String s = this.zza.toString();
        return this.zza.equals(this.zzb) ? "[" + s + "" + "]" : "[" + s + (", " + this.zzb.toString()) + "]";
    }
}

