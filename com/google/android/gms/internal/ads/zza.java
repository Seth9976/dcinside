package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class zza {
    public final long zza;
    public final int zzb;
    @Deprecated
    public final Uri[] zzc;
    public final zzar[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;
    public static final int zzi;

    static {
    }

    public zza(long v) {
        this(0L, -1, -1, new int[0], new zzar[0], new long[0], 0L, false);
    }

    private zza(long v, int v1, int v2, int[] arr_v, zzar[] arr_zzar, long[] arr_v1, long v3, boolean z) {
        zzcw.zzd(arr_v.length == arr_zzar.length);
        Uri uri0;
        this.zza = 0L;
        this.zzb = v1;
        this.zze = arr_v;
        this.zzd = arr_zzar;
        this.zzf = arr_v1;
        this.zzg = 0L;
        this.zzh = false;
        this.zzc = new Uri[arr_zzar.length];
        for(int v4 = 0; true; ++v4) {
            Uri[] arr_uri = this.zzc;
            if(v4 >= arr_uri.length) {
                break;
            }
            zzar zzar0 = arr_zzar[v4];
            if(zzar0 == null) {
                uri0 = null;
            }
            else {
                zzar0.zzb.getClass();
                uri0 = zzar0.zzb.zza;
            }
            arr_uri[v4] = uri0;
        }
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zza.class == class0 && this.zzb == ((zza)object0).zzb && Arrays.equals(this.zzd, ((zza)object0).zzd) && Arrays.equals(this.zze, ((zza)object0).zze) && Arrays.equals(this.zzf, ((zza)object0).zzf);
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        return (0xFFF1E87F + 961 * Arrays.hashCode(this.zzd) + 0x1F * Arrays.hashCode(this.zze) + Arrays.hashCode(this.zzf) + 0x1B4D89F * this.zzb) * 961;
    }

    public final int zza(@IntRange(from = -1L) int v) {
        int v1 = v + 1;
    alab1:
        while(true) {
            int[] arr_v = this.zze;
            if(v1 >= arr_v.length) {
                break;
            }
            switch(arr_v[v1]) {
                case 0: 
                case 1: {
                    break alab1;
                }
                default: {
                    ++v1;
                }
            }
        }
        return v1;
    }

    @CheckResult
    public final zza zzb(int v) {
        int v1 = Math.max(0, this.zze.length);
        int[] arr_v = Arrays.copyOf(this.zze, v1);
        Arrays.fill(arr_v, this.zze.length, v1, 0);
        int v2 = Math.max(0, this.zzf.length);
        long[] arr_v1 = Arrays.copyOf(this.zzf, v2);
        Arrays.fill(arr_v1, this.zzf.length, v2, 0x8000000000000001L);
        return new zza(0L, 0, -1, arr_v, ((zzar[])Arrays.copyOf(this.zzd, 0)), arr_v1, 0L, false);
    }
}

