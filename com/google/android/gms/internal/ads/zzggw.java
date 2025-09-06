package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzggw extends zzgeu {
    private final zzggv zza;

    private zzggw(zzggv zzggv0) {
        this.zza = zzggv0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzggw ? ((zzggw)object0).zza == this.zza : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzggw.class, this.zza});
    }

    @Override
    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.zza.toString() + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != zzggv.zzc;
    }

    public final zzggv zzb() {
        return this.zza;
    }

    public static zzggw zzc(zzggv zzggv0) {
        return new zzggw(zzggv0);
    }
}

