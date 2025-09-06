package com.google.android.gms.internal.ads;

public enum zzbbq.zzb.zzd implements zzgxv {
    UNSPECIFIED(0),
    IN_MEMORY(1);

    public static final int zzc = 0;
    public static final int zzd = 1;
    private static final zzgxw zze;
    private final int zzg;

    static {
        zzbbq.zzb.zzd.zze = new zzgxw() {
            public zzbbq.zzb.zzd zza(int v) {
                return zzbbq.zzb.zzd.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzb.zzd(int v1) {
        this.zzg = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzg;
    }

    public static zzbbq.zzb.zzd zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzb.zzd.zza;
            }
            case 1: {
                return zzbbq.zzb.zzd.zzb;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzb.zzd zzc(String s) {
        return (zzbbq.zzb.zzd)Enum.valueOf(zzbbq.zzb.zzd.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzb.zzd.zze;
    }

    public static zzgxx zze() {
        return zzbbq.zzb.zzd.zza.zza;
    }

    private static zzbbq.zzb.zzd[] zzf() [...] // Inlined contents
}

