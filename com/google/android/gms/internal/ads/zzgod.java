package com.google.android.gms.internal.ads;

public final class zzgod {
    public static final zzgod zza;
    public static final zzgod zzb;
    public static final zzgod zzc;
    public static final zzgod zzd;
    private final String zze;

    static {
        zzgod.zza = new zzgod("TINK");
        zzgod.zzb = new zzgod("CRUNCHY");
        zzgod.zzc = new zzgod("LEGACY");
        zzgod.zzd = new zzgod("NO_PREFIX");
    }

    private zzgod(String s) {
        this.zze = s;
    }

    @Override
    public final String toString() {
        return this.zze;
    }
}

