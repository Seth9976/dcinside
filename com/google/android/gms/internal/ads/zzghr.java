package com.google.android.gms.internal.ads;

import j..util.Objects;

public final class zzghr extends zzgeu {
    private final zzghp zza;
    private final String zzb;
    private final zzgho zzc;
    private final zzgeu zzd;

    zzghr(zzghp zzghp0, String s, zzgho zzgho0, zzgeu zzgeu0, zzghq zzghq0) {
        this.zza = zzghp0;
        this.zzb = s;
        this.zzc = zzgho0;
        this.zzd = zzgeu0;
    }

    // 去混淆评级： 中等(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof zzghr ? ((zzghr)object0).zzc.equals(this.zzc) && ((zzghr)object0).zzd.equals(this.zzd) && ((zzghr)object0).zzb.equals(this.zzb) && ((zzghr)object0).zza.equals(this.zza) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{zzghr.class, this.zzb, this.zzc, this.zzd, this.zza});
    }

    @Override
    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + this.zzc + ", dekParametersForNewKeys: " + this.zzd + ", variant: " + this.zza + ")";
    }

    @Override  // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zza != zzghp.zzb;
    }

    public final zzgeu zzb() {
        return this.zzd;
    }

    public final zzghp zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}

