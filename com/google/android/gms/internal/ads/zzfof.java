package com.google.android.gms.internal.ads;

public final class zzfof extends zzgxr implements zzgzd {
    private static final zzfof zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgxz zzd;
    private String zze;
    private String zzf;
    private String zzg;

    static {
        zzfof zzfof0 = new zzfof();
        zzfof.zza = zzfof0;
        zzgxr.zzbZ(zzfof.class, zzfof0);
    }

    private zzfof() {
        this.zzd = zzgxr.zzbG();
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
    }

    public static zzfod zza() {
        return (zzfod)zzfof.zza.zzaZ();
    }

    static void zzc(zzfof zzfof0, String s) {
        s.getClass();
        zzfof0.zzc |= 1;
        zzfof0.zze = s;
    }

    static void zzd(zzfof zzfof0, int v) {
        zzgxz zzgxz0 = zzfof0.zzd;
        if(!zzgxz0.zzc()) {
            zzfof0.zzd = zzgxr.zzbH(zzgxz0);
        }
        zzfof0.zzd.zzi(2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzfof.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfoc.zza, "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzfof();
            }
            case 4: {
                return new zzfod(null);
            }
            case 5: {
                return zzfof.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzfof.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzfof.class;
                    synchronized(class0) {
                        zzgzk0 = zzfof.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzfof.zza);
                            zzfof.zzb = zzgzk0;
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
}

