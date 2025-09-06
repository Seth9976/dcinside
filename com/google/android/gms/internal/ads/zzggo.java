package com.google.android.gms.internal.ads;

public final class zzggo {
    public static final zzggo zza;
    public static final zzggo zzb;
    public static final zzggo zzc;
    private final String zzd;

    static {
        zzggo.zza = new zzggo("TINK");
        zzggo.zzb = new zzggo("CRUNCHY");
        zzggo.zzc = new zzggo("NO_PREFIX");
    }

    private zzggo(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

