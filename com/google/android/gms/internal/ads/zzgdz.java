package com.google.android.gms.internal.ads;

public final class zzgdz {
    public static final zzgdz zza;
    public static final zzgdz zzb;
    public static final zzgdz zzc;
    private final String zzd;

    static {
        zzgdz.zza = new zzgdz("ENABLED");
        zzgdz.zzb = new zzgdz("DISABLED");
        zzgdz.zzc = new zzgdz("DESTROYED");
    }

    private zzgdz(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

