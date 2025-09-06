package com.google.android.gms.internal.ads;

public enum zzbbq.zzo.zzb implements zzgxv {
    PLATFORM_UNSPECIFIED(0),
    IOS(1),
    ANDROID(2);

    public static final int zzd = 0;
    public static final int zze = 1;
    public static final int zzf = 2;
    private static final zzgxw zzg;
    private final int zzi;

    static {
        zzbbq.zzo.zzb.zzg = new zzgxw() {
            public zzbbq.zzo.zzb zza(int v) {
                return zzbbq.zzo.zzb.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzo.zzb(int v1) {
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

    public static zzbbq.zzo.zzb zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzo.zzb.zza;
            }
            case 1: {
                return zzbbq.zzo.zzb.zzb;
            }
            case 2: {
                return zzbbq.zzo.zzb.zzc;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzo.zzb zzc(String s) {
        return (zzbbq.zzo.zzb)Enum.valueOf(zzbbq.zzo.zzb.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzo.zzb.zzg;
    }

    public static zzgxx zze() {
        return zzbbq.zzo.zzb.zza.zza;
    }

    private static zzbbq.zzo.zzb[] zzf() [...] // Inlined contents
}

