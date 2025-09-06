package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zzbx {
    public final int zza;
    private final zzbr zzb;
    private final boolean zzc;
    private final int[] zzd;
    private final boolean[] zze;

    static {
    }

    public zzbx(zzbr zzbr0, boolean z, int[] arr_v, boolean[] arr_z) {
        this.zza = zzbr0.zza;
        boolean z1 = true;
        zzcw.zzd(zzbr0.zza == arr_v.length && zzbr0.zza == arr_z.length);
        this.zzb = zzbr0;
        if(!z || zzbr0.zza <= 1) {
            z1 = false;
        }
        this.zzc = z1;
        this.zzd = (int[])arr_v.clone();
        this.zze = (boolean[])arr_z.clone();
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzbx.class == class0 && this.zzc == ((zzbx)object0).zzc && this.zzb.equals(((zzbx)object0).zzb) && Arrays.equals(this.zzd, ((zzbx)object0).zzd) && Arrays.equals(this.zze, ((zzbx)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzd);
        int v1 = Arrays.hashCode(this.zze);
        return ((this.zzb.hashCode() * 0x1F + this.zzc) * 0x1F + v) * 0x1F + v1;
    }

    public final int zza() {
        return this.zzb.zzc;
    }

    public final zzab zzb(int v) {
        return this.zzb.zzb(v);
    }

    public final boolean zzc() {
        boolean[] arr_z = this.zze;
        for(int v = 0; v < arr_z.length; ++v) {
            if(arr_z[v]) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzd(int v) {
        return this.zze[v];
    }
}

