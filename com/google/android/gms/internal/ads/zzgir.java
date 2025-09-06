package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgir extends zzgeu {
    private final zzgiq zza;

    private zzgir(zzgiq zzgiq0) {
        this.zza = zzgiq0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgir ? ((zzgir)object0).zza == this.zza : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzgir.class, this.zza});
    }

    @Override
    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != zzgiq.zzc;
    }

    public final zzgiq zzb() {
        return this.zza;
    }

    public static zzgir zzc(zzgiq zzgiq0) {
        return new zzgir(zzgiq0);
    }
}

