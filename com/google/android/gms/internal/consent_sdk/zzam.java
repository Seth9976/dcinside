package com.google.android.gms.internal.consent_sdk;

final class zzam implements zzaw {
    private final zzag zza;
    private final zzdq zzb;
    private final zzdq zzc;
    private final zzdq zzd;
    private final zzdq zze;
    private final zzdq zzf;

    zzam(zzag zzag0, zzbp zzbp0, zzal zzal0) {
        this.zza = zzag0;
        zzdq zzdq0 = zzdm.zzb(new zzbx(zzag0.zzb));
        this.zzb = zzdq0;
        zzdn zzdn0 = zzdo.zzb(zzbp0);
        this.zzc = zzdn0;
        zzdl zzdl0 = new zzdl();
        this.zzd = zzdl0;
        zzcb zzcb0 = new zzcb(zzag0.zzb, zzdq0, zzar.zza, zzat.zza, zzag0.zzh, zzag0.zzi, zzdl0, zzag0.zzc);
        this.zze = zzcb0;
        zzbv zzbv0 = new zzbv(zzdq0, zzar.zza, zzcb0);
        this.zzf = zzbv0;
        zzdl.zzb(zzdl0, zzdm.zzb(new zzbc(zzag0.zzb, zzag0.zzd, zzdq0, zzag0.zzc, zzdn0, zzbv0)));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzaw
    public final zzbb zza() {
        return (zzbb)this.zzd.zza();
    }
}

