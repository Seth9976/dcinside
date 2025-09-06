package com.google.android.gms.internal.ads;

public enum zzbbq.zzab.zzb implements zzgxv {
    CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
    TWO_G(1),
    THREE_G(2),
    LTE(4);

    public static final int zze = 0;
    public static final int zzf = 1;
    public static final int zzg = 2;
    public static final int zzh = 4;
    private static final zzgxw zzi;
    private final int zzk;

    static {
        zzbbq.zzab.zzb.zzi = new zzgxw() {
            public zzbbq.zzab.zzb zza(int v) {
                return zzbbq.zzab.zzb.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzab.zzb(int v1) {
        this.zzk = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzk;
    }

    public static zzbbq.zzab.zzb zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzab.zzb.zza;
            }
            case 1: {
                return zzbbq.zzab.zzb.zzb;
            }
            case 2: {
                return zzbbq.zzab.zzb.zzc;
            }
            case 4: {
                return zzbbq.zzab.zzb.zzd;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzab.zzb zzc(String s) {
        return (zzbbq.zzab.zzb)Enum.valueOf(zzbbq.zzab.zzb.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzab.zzb.zzi;
    }

    public static zzgxx zze() {
        return zzbbq.zzab.zzb.zza.zza;
    }

    private static zzbbq.zzab.zzb[] zzf() [...] // Inlined contents
}

