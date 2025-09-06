package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzgow extends zzgoz {
    private final int zza;
    private final int zzb;
    private final zzgou zzc;
    private final zzgot zzd;

    zzgow(int v, int v1, zzgou zzgou0, zzgot zzgot0, zzgov zzgov0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = zzgou0;
        this.zzd = zzgot0;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzgow ? ((zzgow)object0).zza == this.zza && ((zzgow)object0).zzd() == this.zzd() && ((zzgow)object0).zzc == this.zzc && ((zzgow)object0).zzd == this.zzd : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzgow.class, this.zza, this.zzb, this.zzc, this.zzd});
    }

    @Override
    public final String toString() {
        return "HMAC Parameters (variant: " + this.zzc + ", hashType: " + this.zzd + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzc != zzgou.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgou zzgou0 = this.zzc;
        if(zzgou0 == zzgou.zzd) {
            return this.zzb;
        }
        if(zzgou0 != zzgou.zza && zzgou0 != zzgou.zzb && zzgou0 != zzgou.zzc) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.zzb + 5;
    }

    public static zzgos zze() {
        return new zzgos(null);
    }

    public final zzgot zzf() {
        return this.zzd;
    }

    public final zzgou zzg() {
        return this.zzc;
    }
}

