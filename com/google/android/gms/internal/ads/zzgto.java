package com.google.android.gms.internal.ads;

public final class zzgto extends zzgxr implements zzgzd {
    private static final zzgto zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private zzgsp zze;

    static {
        zzgto zzgto0 = new zzgto();
        zzgto.zza = zzgto0;
        zzgxr.zzbZ(zzgto.class, zzgto0);
    }

    private zzgto() {
        this.zzd = "";
    }

    public final zzgsp zza() {
        return this.zze == null ? zzgsp.zzd() : this.zze;
    }

    public static zzgtm zzb() {
        return (zzgtm)zzgto.zza.zzaZ();
    }

    public static zzgto zzd() {
        return zzgto.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgto.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgto();
            }
            case 4: {
                return new zzgtm(null);
            }
            case 5: {
                return zzgto.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgto.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgto.class;
                    synchronized(class0) {
                        zzgzk0 = zzgto.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgto.zza);
                            zzgto.zzb = zzgzk0;
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

    public static zzgto zzf(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgto)zzgxr.zzbr(zzgto.zza, zzgwj0, zzgxb0);
    }

    public final String zzg() [...] // 潜在的解密器

    static void zzh(zzgto zzgto0, zzgsp zzgsp0) {
        zzgsp0.getClass();
        zzgto0.zze = zzgsp0;
        zzgto0.zzc |= 1;
    }

    static void zzi(zzgto zzgto0, String s) {
        s.getClass();
        zzgto0.zzd = s;
    }
}

