package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

final class zzaoi implements zzadm {
    private final zzaof zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoi(zzaof zzaof0, int v, long v1, long v2) {
        this.zza = zzaof0;
        this.zzb = v;
        this.zzc = v1;
        long v3 = (v2 - v1) / ((long)zzaof0.zzd);
        this.zzd = v3;
        this.zze = this.zzb(v3);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zze;
    }

    private final long zzb(long v) {
        return zzei.zzu(v * ((long)this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        long v1 = Math.max(0L, Math.min(((long)this.zza.zzc) * v / (((long)this.zzb) * 1000000L), this.zzd - 1L));
        long v2 = this.zzb(v1);
        zzadn zzadn0 = new zzadn(v2, this.zzc + ((long)this.zza.zzd) * v1);
        return v2 >= v || v1 == this.zzd - 1L ? new zzadk(zzadn0, zzadn0) : new zzadk(zzadn0, new zzadn(this.zzb(v1 + 1L), this.zzc + (v1 + 1L) * ((long)this.zza.zzd)));
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

