package com.google.android.gms.internal.ads;

final class zzaff extends zzada {
    final zzadm zza;
    final zzafg zzb;

    zzaff(zzafg zzafg0, zzadm zzadm0, zzadm zzadm1) {
        this.zza = zzadm1;
        this.zzb = zzafg0;
        super(zzadm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzada
    public final zzadk zzg(long v) {
        zzadk zzadk0 = this.zza.zzg(v);
        long v1 = this.zzb.zzb;
        zzadn zzadn0 = new zzadn(zzadk0.zza.zzb, zzadk0.zza.zzc + v1);
        long v2 = this.zzb.zzb;
        return new zzadk(zzadn0, new zzadn(zzadk0.zzb.zzb, zzadk0.zzb.zzc + v2));
    }
}

