package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import o3.h;

public final class zzgma {
    public static final int zza;
    private static final zzglz zzb;
    private static final zzgma zzc;
    private final Map zzd;

    static {
        zzgma.zzb = new zzgly();
        zzgma.zzc = zzgma.zze();
    }

    public zzgma() {
        this.zzd = new HashMap();
    }

    public final zzgdx zza(zzgek zzgek0, @h Integer integer0) throws GeneralSecurityException {
        return this.zzd(zzgek0, integer0);
    }

    public static zzgma zzb() {
        return zzgma.zzc;
    }

    public final void zzc(zzglz zzglz0, Class class0) throws GeneralSecurityException {
        synchronized(this) {
            zzglz zzglz1 = (zzglz)this.zzd.get(class0);
            if(zzglz1 != null && !zzglz1.equals(zzglz0)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + class0.toString() + " already inserted");
            }
            this.zzd.put(class0, zzglz0);
        }
    }

    private final zzgdx zzd(zzgek zzgek0, @h Integer integer0) throws GeneralSecurityException {
        synchronized(this) {
            Class class0 = zzgek0.getClass();
            zzglz zzglz0 = (zzglz)this.zzd.get(class0);
            if(zzglz0 != null) {
                return zzglz0.zza(zzgek0, integer0);
            }
        }
        throw new GeneralSecurityException("Cannot create a new key for parameters " + zzgek0.toString() + ": no key creator for this class was registered.");
    }

    private static zzgma zze() {
        zzgma zzgma0 = new zzgma();
        try {
            zzgma0.zzc(zzgma.zzb, zzgll.class);
            return zzgma0;
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new IllegalStateException("unexpected error.", generalSecurityException0);
        }
    }
}

