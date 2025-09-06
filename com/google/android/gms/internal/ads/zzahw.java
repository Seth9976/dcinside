package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzahw {
    public final zzadf zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    @Nullable
    public final long[] zzf;

    private zzahw(zzadf zzadf0, long v, long v1, @Nullable long[] arr_v, int v2, int v3) {
        this.zza = new zzadf(zzadf0);
        this.zzb = v;
        this.zzc = v1;
        this.zzf = arr_v;
        this.zzd = v2;
        this.zze = v3;
    }

    public final long zza() {
        return this.zzb == -1L || this.zzb == 0L ? 0x8000000000000001L : zzei.zzt(this.zzb * ((long)this.zza.zzg) - 1L, this.zza.zzd);
    }

    public static zzahw zzb(zzadf zzadf0, zzdy zzdy0) {
        long[] arr_v1;
        int v = zzdy0.zzg();
        int v1 = (v & 1) == 0 ? -1 : zzdy0.zzp();
        long v2 = (v & 2) == 0 ? -1L : zzdy0.zzu();
        if((v & 4) == 4) {
            long[] arr_v = new long[100];
            for(int v3 = 0; v3 < 100; ++v3) {
                arr_v[v3] = (long)zzdy0.zzm();
            }
            arr_v1 = arr_v;
        }
        else {
            arr_v1 = null;
        }
        if((v & 8) != 0) {
            zzdy0.zzM(4);
        }
        if(zzdy0.zzb() >= 24) {
            zzdy0.zzM(21);
            int v4 = zzdy0.zzo();
            return new zzahw(zzadf0, ((long)v1), v2, arr_v1, v4 >> 12, v4 & 0xFFF);
        }
        return new zzahw(zzadf0, ((long)v1), v2, arr_v1, -1, -1);
    }
}

