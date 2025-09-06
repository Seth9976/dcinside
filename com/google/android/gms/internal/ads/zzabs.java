package com.google.android.gms.internal.ads;

public final class zzabs implements zzadm {
    private final zzabv zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzabs(zzabv zzabv0, long v, long v1, long v2, long v3, long v4, long v5) {
        this.zza = zzabv0;
        this.zzb = v;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long v) {
        return this.zza.zza(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        zzadn zzadn0 = new zzadn(v, zzabu.zzf(this.zza.zza(v), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzadk(zzadn0, zzadn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

