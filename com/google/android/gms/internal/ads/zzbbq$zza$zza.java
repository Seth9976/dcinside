package com.google.android.gms.internal.ads;

public enum zzbbq.zza.zza implements zzgxv {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    private final int zzA;
    public static final int zzm = 0;
    public static final int zzn = 1;
    public static final int zzo = 2;
    public static final int zzp = 3;
    public static final int zzq = 4;
    public static final int zzr = 5;
    public static final int zzs = 6;
    public static final int zzt = 7;
    public static final int zzu = 8;
    public static final int zzv = 9;
    public static final int zzw = 10;
    public static final int zzx = 11;
    private static final zzgxw zzy;

    static {
        zzbbq.zza.zza.zzy = new zzgxw() {
            public zzbbq.zza.zza zza(int v) {
                return zzbbq.zza.zza.zzb(v);
            }

            public zzgxv zzb(int v) {
                return this.zza(v);
            }
        };
    }

    private zzbbq.zza.zza(int v1) {
        this.zzA = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgxv
    public final int zza() {
        return this.zzA;
    }

    public static zzbbq.zza.zza zzb(int v) {
        switch(v) {
            case 0: {
                return zzbbq.zza.zza.zza;
            }
            case 1: {
                return zzbbq.zza.zza.zzb;
            }
            case 2: {
                return zzbbq.zza.zza.zzc;
            }
            case 3: {
                return zzbbq.zza.zza.zzd;
            }
            case 4: {
                return zzbbq.zza.zza.zze;
            }
            case 5: {
                return zzbbq.zza.zza.zzf;
            }
            case 6: {
                return zzbbq.zza.zza.zzg;
            }
            case 7: {
                return zzbbq.zza.zza.zzh;
            }
            case 8: {
                return zzbbq.zza.zza.zzi;
            }
            case 9: {
                return zzbbq.zza.zza.zzj;
            }
            case 10: {
                return zzbbq.zza.zza.zzk;
            }
            case 11: {
                return zzbbq.zza.zza.zzl;
            }
            default: {
                return null;
            }
        }
    }

    public static zzbbq.zza.zza zzc(String s) {
        return (zzbbq.zza.zza)Enum.valueOf(zzbbq.zza.zza.class, s);
    }

    public static zzgxw zzd() {
        return zzbbq.zza.zza.zzy;
    }

    public static zzgxx zze() {
        return zzbbq.zza.zza.zza.zza;
    }

    private static zzbbq.zza.zza[] zzf() [...] // Inlined contents
}

