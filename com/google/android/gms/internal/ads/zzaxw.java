package com.google.android.gms.internal.ads;

public final class zzaxw extends zzgxr implements zzgzd {
    private static final zzaxw zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzaxz zzd;
    private zzgwj zze;
    private zzgwj zzf;

    static {
        zzaxw zzaxw0 = new zzaxw();
        zzaxw.zza = zzaxw0;
        zzgxr.zzbZ(zzaxw.class, zzaxw0);
    }

    private zzaxw() {
        this.zze = zzgwj.zzb;
        this.zzf = zzgwj.zzb;
    }

    public static zzaxw zzb(zzgwj zzgwj0, zzgxb zzgxb0) throws zzgyg {
        return (zzaxw)zzgxr.zzbr(zzaxw.zza, zzgwj0, zzgxb0);
    }

    public final zzaxz zzc() {
        return this.zzd == null ? zzaxz.zzg() : this.zzd;
    }

    public final zzgwj zzd() {
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzaxw.zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
            }
            case 3: {
                return new zzaxw();
            }
            case 4: {
                return new zzaxu(null);
            }
            case 5: {
                return zzaxw.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzaxw.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzaxw.class;
                    synchronized(class0) {
                        zzgzk0 = zzaxw.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzaxw.zza);
                            zzaxw.zzb = zzgzk0;
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

    public final zzgwj zzf() {
        return this.zze;
    }
}

