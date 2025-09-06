package com.google.android.gms.internal.ads;

public final class zzhcp extends zzgxr implements zzgzd {
    private static final zzhcp zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzhcp zzhcp0 = new zzhcp();
        zzhcp.zza = zzhcp0;
        zzgxr.zzbZ(zzhcp.class, zzhcp0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        switch(zzgxq0.ordinal()) {
            case 0: {
                return (byte)1;
            }
            case 2: {
                return zzgxr.zzbQ(zzhcp.zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzc", "zzd", zzhco.zza, "zze", "zzf", "zzg"});
            }
            case 3: {
                return new zzhcp();
            }
            case 4: {
                return new zzhcn(null);
            }
            case 5: {
                return zzhcp.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhcp.zzb;
                if(zzgzk0 == null) {
                    Class class0 = zzhcp.class;
                    synchronized(class0) {
                        zzgzk0 = zzhcp.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhcp.zza);
                            zzhcp.zzb = zzgzk0;
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
}

