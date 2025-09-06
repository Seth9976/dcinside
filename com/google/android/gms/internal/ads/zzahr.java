package com.google.android.gms.internal.ads;

import android.util.Pair;

final class zzahr implements zzahu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahr(long[] arr_v, long[] arr_v1, long v) {
        this.zza = arr_v;
        this.zzb = arr_v1;
        if(v == 0x8000000000000001L) {
            v = zzei.zzs(arr_v1[arr_v1.length - 1]);
        }
        this.zzc = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzc;
    }

    public static zzahr zzb(long v, zzagm zzagm0, long v1) {
        int v2 = zzagm0.zzd.length + 1;
        long[] arr_v = new long[v2];
        long[] arr_v1 = new long[v2];
        arr_v[0] = v;
        long v3 = 0L;
        arr_v1[0] = 0L;
        for(int v4 = 1; v4 <= zzagm0.zzd.length; ++v4) {
            v += (long)(zzagm0.zzb + zzagm0.zzd[v4 - 1]);
            v3 += (long)(zzagm0.zzc + zzagm0.zze[v4 - 1]);
            arr_v[v4] = v;
            arr_v1[v4] = v3;
        }
        return new zzahr(arr_v, arr_v1, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final int zzc() {
        return 0x80000001;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zzd() {
        return -1L;
    }

    @Override  // com.google.android.gms.internal.ads.zzahu
    public final long zze(long v) {
        return zzei.zzs(((long)(((Long)zzahr.zzf(v, this.zza, this.zzb).second))));
    }

    private static Pair zzf(long v, long[] arr_v, long[] arr_v1) {
        int v1 = zzei.zzd(arr_v, v, true, true);
        long v2 = arr_v[v1];
        long v3 = arr_v1[v1];
        if(v1 + 1 == arr_v.length) {
            return Pair.create(v2, v3);
        }
        long v4 = arr_v[v1 + 1];
        long v5 = arr_v1[v1 + 1];
        return v4 == v2 ? Pair.create(v, ((long)(((long)(0.0 * ((double)(v5 - v3)))) + v3))) : Pair.create(v, ((long)(((long)((((double)v) - ((double)v2)) / ((double)(v4 - v2)) * ((double)(v5 - v3)))) + v3)));
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        Pair pair0 = zzahr.zzf(zzei.zzv(Math.max(0L, Math.min(v, this.zzc))), this.zzb, this.zza);
        zzadn zzadn0 = new zzadn(zzei.zzs(((long)(((Long)pair0.first)))), ((long)(((Long)pair0.second))));
        return new zzadk(zzadn0, zzadn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

