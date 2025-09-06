package com.google.android.gms.internal.ads;

public final class zzgtf extends zzgxr implements zzgzd {
    private static final zzgtf zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgti zze;

    static {
        zzgtf zzgtf0 = new zzgtf();
        zzgtf.zza = zzgtf0;
        zzgxr.zzbZ(zzgtf.class, zzgtf0);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgtd zzb() {
        return (zzgtd)zzgtf.zza.zzaZ();
    }

    public static zzgtf zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgtf)zzgxr.zzbr(zzgtf.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgtf.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgtf();
            }
            case 4: {
                return new zzgtd(null);
            }
            case 5: {
                return zzgtf.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgtf.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgtf.class;
                    synchronized(class0) {
                        zzgzk0 = zzgtf.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgtf.zza);
                            zzgtf.zzb = zzgzk0;
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

    public final zzgti zzf() {
        return this.zze == null ? zzgti.zzc() : this.zze;
    }

    public static zzgzk zzg() {
        return zzgtf.zza.zzbN();
    }

    static void zzh(zzgtf zzgtf0, zzgti zzgti0) {
        zzgti0.getClass();
        zzgtf0.zze = zzgti0;
        zzgtf0.zzc |= 1;
    }
}

