package com.google.android.gms.internal.ads;

public final class zzfoj extends zzgxr implements zzgzd {
    private static final zzfoj zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private String zze;
    private String zzf;
    private zzfof zzg;

    static {
        zzfoj zzfoj0 = new zzfoj();
        zzfoj.zza = zzfoj0;
        zzgxr.zzbZ(zzfoj.class, zzfoj0);
    }

    private zzfoj() {
        this.zze = "";
        this.zzf = "";
    }

    public static zzfog zza() {
        return (zzfog)zzfoj.zza.zzaZ();
    }

    static void zzc(zzfoj zzfoj0, String s) {
        s.getClass();
        zzfoj0.zzc |= 2;
        zzfoj0.zze = s;
    }

    static void zzd(zzfoj zzfoj0, zzfof zzfof0) {
        zzfof0.getClass();
        zzfoj0.zzg = zzfof0;
        zzfoj0.zzc |= 8;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfoj.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfoh.zza, "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfoj();
            }
            case 4: {
                return new zzfog(null);
            }
            case 5: {
                return zzfoj.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfoj.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfoj.class;
                    synchronized(class0) {
                        zzgzk0 = zzfoj.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfoj.zza);
                            zzfoj.zzb = zzgzk0;
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

    static void zzf(zzfoj zzfoj0, int v) {
        zzfoj0.zzd = 1;
        zzfoj0.zzc |= 1;
    }
}

