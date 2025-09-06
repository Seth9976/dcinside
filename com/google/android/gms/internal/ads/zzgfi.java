package com.google.android.gms.internal.ads;

public final class zzgfi {
    public static final zzgfi zza;
    public static final zzgfi zzb;
    public static final zzgfi zzc;
    private final String zzd;

    static {
        zzgfi.zza = new zzgfi("TINK");
        zzgfi.zzb = new zzgfi("CRUNCHY");
        zzgfi.zzc = new zzgfi("NO_PREFIX");
    }

    private zzgfi(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

