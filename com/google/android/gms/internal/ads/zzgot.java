package com.google.android.gms.internal.ads;

public final class zzgot {
    public static final zzgot zza;
    public static final zzgot zzb;
    public static final zzgot zzc;
    public static final zzgot zzd;
    public static final zzgot zze;
    private final String zzf;

    static {
        zzgot.zza = new zzgot("SHA1");
        zzgot.zzb = new zzgot("SHA224");
        zzgot.zzc = new zzgot("SHA256");
        zzgot.zzd = new zzgot("SHA384");
        zzgot.zze = new zzgot("SHA512");
    }

    private zzgot(String s) {
        this.zzf = s;
    }

    @Override
    public final String toString() {
        return this.zzf;
    }
}

