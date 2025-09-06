package com.google.android.gms.internal.ads;

public final class zzgqk extends zzgxr implements zzgzd {
    private static final zzgqk zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqq zze;
    private zzgsb zzf;

    static {
        zzgqk zzgqk0 = new zzgqk();
        zzgqk.zza = zzgqk0;
        zzgxr.zzbZ(zzgqk.class, zzgqk0);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgqi zzb() {
        return (zzgqi)zzgqk.zza.zzaZ();
    }

    public static zzgqk zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgqk)zzgxr.zzbr(zzgqk.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqk.zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzgqk();
            }
            case 4: {
                return new zzgqi(null);
            }
            case 5: {
                return zzgqk.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqk.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqk.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqk.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqk.zza);
                            zzgqk.zzb = zzgzk0;
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

    public final zzgqq zzf() {
        return this.zze == null ? zzgqq.zzd() : this.zze;
    }

    public final zzgsb zzg() {
        return this.zzf == null ? zzgsb.zzd() : this.zzf;
    }

    public static zzgzk zzh() {
        return zzgqk.zza.zzbN();
    }

    static void zzi(zzgqk zzgqk0, zzgqq zzgqq0) {
        zzgqq0.getClass();
        zzgqk0.zze = zzgqq0;
        zzgqk0.zzc |= 1;
    }

    static void zzj(zzgqk zzgqk0, zzgsb zzgsb0) {
        zzgsb0.getClass();
        zzgqk0.zzf = zzgsb0;
        zzgqk0.zzc |= 2;
    }
}

