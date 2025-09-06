package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public abstract class zzgmx {
    private final Class zza;
    private final Class zzb;

    zzgmx(Class class0, Class class1, zzgmw zzgmw0) {
        this.zza = class0;
        this.zzb = class1;
    }

    public abstract Object zza(zzgdx arg1) throws GeneralSecurityException;

    public static zzgmx zzb(zzgmv zzgmv0, Class class0, Class class1) {
        return new zzgmu(class0, class1, zzgmv0);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

