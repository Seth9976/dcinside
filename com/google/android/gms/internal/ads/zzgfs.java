package com.google.android.gms.internal.ads;

public final class zzgfs {
    public static final zzgfs zza;
    public static final zzgfs zzb;
    public static final zzgfs zzc;
    private final String zzd;

    static {
        zzgfs.zza = new zzgfs("TINK");
        zzgfs.zzb = new zzgfs("CRUNCHY");
        zzgfs.zzc = new zzgfs("NO_PREFIX");
    }

    private zzgfs(String s) {
        this.zzd = s;
    }

    @Override
    public final String toString() {
        return this.zzd;
    }
}

