package com.google.android.gms.internal.ads;

public final class zzgrc extends zzgxr implements zzgzd {
    private static final zzgrc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgrf zzd;
    private int zze;

    static {
        zzgrc zzgrc0 = new zzgrc();
        zzgrc.zza = zzgrc0;
        zzgxr.zzbZ(zzgrc.class, zzgrc0);
    }

    public final int zza() {
        return this.zze;
    }

    public static zzgra zzb() {
        return (zzgra)zzgrc.zza.zzaZ();
    }

    public static zzgrc zzd(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzgrc)zzgxr.zzbr(zzgrc.zza, zzgwj0, zzgxb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzgrc.zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000B", new Object[]{"zzc", "zzd", "zze"});
            }
            case 3: {
                return new zzgrc();
            }
            case 4: {
                return new zzgra(null);
            }
            case 5: {
                return zzgrc.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzgrc.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzgrc.class;
                    synchronized(class0) {
                        zzgzk0 = zzgrc.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzgrc.zza);
                            zzgrc.zzb = zzgzk0;
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
        return this.zzd == null ? zzgrf.zzd() : this.zzd;
    }

    static void zzh(zzgrc zzgrc0, zzgrf zzgrf0) {
        zzgrf0.getClass();
        zzgrc0.zzd = zzgrf0;
        zzgrc0.zzc |= 1;
    }
}

