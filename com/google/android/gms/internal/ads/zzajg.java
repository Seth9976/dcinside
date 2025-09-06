package com.google.android.gms.internal.ads;

import java.math.BigInteger;

final class zzajg implements zzadm {
    final zzaji zza;

    zzajg(zzaji zzaji0, zzajh zzajh0) {
        this.zza = zzaji0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza.zzd.zzf(this.zza.zzf);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long v) {
        long v1 = this.zza.zzd.zzg(v);
        long v2 = this.zza.zzb;
        long v3 = BigInteger.valueOf(v1).multiply(BigInteger.valueOf(this.zza.zzc - this.zza.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue();
        zzadn zzadn0 = new zzadn(v, Math.max(this.zza.zzb, Math.min(v2 + v3 - 30000L, this.zza.zzc - 1L)));
        return new zzadk(zzadn0, zzadn0);
    }

    @Override  // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}

