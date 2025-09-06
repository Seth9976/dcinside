package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgfu extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzgfs zzd;

    zzgfu(int v, int v1, int v2, zzgfs zzgfs0, zzgft zzgft0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = 16;
        this.zzd = zzgfs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgfu ? ((zzgfu)object0).zza == this.zza && ((zzgfu)object0).zzb == this.zzb && ((zzgfu)object0).zzd == this.zzd : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzgfu.class, this.zza, this.zzb, 16, this.zzd});
    }

    @Override
    public final String toString() {
        return "AesEax Parameters (variant: " + this.zzd + ", " + this.zzb + "-byte IV, " + 16 + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzd != zzgfs.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public static zzgfr zzd() {
        return new zzgfr(null);
    }

    public final zzgfs zze() {
        return this.zzd;
    }
}

