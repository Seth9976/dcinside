package com.google.android.gms.internal.ads;

public final class zzflc {
    private final String zza;
    private final String zzb;

    private zzflc(String s, String s1) {
        this.zza = s;
        this.zzb = s1;
    }

    public static zzflc zza(String s, String s1) {
        zzfmk.zzb(s, "Name is null or empty");
        zzfmk.zzb(s1, "Version is null or empty");
        return new zzflc(s, s1);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}

