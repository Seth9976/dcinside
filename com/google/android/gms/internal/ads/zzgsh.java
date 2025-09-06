package com.google.android.gms.internal.ads;

public final class zzgsh extends zzgxr implements zzgzd {
    private static final zzgsh zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;

    static {
        zzgsh zzgsh0 = new zzgsh();
        zzgsh.zza = zzgsh0;
        zzgxr.zzbZ(zzgsh.class, zzgsh0);
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgry zzb() {
        switch(this.zzc) {
            case 0: {
                return zzgry.zza == null ? zzgry.zzg : zzgry.zza;
            }
            case 1: {
                return zzgry.zzb == null ? zzgry.zzg : zzgry.zzb;
            }
            case 2: {
                return zzgry.zzc == null ? zzgry.zzg : zzgry.zzc;
            }
            case 3: {
                return zzgry.zzd == null ? zzgry.zzg : zzgry.zzd;
            }
            case 4: {
                return zzgry.zze == null ? zzgry.zzg : zzgry.zze;
            }
            case 5: {
                return zzgry.zzf == null ? zzgry.zzg : zzgry.zzf;
            }
            default: {
                return zzgry.zzg;
            }
        }
    }

    public static zzgsf zzc() {
        return (zzgsf)zzgsh.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgsh.zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000B", new Object[]{"zzc", "zzd"});
            }
            case 3: {
                return new zzgsh();
            }
            case 4: {
                return new zzgsf(null);
            }
            case 5: {
                return zzgsh.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgsh.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgsh.class;
                    synchronized(class0) {
                        zzgzk0 = zzgsh.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgsh.zza);
                            zzgsh.zzb = zzgzk0;
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

    public static zzgsh zzf() {
        return zzgsh.zza;
    }

    static void zzg(zzgsh zzgsh0, zzgry zzgry0) {
        zzgsh0.zzc = zzgry0.zza();
    }
}

