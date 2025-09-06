package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import o3.h;

public abstract class zzglh {
    private final Class zza;
    private final Class zzb;

    zzglh(Class class0, Class class1, zzglg zzglg0) {
        this.zza = class0;
        this.zzb = class1;
    }

    public abstract zzgnm zza(zzgdx arg1, @h zzgeo arg2) throws GeneralSecurityException;

    public static zzglh zzb(zzglf zzglf0, Class class0, Class class1) {
        return new zzgle(class0, class1, zzglf0);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

