package com.google.android.gms.internal.ads;

public final class zzgou {
    public static final zzgou zza;
    public static final zzgou zzb;
    public static final zzgou zzc;
    public static final zzgou zzd;
    private final String zze;

    static {
        zzgou.zza = new zzgou("TINK");
        zzgou.zzb = new zzgou("CRUNCHY");
        zzgou.zzc = new zzgou("LEGACY");
        zzgou.zzd = new zzgou("NO_PREFIX");
    }

    private zzgou(String s) {
        this.zze = s;
    }

    @Override
    public final String toString() {
        return this.zze;
    }
}

