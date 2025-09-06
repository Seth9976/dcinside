package com.google.android.gms.internal.ads;

final class zzqb {
    public final zzab zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzce zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;

    public zzqb(zzab zzab0, int v, int v1, int v2, int v3, int v4, int v5, int v6, zzce zzce0, boolean z, boolean z1, boolean z2) {
        this.zza = zzab0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = v3;
        this.zzf = v4;
        this.zzg = v5;
        this.zzh = v6;
        this.zzi = zzce0;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
    }

    public final zzpg zza() {
        return this.zzc == 1 ? new zzpg(this.zzg, this.zze, this.zzf, false, true, this.zzh) : new zzpg(this.zzg, this.zze, this.zzf, false, false, this.zzh);
    }
}

