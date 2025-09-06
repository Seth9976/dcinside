package com.google.android.gms.internal.ads;

public enum zzbbq.zzab.zzc implements zzgxv {
    NETWORKTYPE_UNSPECIFIED(0),
    CELL(1),
    WIFI(2);

    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;
    private static final zzgxw zzg;
    private final int zzi;

    static {
        zzbbq.zzab.zzc.zzg = new zzgxw() {
            public zzbbq.zzab.zzc zza(int v) {
                return zzbbq.zzab.zzc.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzab.zzc(int v1) {
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

    public static zzbbq.zzab.zzc zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzab.zzc.zza;
            }
            case 1: {
                return zzbbq.zzab.zzc.zzb;
            }
            case 2: {
                return zzbbq.zzab.zzc.zzc;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzab.zzc zzc(String s) {
        return (zzbbq.zzab.zzc)Enum.valueOf(zzbbq.zzab.zzc.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzab.zzc.zzg;
    }

    public static zzgxx zze() {
        return zzbbq.zzab.zzc.zza.zza;
    }

    private static zzbbq.zzab.zzc[] zzf() [...] // Inlined contents
}

