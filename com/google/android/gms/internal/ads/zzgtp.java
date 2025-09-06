package com.google.android.gms.internal.ads;

public enum zzgtp implements zzgxv {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    private zzgtp(int v1) {
        this.zzh = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        if(this == zzgtp.zzf) {
            throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
        }
        return this.zzh;
    }

    public static zzgtp zzb(int v) {
        switch(v) {
            case 0: {
                return zzgtp.zza;
            }
            case 1: {
                return zzgtp.zzb;
            }
            case 2: {
                return zzgtp.zzc;
            }
            case 3: {
                return zzgtp.zzd;
            }
            case 4: {
                return zzgtp.zze;
            }
            default: {
                return null;
            }
        }
    }
}

