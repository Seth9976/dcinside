package com.google.android.gms.internal.ads;

public final class zzgqz extends zzgxr implements zzgzd {
    private static final zzgqz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgrf zze;
    private zzgwj zzf;

    static {
        zzgqz zzgqz0 = new zzgqz();
        zzgqz.zza = zzgqz0;
        zzgxr.zzbZ(zzgqz.class, zzgqz0);
    }

    private zzgqz() {
        this.zzf = zzgwj.zzb;
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgqx zzb() {
        return (zzgqx)zzgqz.zza.zzaZ();
    }

    public static zzgqz zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgqz)zzgxr.zzbr(zzgqz.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqz.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgqz();
            }
            case 4: {
                return new zzgqx(null);
            }
            case 5: {
                return zzgqz.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqz.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqz.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqz.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqz.zza);
                            zzgqz.zzb = zzgzk0;
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

    public final zzgrf zzf() {
        return this.zze == null ? zzgrf.zzd() : this.zze;
    }

    public final zzgwj zzg() {
        return this.zzf;
    }

    public static zzgzk zzh() {
        return zzgqz.zza.zzbN();
    }

    static void zzj(zzgqz zzgqz0, zzgrf zzgrf0) {
        zzgrf0.getClass();
        zzgqz0.zze = zzgrf0;
        zzgqz0.zzc |= 1;
    }
}

