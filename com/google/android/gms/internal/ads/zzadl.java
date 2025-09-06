package com.google.android.gms.internal.ads;

public class zzadl implements zzadm {
    private final long zza;
    private final zzadk zzb;

    public zzadl(long v, long v1) {
        this.zza = v;
        zzadn zzadn0 = Long.compare(v1, 0L) == 0 ? zzadn.zza : new zzadn(0L, v1);
        this.zzb = new zzadk(zzadn0, zzadn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return false;
    }
}

