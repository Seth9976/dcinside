package com.google.android.gms.internal.ads;

public enum zzbbq.zzd.zza implements zzgxv {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);

    public static final int zzl = 0;
    public static final int zzm = 1;
    public static final int zzn = 2;
    public static final int zzo = 3;
    public static final int zzp = 4;
    public static final int zzq = 5;
    public static final int zzr = 6;
    public static final int zzs = 7;
    public static final int zzt = 8;
    public static final int zzu = 9;
    public static final int zzv = 10;
    private static final zzgxw zzw;
    private final int zzy;

    static {
        zzbbq.zzd.zza.zzw = new zzgxw() {
            public zzbbq.zzd.zza zza(int v) {
                return zzbbq.zzd.zza.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zzd.zza(int v1) {
        this.zzy = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzy;
    }

    public static zzbbq.zzd.zza zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zzd.zza.zza;
            }
            case 1: {
                return zzbbq.zzd.zza.zzb;
            }
            case 2: {
                return zzbbq.zzd.zza.zzc;
            }
            case 3: {
                return zzbbq.zzd.zza.zzd;
            }
            case 4: {
                return zzbbq.zzd.zza.zze;
            }
            case 5: {
                return zzbbq.zzd.zza.zzf;
            }
            case 6: {
                return zzbbq.zzd.zza.zzg;
            }
            case 7: {
                return zzbbq.zzd.zza.zzh;
            }
            case 8: {
                return zzbbq.zzd.zza.zzi;
            }
            case 9: {
                return zzbbq.zzd.zza.zzj;
            }
            case 10: {
                return zzbbq.zzd.zza.zzk;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zzd.zza zzc(String s) {
        return (zzbbq.zzd.zza)Enum.valueOf(zzbbq.zzd.zza.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zzd.zza.zzw;
    }

    public static zzgxx zze() {
        return zzbbq.zzd.zza.zza.zza;
    }

    private static zzbbq.zzd.zza[] zzf() [...] // Inlined contents
}

