package com.google.android.gms.internal.ads;

public final class zzgsp extends zzgxr implements zzgzd {
    private static final zzgsp zza;
    private static volatile zzgzk zzb;
    private String zzc;
    private zzgwj zzd;
    private int zze;

    static {
        zzgsp zzgsp0 = new zzgsp();
        zzgsp.zza = zzgsp0;
        zzgxr.zzbZ(zzgsp.class, zzgsp0);
    }

    private zzgsp() {
        this.zzc = "";
        this.zzd = zzgwj.zzb;
    }

    public static zzgsn zza() {
        return (zzgsn)zzgsp.zza.zzaZ();
    }

    public static zzgsn zzb(zzgsp zzgsp0) {
        return (zzgsn)zzgsp.zza.zzba(zzgsp0);
    }

    public static zzgsp zzd() {
        return zzgsp.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgsp.zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgsp();
            }
            case 4: {
                return new zzgsn(null);
            }
            case 5: {
                return zzgsp.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgsp.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgsp.class;
                    synchronized(class0) {
                        zzgzk0 = zzgsp.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgsp.zza);
                            zzgsp.zzb = zzgzk0;
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

    public static zzgsp zzf(byte[] arr_b, zzgxb zzgxb0) throws zzgyg {
        return (zzgsp)zzgxr.zzbx(zzgsp.zza, arr_b, zzgxb0);
    }

    public final zzgtp zzg() {
        zzgtp zzgtp0 = zzgtp.zzb(this.zze);
        return zzgtp0 == null ? zzgtp.zzf : zzgtp0;
    }

    public final zzgwj zzh() {
        return this.zzd;
    }

    public final String zzi() [...] // 潜在的解密器

    static void zzj(zzgsp zzgsp0, zzgtp zzgtp0) {
        zzgsp0.zze = zzgtp0.zza();
    }

    static void zzk(zzgsp zzgsp0, String s) {
        s.getClass();
        zzgsp0.zzc = s;
    }

    static void zzl(zzgsp zzgsp0, zzgwj zzgwj0) {
        zzgwj0.getClass();
        zzgsp0.zzd = zzgwj0;
    }
}

