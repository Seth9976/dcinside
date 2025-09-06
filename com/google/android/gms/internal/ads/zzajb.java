package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

public final class zzajb {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzab zzg;
    public final int zzh;
    @Nullable
    public final long[] zzi;
    @Nullable
    public final long[] zzj;
    public final int zzk;
    @Nullable
    private final zzajc[] zzl;

    public zzajb(int v, int v1, long v2, long v3, long v4, long v5, zzab zzab0, int v6, @Nullable zzajc[] arr_zzajc, int v7, @Nullable long[] arr_v, @Nullable long[] arr_v1) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = v5;
        this.zzg = zzab0;
        this.zzh = v6;
        this.zzl = arr_zzajc;
        this.zzk = v7;
        this.zzi = arr_v;
        this.zzj = arr_v1;
    }

    public final zzajb zza(zzab zzab0) {
        return new zzajb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzab0, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    @Nullable
    public final zzajc zzb(int v) {
        return this.zzl[v];
    }
}

