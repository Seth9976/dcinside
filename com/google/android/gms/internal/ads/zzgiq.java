package com.google.android.gms.internal.ads;

public final class zzgiq {
    public static final zzgiq zza;
    public static final zzgiq zzb;
    public static final zzgiq zzc;
    private final String zzd;

    static {
        zzgiq.zza = new zzgiq("TINK");
        zzgiq.zzb = new zzgiq("CRUNCHY");
        zzgiq.zzc = new zzgiq("NO_PREFIX");
    }

    private zzgiq(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

