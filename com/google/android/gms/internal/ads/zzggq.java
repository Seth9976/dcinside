package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzggq extends zzgeu {
    private final int zza;
    private final zzggo zzb;

    zzggq(int v, zzggo zzggo0, zzggp zzggp0) {
        this.zza = v;
        this.zzb = zzggo0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzggq ? ((zzggq)object0).zza == this.zza && ((zzggq)object0).zzb == this.zzb : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzggq.class, this.zza, this.zzb});
    }

    @Override
    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + this.zzb + ", " + this.zza + "-byte key)";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzb != zzggo.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public static zzggn zzc() {
        return new zzggn(null);
    }

    public final zzggo zzd() {
        return this.zzb;
    }
}

