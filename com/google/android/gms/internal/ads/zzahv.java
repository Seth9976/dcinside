package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;

final class zzahv implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahv(long[] arr_v, long[] arr_v1, long v, long v1, int v2) {
        this.zza = arr_v;
        this.zzb = arr_v1;
        this.zzc = v;
        this.zzd = v1;
        this.zze = v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    @Nullable
    public static zzahv zzb(long v, long v1, zzadf zzadf0, zzdy zzdy0) {
        int v10;
        zzdy0.zzM(10);
        int v2 = zzdy0.zzg();
        if(v2 > 0) {
            long v3 = zzei.zzu(v2, ((long)(zzadf0.zzd < 32000 ? 0x240 : 0x480)) * 1000000L, zzadf0.zzd, RoundingMode.DOWN);
            int v4 = zzdy0.zzq();
            int v5 = zzdy0.zzq();
            int v6 = zzdy0.zzq();
            zzdy0.zzM(2);
            long v7 = v1 + ((long)zzadf0.zzc);
            long[] arr_v = new long[v4];
            long[] arr_v1 = new long[v4];
            long v8 = v1;
            for(int v9 = 0; v9 < v4; ++v9) {
                arr_v[v9] = ((long)v9) * v3 / ((long)v4);
                arr_v1[v9] = Math.max(v8, v7);
                switch(v6) {
                    case 1: {
                        v10 = zzdy0.zzm();
                        break;
                    }
                    case 2: {
                        v10 = zzdy0.zzq();
                        break;
                    }
                    case 3: {
                        v10 = zzdy0.zzo();
                        break;
                    }
                    case 4: {
                        v10 = zzdy0.zzp();
                        break;
                    }
                    default: {
                        return null;
                    }
                }
                v8 += ((long)v10) * ((long)v5);
            }
            if(v != -1L && v != v8) {
                zzdo.zzf("VbriSeeker", "VBRI data size mismatch: " + v + ", " + v8);
            }
            return new zzahv(arr_v, arr_v1, v3, v8, zzadf0.zzf);
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return this.zze;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zze(long v) {
        return this.zza[zzei.zzd(this.zzb, v, true, true)];
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        int v1 = zzei.zzd(this.zza, v, true, true);
        zzadn zzadn0 = new zzadn(this.zza[v1], this.zzb[v1]);
        if(zzadn0.zzb < v) {
            return v1 == this.zza.length - 1 ? new zzadk(zzadn0, zzadn0) : new zzadk(zzadn0, new zzadn(this.zza[v1 + 1], this.zzb[v1 + 1]));
        }
        return new zzadk(zzadn0, zzadn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

