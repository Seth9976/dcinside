package com.google.android.gms.internal.ads;

public final class zzatg extends zzgxr implements zzgzd {
    private static final zzatg zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private String zzg;
    private long zzh;

    static {
        zzatg zzatg0 = new zzatg();
        zzatg.zza = zzatg0;
        zzgxr.zzbZ(zzatg.class, zzatg0);
    }

    private zzatg() {
        this.zzd = "";
        this.zze = "";
        this.zzg = "D";
    }

    public static zzatf zza() {
        return (zzatf)zzatg.zza.zzaZ();
    }

    static void zzc(zzatg zzatg0, String s) {
        zzatg0.zzc |= 1;
        zzatg0.zzd = "1.671910402";
    }

    static void zzd(zzatg zzatg0, String s) {
        s.getClass();
        zzatg0.zzc |= 2;
        zzatg0.zze = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzatg.zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            }
            case 3: {
                return new zzatg();
            }
            case 4: {
                return new zzatf(null);
            }
            case 5: {
                return zzatg.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzatg.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzatg.class;
                    synchronized(class0) {
                        zzgzk0 = zzatg.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzatg.zza);
                            zzatg.zzb = zzgzk0;
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

    static void zzf(zzatg zzatg0, String s) {
        s.getClass();
        zzatg0.zzc |= 8;
        zzatg0.zzg = s;
    }

    static void zzg(zzatg zzatg0, long v) {
        zzatg0.zzc |= 4;
        zzatg0.zzf = v;
    }

    static void zzh(zzatg zzatg0, long v) {
        zzatg0.zzc |= 16;
        zzatg0.zzh = v;
    }
}

