package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzb {
    public static final zzb zza;
    public final int zzb;
    public final long zzc;
    public final int zzd;
    private static final zza zze;
    private final zza[] zzf;

    static {
        zzb.zza = new zzb(null, new zza[0], 0L, 0x8000000000000001L, 0);
        zzb.zze = new zza(0L).zzb(0);
    }

    private zzb(@Nullable Object object0, zza[] arr_zza, long v, long v1, int v2) {
        this.zzc = 0L;
        this.zzb = 0;
        this.zzf = arr_zza;
        this.zzd = 0;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzb.class == class0 && Arrays.equals(this.zzf, ((zzb)object0).zzf);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + 961;
    }

    @Override
    public final String toString() {
        return "AdPlaybackState(adsId=" + null + ", adResumePositionUs=0, adGroups=[" + "])";
    }

    public final zza zza(@IntRange(from = 0L) int v) {
        return v >= 0 ? this.zzf[v] : zzb.zze;
    }

    public final boolean zzb(int v) {
        this.zza(-1);
        return false;
    }
}

