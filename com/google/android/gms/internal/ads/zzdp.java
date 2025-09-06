package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class zzdp {
    private int zza;
    private long[] zzb;

    public zzdp() {
        throw null;
    }

    public zzdp(int v) {
        this.zzb = new long[v];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int v) {
        if(v < 0 || v >= this.zza) {
            throw new IndexOutOfBoundsException("Invalid index " + v + ", size is " + this.zza);
        }
        return this.zzb[v];
    }

    public final void zzc(long v) {
        int v1 = this.zza;
        long[] arr_v = this.zzb;
        if(v1 == arr_v.length) {
            this.zzb = Arrays.copyOf(arr_v, v1 + v1);
        }
        int v2 = this.zza;
        this.zza = v2 + 1;
        this.zzb[v2] = v;
    }

    public final void zzd(long[] arr_v) {
        int v = this.zza + arr_v.length;
        long[] arr_v1 = this.zzb;
        if(v > arr_v1.length) {
            this.zzb = Arrays.copyOf(arr_v1, Math.max(arr_v1.length + arr_v1.length, v));
        }
        System.arraycopy(arr_v, 0, this.zzb, this.zza, arr_v.length);
        this.zza = v;
    }
}

