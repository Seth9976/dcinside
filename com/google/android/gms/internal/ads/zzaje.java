package com.google.android.gms.internal.ads;

public final class zzaje {
    public final zzajb zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaje(zzajb zzajb0, long[] arr_v, int[] arr_v1, int v, long[] arr_v2, int[] arr_v3, long v1) {
        boolean z = false;
        zzcw.zzd(arr_v1.length == arr_v2.length);
        zzcw.zzd(arr_v.length == arr_v2.length);
        if(arr_v3.length == arr_v2.length) {
            z = true;
        }
        zzcw.zzd(z);
        this.zza = zzajb0;
        this.zzc = arr_v;
        this.zzd = arr_v1;
        this.zze = v;
        this.zzf = arr_v2;
        this.zzg = arr_v3;
        this.zzh = v1;
        this.zzb = arr_v.length;
        if(arr_v3.length > 0) {
            arr_v3[arr_v3.length - 1] |= 0x20000000;
        }
    }

    public final int zza(long v) {
        for(int v1 = zzei.zzd(this.zzf, v, true, false); v1 >= 0; --v1) {
            if((this.zzg[v1] & 1) != 0) {
                return v1;
            }
        }
        return -1;
    }

    public final int zzb(long v) {
        for(int v1 = zzei.zza(this.zzf, v, true, false); v1 < this.zzf.length; ++v1) {
            if((this.zzg[v1] & 1) != 0) {
                return v1;
            }
        }
        return -1;
    }
}

