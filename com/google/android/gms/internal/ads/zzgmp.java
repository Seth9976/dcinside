package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public abstract class zzgmp {
    private final zzgvo zza;
    private final Class zzb;

    zzgmp(zzgvo zzgvo0, Class class0, zzgmo zzgmo0) {
        this.zza = zzgvo0;
        this.zzb = class0;
    }

    public abstract zzgek zza(zzgnm arg1) throws GeneralSecurityException;

    public static zzgmp zzb(zzgmn zzgmn0, zzgvo zzgvo0, Class class0) {
        return new zzgmm(zzgvo0, class0, zzgmn0);
    }

    public final zzgvo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

