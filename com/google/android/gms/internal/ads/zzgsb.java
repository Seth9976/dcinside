package com.google.android.gms.internal.ads;

public final class zzgsb extends zzgxr implements zzgzd {
    private static final zzgsb zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgsh zze;
    private zzgwj zzf;

    static {
        zzgsb zzgsb0 = new zzgsb();
        zzgsb.zza = zzgsb0;
        zzgxr.zzbZ(zzgsb.class, zzgsb0);
    }

    private zzgsb() {
        this.zzf = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgrz zzb() {
        return (zzgrz)zzgsb.zza.zzaZ();
    }

    public static zzgsb zzd() {
        return zzgsb.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgsb.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgsb();
            }
            case 4: {
                return new zzgrz(null);
            }
            case 5: {
                return zzgsb.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgsb.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgsb.class;
                    synchronized(class0) {
                        zzgzk0 = zzgsb.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgsb.zza);
                            zzgsb.zzb = zzgzk0;
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

    public static zzgsb zzf(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgsb)zzgxr.zzbr(zzgsb.zza, zzgwj0, zzgxb0);
    }

    public final zzgsh zzg() {
        return this.zze == null ? zzgsh.zzf() : this.zze;
    }

    public final zzgwj zzh() {
        return this.zzf;
    }

    public static zzgzk zzi() {
        return zzgsb.zza.zzbN();
    }

    static void zzk(zzgsb zzgsb0, zzgsh zzgsh0) {
        zzgsh0.getClass();
        zzgsb0.zze = zzgsh0;
        zzgsb0.zzc |= 1;
    }
}

