package com.google.android.gms.internal.ads;

public final class zzgta extends zzgxr implements zzgzd {
    private static final zzgta zza;
    private static volatile zzgzk zzb;
    private String zzc;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzgta zzgta0 = new zzgta();
        zzgta.zza = zzgta0;
        zzgxr.zzbZ(zzgta.class, zzgta0);
    }

    private zzgta() {
        this.zzc = "";
    }

    public static zzgsz zza() {
        return (zzgsz)zzgta.zza.zzaZ();
    }

    static void zzd(zzgta zzgta0, zzgtp zzgtp0) {
        zzgta0.zzf = zzgtp0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgta.zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000B\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgta();
            }
            case 4: {
                return new zzgsz(null);
            }
            case 5: {
                return zzgta.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgta.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgta.class;
                    synchronized(class0) {
                        zzgzk0 = zzgta.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgta.zza);
                            zzgta.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
            default: {
                throw null;
            }
        }
    }

    static void zzf(zzgta zzgta0, String s) {
        s.getClass();
        zzgta0.zzc = s;
    }

    static void zzg(zzgta zzgta0, int v) {
        zzgta0.zzd = zzgsm.zza(v);
    }
}

