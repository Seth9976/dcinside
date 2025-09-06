package com.google.android.gms.internal.ads;

public final class zzggv {
    public static final zzggv zza;
    public static final zzggv zzb;
    public static final zzggv zzc;
    private final String zzd;

    static {
        zzggv.zza = new zzggv("TINK");
        zzggv.zzb = new zzggv("CRUNCHY");
        zzggv.zzc = new zzggv("NO_PREFIX");
    }

    private zzggv(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

