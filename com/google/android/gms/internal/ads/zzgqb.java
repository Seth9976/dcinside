package com.google.android.gms.internal.ads;

public final class zzgqb extends zzgxr implements zzgzd {
    private static final zzgqb zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgwj zze;
    private zzgqh zzf;

    static {
        zzgqb zzgqb0 = new zzgqb();
        zzgqb.zza = zzgqb0;
        zzgxr.zzbZ(zzgqb.class, zzgqb0);
    }

    private zzgqb() {
        this.zze = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgpz zzb() {
        return (zzgpz)zzgqb.zza.zzaZ();
    }

    public static zzgqb zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgqb)zzgxr.zzbr(zzgqb.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqb.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgqb();
            }
            case 4: {
                return new zzgpz(null);
            }
            case 5: {
                return zzgqb.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqb.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqb.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqb.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqb.zza);
                            zzgqb.zzb = zzgzk0;
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

    public final zzgqh zzf() {
        return this.zzf == null ? zzgqh.zzd() : this.zzf;
    }

    public final zzgwj zzg() {
        return this.zze;
    }

    public static zzgzk zzh() {
        return zzgqb.zza.zzbN();
    }

    static void zzj(zzgqb zzgqb0, zzgqh zzgqh0) {
        zzgqh0.getClass();
        zzgqb0.zzf = zzgqh0;
        zzgqb0.zzc |= 1;
    }
}

