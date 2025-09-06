package com.google.android.gms.internal.ads;

public final class zzgij {
    public static final zzgij zza;
    public static final zzgij zzb;
    private final String zzc;

    static {
        zzgij.zza = new zzgij("TINK");
        zzgij.zzb = new zzgij("NO_PREFIX");
    }

    private zzgij(String s) {
        this.zzc = s;
    }

    @Override
    public final String toString() {
        return this.zzc;
    }
}

