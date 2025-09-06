package com.google.android.gms.internal.ads;

public final class zzgfh {
    public static final zzgfh zza;
    public static final zzgfh zzb;
    public static final zzgfh zzc;
    public static final zzgfh zzd;
    public static final zzgfh zze;
    private final String zzf;

    static {
        zzgfh.zza = new zzgfh("SHA1");
        zzgfh.zzb = new zzgfh("SHA224");
        zzgfh.zzc = new zzgfh("SHA256");
        zzgfh.zzd = new zzgfh("SHA384");
        zzgfh.zze = new zzgfh("SHA512");
    }

    private zzgfh(String s) {
        this.zzf = s;
    }

    @Override
    public final String toString() {
        return this.zzf;
    }
}

