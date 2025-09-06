package com.google.android.gms.internal.ads;

public final class zzgqe extends zzgxr implements zzgzd {
    private static final zzgqe zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private zzgqh zze;

    static {
        zzgqe zzgqe0 = new zzgqe();
        zzgqe.zza = zzgqe0;
        zzgxr.zzbZ(zzgqe.class, zzgqe0);
    }

    public final int zza() {
        return this.zzd;
    }

    public static zzgqc zzb() {
        return (zzgqc)zzgqe.zza.zzaZ();
    }

    public static zzgqe zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgqe)zzgxr.zzbr(zzgqe.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgqe.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000B\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgqe();
            }
            case 4: {
                return new zzgqc(null);
            }
            case 5: {
                return zzgqe.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgqe.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgqe.class;
                    synchronized(class0) {
                        zzgzk0 = zzgqe.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgqe.zza);
                            zzgqe.zzb = zzgzk0;
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
        return this.zze == null ? zzgqh.zzd() : this.zze;
    }

    static void zzh(zzgqe zzgqe0, zzgqh zzgqh0) {
        zzgqh0.getClass();
        zzgqe0.zze = zzgqh0;
        zzgqe0.zzc |= 1;
    }
}

