package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import j..util.Objects;
import java.util.Arrays;

public final class zzxx {
    private final int[] zza;
    private final zzwj[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwj zze;

    @VisibleForTesting
    zzxx(String[] arr_s, int[] arr_v, zzwj[] arr_zzwj, int[] arr_v1, int[][][] arr3_v, zzwj zzwj0) {
        this.zza = arr_v;
        this.zzb = arr_zzwj;
        this.zzd = arr3_v;
        this.zzc = arr_v1;
        this.zze = zzwj0;
    }

    public final int zza(int v, int v1, boolean z) {
        int v2 = this.zzb[v].zzb(v1).zza;
        int[] arr_v = new int[v2];
        int v3 = 0;
        int v5 = 0;
        for(int v4 = 0; v4 < v2; ++v4) {
            if((this.zzd[v][v1][v4] & 7) == 4) {
                arr_v[v5] = v4;
                ++v5;
            }
        }
        int[] arr_v1 = Arrays.copyOf(arr_v, v5);
        String s = null;
        int v6 = 0;
        int v8 = 16;
        for(int v7 = 0; v3 < arr_v1.length; ++v7) {
            int v9 = arr_v1[v3];
            String s1 = this.zzb[v].zzb(v1).zzb(v9).zzo;
            if(v7 == 0) {
                s = s1;
            }
            else {
                v6 |= !Objects.equals(s, s1);
            }
            v8 = Math.min(v8, this.zzd[v][v1][v3] & 24);
            ++v3;
        }
        return v6 == 0 ? v8 : Math.min(v8, this.zzc[v]);
    }

    public final int zzb(int v, int v1, int v2) {
        return this.zzd[v][v1][v2];
    }

    public final int zzc(int v) {
        return this.zza[v];
    }

    public final zzwj zzd(int v) {
        return this.zzb[v];
    }

    public final zzwj zze() {
        return this.zze;
    }
}

