package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzggf extends zzgeu {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzggd zzd;

    zzggf(int v, int v1, int v2, zzggd zzggd0, zzgge zzgge0) {
        this.zza = v;
        this.zzb = 12;
        this.zzc = 16;
        this.zzd = zzggd0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzggf ? ((zzggf)object0).zza == this.zza && ((zzggf)object0).zzd == this.zzd : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzggf.class, this.zza, 12, 16, this.zzd});
    }

    @Override
    public final String toString() {
        return "AesGcm Parameters (variant: " + this.zzd + ", " + 12 + "-byte IV, " + 16 + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzd != zzggd.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public static zzggc zzc() {
        return new zzggc(null);
    }

    public final zzggd zzd() {
        return this.zzd;
    }
}

