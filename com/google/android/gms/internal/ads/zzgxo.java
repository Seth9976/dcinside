package com.google.android.gms.internal.ads;

final class zzgxo implements zzgxf {
    final int zza;
    final zzhau zzb;
    final boolean zzc;
    final boolean zzd;

    zzgxo(zzgxw zzgxw0, int v, zzhau zzhau0, boolean z, boolean z1) {
        this.zza = v;
        this.zzb = zzhau0;
        this.zzc = z;
        this.zzd = z1;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.zza - ((zzgxo)object0).zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxf
    public final int zza() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxf
    public final zzhau zzb() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxf
    public final zzhav zzc() {
        return this.zzb.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxf
    public final boolean zzd() {
        return this.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxf
    public final boolean zze() {
        return this.zzc;
    }
}

