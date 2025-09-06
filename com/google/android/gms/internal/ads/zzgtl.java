package com.google.android.gms.internal.ads;

public final class zzgtl extends zzgxr implements zzgzd {
    private static final zzgtl zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgto zze;

    static {
        zzgtl zzgtl0 = new zzgtl();
        zzgtl.zza = zzgtl0;
        zzgxr.zzbZ(zzgtl.class, zzgtl0);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgtj zzb() {
        return (zzgtj)zzgtl.zza.zzaZ();
    }

    public static zzgtl zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgtl)zzgxr.zzbr(zzgtl.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgtl.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgtl();
            }
            case 4: {
                return new zzgtj(null);
            }
            case 5: {
                return zzgtl.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgtl.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgtl.class;
                    synchronized(class0) {
                        zzgzk0 = zzgtl.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgtl.zza);
                            zzgtl.zzb = zzgzk0;
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

    public final zzgto zzf() {
        return this.zze == null ? zzgto.zzd() : this.zze;
    }

    public static zzgzk zzg() {
        return zzgtl.zza.zzbN();
    }

    static void zzh(zzgtl zzgtl0, zzgto zzgto0) {
        zzgto0.getClass();
        zzgtl0.zze = zzgto0;
        zzgtl0.zzc |= 1;
    }
}

