package com.google.android.gms.internal.ads;

public final class zzggd {
    public static final zzggd zza;
    public static final zzggd zzb;
    public static final zzggd zzc;
    private final String zzd;

    static {
        zzggd.zza = new zzggd("TINK");
        zzggd.zzb = new zzggd("CRUNCHY");
        zzggd.zzc = new zzggd("NO_PREFIX");
    }

    private zzggd(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

