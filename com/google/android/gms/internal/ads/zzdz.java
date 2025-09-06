package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzdz {
    public static final zzdz zza;
    private final int zzb;
    private final int zzc;

    static {
        zzdz.zza = new zzdz(-1, -1);
        new zzdz(0, 0);
    }

    public zzdz(int v, int v1) {
        zzcw.zzd((v == -1 || v >= 0) && (v1 == -1 || v1 >= 0));
        this.zzb = v;
        this.zzc = v1;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(object0 == null) {
            return false;
        }
        return this == object0 ? true : object0 instanceof zzdz && this.zzb == ((zzdz)object0).zzb && this.zzc == ((zzdz)object0).zzc;
    }

    @Override
    public final int hashCode() {
        return (this.zzb >>> 16 | this.zzb << 16) ^ this.zzc;
    }

    @Override
    public final String toString() {
        return this.zzb + "x" + this.zzc;
    }

    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }
}

