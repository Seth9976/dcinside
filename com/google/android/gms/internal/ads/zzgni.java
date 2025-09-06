package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgni implements zzgnm {
    private final zzgvo zza;
    private final zzgsp zzb;

    private zzgni(zzgsp zzgsp0, zzgvo zzgvo0) {
        this.zzb = zzgsp0;
        this.zza = zzgvo0;
    }

    public static zzgni zza(zzgsp zzgsp0) throws GeneralSecurityException {
        return new zzgni(zzgsp0, zzgnu.zza(zzgsp0.zzi()));
    }

    public static zzgni zzb(zzgsp zzgsp0) {
        return new zzgni(zzgsp0, zzgnu.zzb(zzgsp0.zzi()));
    }

    public final zzgsp zzc() {
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzgnm
    public final zzgvo zzd() {
        return this.zza;
    }
}

