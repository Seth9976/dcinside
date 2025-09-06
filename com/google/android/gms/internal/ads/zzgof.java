package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgof extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgod zzc;

    zzgof(int v, int v1, zzgod zzgod0, zzgoe zzgoe0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = zzgod0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgof ? ((zzgof)object0).zza == this.zza && ((zzgof)object0).zzd() == this.zzd() && ((zzgof)object0).zzc == this.zzc : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzgof.class, this.zza, this.zzb, this.zzc});
    }

    @Override
    public final String toString() {
        return "AES-CMAC Parameters (variant: " + this.zzc + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzc != zzgod.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgod zzgod0 = this.zzc;
        if(zzgod0 == zzgod.zzd) {
            return this.zzb;
        }
        if(zzgod0 != zzgod.zza && zzgod0 != zzgod.zzb && zzgod0 != zzgod.zzc) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.zzb + 5;
    }

    public static zzgoc zze() {
        return new zzgoc(null);
    }

    public final zzgod zzf() {
        return this.zzc;
    }
}

