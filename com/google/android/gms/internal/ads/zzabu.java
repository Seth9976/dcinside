package com.google.android.gms.internal.ads;

public final class zzabu {
    private final long zza;
    private final long zzb;
    private final long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    protected zzabu(long v, long v1, long v2, long v3, long v4, long v5, long v6) {
        this.zza = v;
        this.zzb = v1;
        this.zzd = 0L;
        this.zze = v3;
        this.zzf = v4;
        this.zzg = v5;
        this.zzc = v6;
        this.zzh = zzabu.zzf(v1, 0L, v3, v4, v5, v6);
    }

    protected static long zzf(long v, long v1, long v2, long v3, long v4, long v5) {
        if(v3 + 1L < v4 && v1 + 1L < v2) {
            long v6 = (long)(((float)(v - v1)) * (((float)(v4 - v3)) / ((float)(v2 - v1))));
            return Math.max(v3, Math.min(v3 + v6 - v5 - v6 / 20L, v4 - 1L));
        }
        return v3;
    }

    static void zzg(zzabu zzabu0, long v, long v1) {
        zzabu0.zze = v;
        zzabu0.zzg = v1;
        zzabu0.zzi();
    }

    static void zzh(zzabu zzabu0, long v, long v1) {
        zzabu0.zzd = v;
        zzabu0.zzf = v1;
        zzabu0.zzi();
    }

    private final void zzi() {
        this.zzh = zzabu.zzf(this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzc);
    }
}

