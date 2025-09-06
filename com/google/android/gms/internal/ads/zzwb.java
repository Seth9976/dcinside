package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

public final class zzwb {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwb(int v) {
        this(0, new Random());
    }

    private zzwb(int v, Random random0) {
        this(new int[0], random0);
    }

    private zzwb(int[] arr_v, Random random0) {
        this.zzb = arr_v;
        this.zza = random0;
        this.zzc = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            this.zzc[arr_v[v]] = v;
        }
    }

    public final int zza() {
        return this.zzb.length <= 0 ? -1 : this.zzb[0];
    }

    public final int zzb() {
        return this.zzb.length <= 0 ? -1 : this.zzb[this.zzb.length - 1];
    }

    public final int zzc() {
        return this.zzb.length;
    }

    public final int zzd(int v) {
        int v1 = this.zzc[v] + 1;
        return v1 >= this.zzb.length ? -1 : this.zzb[v1];
    }

    public final int zze(int v) {
        int v1 = this.zzc[v] - 1;
        return v1 < 0 ? -1 : this.zzb[v1];
    }

    public final zzwb zzf() {
        return new zzwb(0, new Random(this.zza.nextLong()));
    }

    public final zzwb zzg(int v, int v1) {
        int[] arr_v = new int[v1];
        int[] arr_v1 = new int[v1];
        for(int v3 = 0; v3 < v1; ++v3) {
            arr_v[v3] = this.zza.nextInt(this.zzb.length + 1);
            int v4 = this.zza.nextInt(v3 + 1);
            arr_v1[v3] = arr_v1[v4];
            arr_v1[v4] = v3;
        }
        Arrays.sort(arr_v);
        int[] arr_v2 = new int[this.zzb.length + v1];
        int v5 = 0;
        int v6 = 0;
        for(int v2 = 0; true; ++v2) {
            int[] arr_v3 = this.zzb;
            if(v2 >= arr_v3.length + v1) {
                break;
            }
            if(v5 >= v1 || v6 != arr_v[v5]) {
                int v7 = arr_v3[v6];
                arr_v2[v2] = v7;
                if(v7 >= 0) {
                    arr_v2[v2] = v7 + v1;
                }
                ++v6;
            }
            else {
                arr_v2[v2] = arr_v1[v5];
                ++v5;
            }
        }
        return new zzwb(arr_v2, new Random(this.zza.nextLong()));
    }

    public final zzwb zzh(int v, int v1) {
        int[] arr_v = new int[this.zzb.length - v1];
        int v3 = 0;
        for(int v2 = 0; true; ++v2) {
            int[] arr_v1 = this.zzb;
            if(v2 >= arr_v1.length) {
                break;
            }
            int v4 = arr_v1[v2];
            if(v4 < 0 || v4 >= v1) {
                if(v4 >= 0) {
                    v4 -= v1;
                }
                arr_v[v2 - v3] = v4;
            }
            else {
                ++v3;
            }
        }
        return new zzwb(arr_v, new Random(this.zza.nextLong()));
    }
}

