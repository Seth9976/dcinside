package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public abstract class zzgld {
    private final zzgvo zza;
    private final Class zzb;

    zzgld(zzgvo zzgvo0, Class class0, zzglc zzglc0) {
        this.zza = zzgvo0;
        this.zzb = class0;
    }

    public abstract zzgdx zza(zzgnm arg1, @h zzgeo arg2) throws GeneralSecurityException;

    public static zzgld zzb(zzglb zzglb0, zzgvo zzgvo0, Class class0) {
        return new zzgla(zzgvo0, class0, zzglb0);
    }

    public final zzgvo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

