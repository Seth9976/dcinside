package com.google.android.gms.internal.ads;

public final class zzgho {
    public static final zzgho zza;
    public static final zzgho zzb;
    public static final zzgho zzc;
    public static final zzgho zzd;
    public static final zzgho zze;
    public static final zzgho zzf;
    private final String zzg;

    static {
        zzgho.zza = new zzgho("ASSUME_AES_GCM");
        zzgho.zzb = new zzgho("ASSUME_XCHACHA20POLY1305");
        zzgho.zzc = new zzgho("ASSUME_CHACHA20POLY1305");
        zzgho.zzd = new zzgho("ASSUME_AES_CTR_HMAC");
        zzgho.zze = new zzgho("ASSUME_AES_EAX");
        zzgho.zzf = new zzgho("ASSUME_AES_GCM_SIV");
    }

    private zzgho(String s) {
        this.zzg = s;
    }

    @Override
    public final String toString() {
        return this.zzg;
    }
}

