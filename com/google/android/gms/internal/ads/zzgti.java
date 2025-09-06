package com.google.android.gms.internal.ads;

public final class zzgti extends zzgxr implements zzgzd {
    private static final zzgti zza;
    private static volatile zzgzk zzb;
    private String zzc;

    static {
        zzgti zzgti0 = new zzgti();
        zzgti.zza = zzgti0;
        zzgxr.zzbZ(zzgti.class, zzgti0);
    }

    private zzgti() {
        this.zzc = "";
    }

    public static zzgtg zza() {
        return (zzgtg)zzgti.zza.zzaZ();
    }

    public static zzgti zzc() {
        return zzgti.zza;
    }

    public static zzgti zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgti)zzgxr.zzbr(zzgti.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgti.zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
            }
            case 3: {
                return new zzgti();
            }
            case 4: {
                return new zzgtg(null);
            }
            case 5: {
                return zzgti.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgti.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgti.class;
                    synchronized(class0) {
                        zzgzk0 = zzgti.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgti.zza);
                            zzgti.zzb = zzgzk0;
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

    public final String zzf() [...] // 潜在的解密器

    static void zzg(zzgti zzgti0, String s) {
        s.getClass();
        zzgti0.zzc = s;
    }
}

