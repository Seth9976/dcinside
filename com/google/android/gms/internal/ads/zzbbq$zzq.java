package com.google.android.gms.internal.ads;

public enum zzbbq.zzq implements zzgxv {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);

    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 1000;
    private static final zzgxw zzg;
    private final int zzi;

    static {
        zzbbq.zzq.zzg = new zzgxw() {
            public zzbbq.zzq zza(int v) {
                return zzbbq.zzq.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzq(int v1) {
        this.zzi = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzi;
    }

    public static zzbbq.zzq zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzq.zza;
            }
            case 1: {
                return zzbbq.zzq.zzb;
            }
            case 1000: {
                return zzbbq.zzq.zzc;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzq zzc(String s) {
        return (zzbbq.zzq)Enum.valueOf(zzbbq.zzq.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzq.zzg;
    }

    public static zzgxx zze() {
        return zzbbq.zzq.zza.zza;
    }

    private static zzbbq.zzq[] zzf() [...] // Inlined contents
}

