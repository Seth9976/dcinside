package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzajd {
    public zzail zza;
    public long zzb;
    public long zzc;
    public int zzd;
    public int zze;
    public long[] zzf;
    public int[] zzg;
    public int[] zzh;
    public long[] zzi;
    public boolean[] zzj;
    public boolean zzk;
    public boolean[] zzl;
    @Nullable
    public zzajc zzm;
    public final zzdy zzn;
    public boolean zzo;
    public long zzp;
    public boolean zzq;

    public zzajd() {
        this.zzf = new long[0];
        this.zzg = new int[0];
        this.zzh = new int[0];
        this.zzi = new long[0];
        this.zzj = new boolean[0];
        this.zzl = new boolean[0];
        this.zzn = new zzdy();
    }

    public final void zza(int v) {
        this.zzn.zzI(v);
        this.zzk = true;
        this.zzo = true;
    }

    // 去混淆评级： 低(20)
    public final boolean zzb(int v) {
        return this.zzk && this.zzl[v];
    }
}

