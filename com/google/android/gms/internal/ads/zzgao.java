package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import o3.a;

public final class zzgao implements Serializable {
    private final int[] zza;
    private final int zzb;

    private zzgao(int[] arr_v, int v, int v1) {
        this.zza = arr_v;
        this.zzb = v1;
    }

    @Override
    public final boolean equals(@a Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgao)) {
            return false;
        }
        if(this.zzb == ((zzgao)object0).zzb) {
            for(int v = 0; v < this.zzb; ++v) {
                if(this.zza(v) != ((zzgao)object0).zza(v)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v1 = 1;
        for(int v = 0; v < this.zzb; ++v) {
            v1 = v1 * 0x1F + this.zza[v];
        }
        return v1;
    }

    @Override
    public final String toString() {
        int v = this.zzb;
        if(v != 0) {
            StringBuilder stringBuilder0 = new StringBuilder(v * 5);
            stringBuilder0.append('[');
            stringBuilder0.append(this.zza[0]);
            for(int v1 = 1; v1 < this.zzb; ++v1) {
                stringBuilder0.append(", ");
                stringBuilder0.append(this.zza[v1]);
            }
            stringBuilder0.append(']');
            return stringBuilder0.toString();
        }
        return "[]";
    }

    public final int zza(int v) {
        zzfun.zza(v, this.zzb, "index");
        return this.zza[v];
    }

    public static zzgao zzb(int[] arr_v) {
        int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
        return new zzgao(arr_v1, 0, arr_v1.length);
    }
}

