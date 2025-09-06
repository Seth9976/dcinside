package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public abstract class zzgmt {
    private final Class zza;
    private final Class zzb;

    zzgmt(Class class0, Class class1, zzgms zzgms0) {
        this.zza = class0;
        this.zzb = class1;
    }

    public abstract zzgnm zza(zzgek arg1) throws GeneralSecurityException;

    public static zzgmt zzb(zzgmr zzgmr0, Class class0, Class class1) {
        return new zzgmq(class0, class1, zzgmr0);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

