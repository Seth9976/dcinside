package com.google.android.gms.internal.ads;

public final class zzgse extends zzgxr implements zzgzd {
    private static final zzgse zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgsh zzd;
    private int zze;
    private int zzf;

    static {
        zzgse zzgse0 = new zzgse();
        zzgse.zza = zzgse0;
        zzgxr.zzbZ(zzgse.class, zzgse0);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzgsc zzc() {
        return (zzgsc)zzgse.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgse.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000B\u0003\u000B", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgse();
            }
            case 4: {
                return new zzgsc(null);
            }
            case 5: {
                return zzgse.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgse.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgse.class;
                    synchronized(class0) {
                        zzgzk0 = zzgse.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgse.zza);
                            zzgse.zzb = zzgzk0;
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

    public static zzgse zzf() {
        return zzgse.zza;
    }

    public static zzgse zzg(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgse)zzgxr.zzbr(zzgse.zza, zzgwj0, zzgxb0);
    }

    public final zzgsh zzh() {
        return this.zzd == null ? zzgsh.zzf() : this.zzd;
    }

    static void zzj(zzgse zzgse0, zzgsh zzgsh0) {
        zzgsh0.getClass();
        zzgse0.zzd = zzgsh0;
        zzgse0.zzc |= 1;
    }
}

